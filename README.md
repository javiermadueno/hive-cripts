#Hive Scripts
Contine los archivos necesarios para la creación de bases de datos, tablas e importación de datos

###Uso

Para empezar hay que copiar el archivo que contiene la contraseña de la base de datos
```bash
$ hadoop fs -put mysql.password /user/$USER/mysql.password
```

####Inicializar nueva Base de Datos
Para inicializar una nueva base de datos
```bash
$ ./hive_scripts.sh init --database c3
```

**WARNING**: Este comando borra, si la hubiera, cualquier base de datos con el mismo nombre.

####Importar una tabla a una base de datos concreta.
Table cliente
```bash
$ ./hive_scripts.sh import --database c3 --table cliente
```
Table categoria
```bash
$ ./hive_scripts.sh import --database c3 --table categoria
```
Tabla producto
```bash
$ ./hive_scripts.sh import --database c3 --table producto
```
Tabla compra
```bash
$ ./hive_scripts.sh import --database c3 --table compra --csv path/compra.csv
```
