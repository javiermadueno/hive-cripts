#Hive Scripts
Contine los archivos necesarios para la creación de bases de datos, tablas e importación de datos

###Uso

####Inicializar nueva Base de Datos
Para inicializar una nueva base de datos
```bash
$ ./hive_scripts.sh init --database c3
```

**WARNING**: Este comando borra, si la hubiera, cualquier base de datos con el mismo nombre.

Con este comando se le preguntará al usuario los siguientes datos de conexión de la base de datos:
 * `ip`
 * `puerto`
 * `nombre_usuario`
 * `password`

Con estos datos se creará el fichero de de parametros de conexión para esa base de datos en la carpeta `./parameters`.


####Importar todas las tablas de una base de datos concreta
```bash
$ ./hive_scripts.sh import --database c3 --csv path/compra.csv
```
Con este comando se realiza la importación de todas las tablas. Como se aprecia, es necesario indicar la ruta del fichero de compras que se quiere importar. En caso de no indicarlo se realizará la importación de todas las tables excepto de la tabla `compra`.

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
