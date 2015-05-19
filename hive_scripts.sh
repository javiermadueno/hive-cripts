#!/bin/bash
#hive_scripts.sh

# this will print the usage statements and exit
usage() {
	case $1 in
		"")
			echo ""
			echo "Uso: hive_scripts.sh command [options]"
			echo "      Para saber como se utiliza cada comando: --> hive_scripts.sh command -h|--help"
			echo "Comandos:"
			echo "      hive_scripts.sh init [options]"
			echo "      hive_scripts.sh import [options]"
			echo ""
			echo ""
			;;
		init)
			echo ""
			echo "Uso: hive_scripts.sh init [-h|--help]"
			echo ""
			echo "  Inicializa la base de datos para un cliente determinado:"
			echo ""
			echo "Params:"
			echo "      -d|--database database_name"
			echo "      -h|--help: imprime la ayuda"
			echo "Examples:"
			echo ""
			echo "		./hive_scripts.sh init -d c3 "
			echo "		./hive_scripts.sh init --database c3 "
			echo ""
			;;
		import)
			echo ""
			echo "Uso: hive_scripts.sh import [-h|--help]"
			echo ""
			echo "  Realiza una importacion de datos de la tabla especificada"
			echo ""
			echo "Params:"
			echo "      -d|--database database_name"
			echo "      -t|--table table_name"
			echo "      -h|--help: imprime la ayuda"
			echo "Examples:"
			echo ""
			echo "		./hive_scripts.sh import -d c3 -t compra --csv /compras/compras1.csv"
			echo "		./hive_scripts.sh import -d c3 -t cliente"
			echo "		./hive_scripts.sh import -d c3 -t segmento"
			echo "		./hive_scripts.sh import -d c3 -t categoria"
			echo "		./hive_scripts.sh import -d c3 -t producto"
			echo ""
			;;		
	esac
	exit
}

# this will process command line arguments enough to get you to a specific function
args() {
	echo "processing command request"
    case $1 in
        init)
            shift
            init $@
            ;;
        import)
            shift
            import $@
            ;;
        *)
            echo >&2 "Comando invalido: $1"
            usage
        	;;
    esac
}


init() {
	# init params
	database=""
	hive_script="database_init.sql"

	
	# process args for this block
	while test $# -gt 0
	do
	case $1 in
            -d|--database)
            	shift
            	database=$1
            	;;
            -h|--help)
            	usage "init"
            	;;
             *)
            	echo >&2 "Argumento no válido: $1"
            	usage "init"
        	    ;;
    	esac
    	shift
	done

	crea_archivo
	
	# determine if any option is missing	
	if [ x"$database" == "x" ]; then
		echo "missing database name: -d|--database database_name"
		usage "init"
	fi

	# echo the command used to run the hive hql script just because
	echo "hive -hiveconf DATABASE=$database -f $hive_script" 
	`hive -hiveconf DATABASE=$database -f $hive_script`
	exit
}

crea_archivo(){ 
file="parameters/$database.parameters"
	if [ -f $file ];
		then
		   echo "Leido el archivo de configuración $file"
		else
		   echo "El archivo de configuracion $file no existe. Por favor introduzca los siguientes datos para crearlo."
			echo "Introduzca la IP del servidor de base de datos:"
			read IP
			echo "Introduzca el puerto:"
			read PORT
			echo "Introduzca nombre de usuario:"
			read USERNAME
			echo "Introduzca contraseña:"
			read PASS
			echo -e "--connect\n jdbc:mysql://$IP:$PORT/$(echo $database | tr -cd '[[:digit:]]')\n --username\n $USERNAME\n --password\n $PASS" > $file
			if [ -f $file ];
			  then
			    echo "Fichero de configuración creado correctamente"
			  else
			    echo "Ha habido un problema al crear el fichero de configuración. No se puede continuar."
			    exit
			fi
	fi

	
	
		
}

import() {
	# init params
	database=""
	table=""
	hive_script="hive_script.hql"
	begin_date=""
	end_date=""
	csv=""

	# process args for this block
	while test $# -gt 0
	do
    case $1 in
    	     -b|--begin_date)
            	shift
            	begin_date=$1
            	;;
            -d|--database)
            	shift
            	database=$1
            	;;
            -e|--end_date)
            	shift
            	end_date=$1
            	;;
        	-h|--help)
            	usage "import"
            	;;
            -t|--table)
            	shift
            	table=$1
            	;;
	    --csv)
		shift
		csv=$1
		;;
               *)
            	echo >&2 "Invalid argument: $1"
            	usage "import"
        	    ;;
    	esac
    	shift
	done
	
	crea_archivo

	if [ x"$database" == "x" ]; then
		echo "missing database name: -d|--database database_name"
		usage "import"
	fi
	
	if [ x"$table" == "x" ]; then
		echo "missing table name: -t|--table table_name"
		usage "import"
	fi


	case $table in
    	    compra)
		importa_compras
            	;;
 	    cliente)
		importa_clientes
            	;;
            categoria)
		importa_categorias
            	;;
            producto)
		importa_productos
            	;;
	    segmento)
		importa_segmentos
            	;;
            *)
            	echo >&2 "Invalid argument: $table"
            	usage "import"
        	    ;;
    	esac
	
	exit
	
}

importa_compras(){
	if [ x"$csv" == "x" ]; then
		echo "falta la ruta del csv: --csv /path/file.csv"
		usage "import"
	fi

	echo "hadoop fs -mkdir -p /user/hive/tmp/compras"
	`hadoop fs -mkdir -p /user/hive/tmp/compras`
	echo "hadoop fs -copyFromLocal $csv /user/hive/tmp/compras"
	`hadoop fs -copyFromLocal $csv /user/hive/tmp/compras`
	echo "hive -hiveconf DATABASE=$database -f importa_compra.sql"
	`hive -hiveconf DATABASE=$database -f import_compra.sql`	
}

importa_clientes(){
	echo "Importando clientes..."
	echo "sqoop import  --connect jdbc:mysql://192.168.100.229:3306/$(echo $database | tr -cd '[[:digit:]]') \ "
	echo "  --table cliente -m 2 \ "
	echo "  --username=admin \ "
  	echo "  --password-file  /user/$USER/mysql.password"

	`sqoop import  --options-file ./parameters/$database.parameters \
	--table cliente \
	--direct \
	--warehouse-dir /user/$USER/etl/$database`
	
	echo "hive -hiveconf DATABASE=$database -hiveconf USER=$USER -f import_cliente.sql"
	`hive -hiveconf DATABASE=$database -hiveconf USER=$USER -f import_cliente.sql`
}

importa_categorias(){
	echo "Importa categorias..."
	
	`sqoop import --options-file ./parameters/$database.parameters \
	  --table categoria -m 2 \
	  --direct \
	  --warehouse-dir /user/$USER/etl/$database \
	  --hive-import --hive-table $database.categoria  --hive-overwrite`

	echo "hadoop fs -rm -r /user/$USER/etl/$database/categoria"
 	`hadoop fs -rm -r /user/$USER/etl/$database/categoria`
}

importa_productos(){
echo "importa productos"

	 `sqoop import  --options-file ./parameters/$database.parameters \
		--table producto -m 2 \
		--warehouse-dir /user/$USER/etl/$database \
		--hive-import --hive-table $database.producto --hive-overwrite`

	 echo "hadoop fs -rm -r /user/$USER/etl/$database/producto"
	res = $(hadoop fs -rm -r /user/$USER/etl/$database/producto)
	echo $res
}

importa_segmentos(){
echo "importa segmentos"


	 `sqoop import  --options-file ./parameters/$database.parameters \
		--table segmento -m 2 \
		--warehouse-dir /user/$USER/etl/$database \
		--hive-import --hive-table $database.segmento --hive-overwrite`

	 echo "hadoop fs -rm -r /user/$USER/etl/$database/segmento"
 	 $(`hadoop fs -rm -r /user/$USER/etl/$database/segmento`)

}

# -------------------------------------------------------------------------------------
# Beginning of script execution
#

args $@
