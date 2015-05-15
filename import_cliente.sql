CREATE DATABASE IF NOT EXISTS ${hiveconf:DATABASE};

USE ${hiveconf:DATABASE};

CREATE TABLE IF NOT EXISTS cliente(
	id_cliente 		BIGINT, 
	nombre 			STRING, 
	apellidos 		STRING, 
	numero_id  		BIGINT, 
	email 			STRING, 
	telefono 		STRING, 
	direccion1 		STRING,
	direccion2 		STRING, 
	cp 			STRING, 
	pais 			STRING, 
	estado 			STRING, 
	ciudad 			STRING, 
	fecha_union 		TIMESTAMP, 
	tile 			STRING, 
	fecha__nacimiento  	TIMESTAMP, 
	id_miembro_prog 	BIGINT, 
	robbinson   		STRING, 
	opt_in 			STRING, 
	genero 			INT , 
	estado_marital 		INT, 
	num_hijos 		INT, 
	tipo_vivienda 		INT, 
	personalizado1 		STRING, 
	personalizado2  	STRING, 
	personalizado3  	STRING, 
	personalizado4 		STRING)
CLUSTERED BY (id_cliente) 
INTO 4 BUCKETS;

CREATE TABLE IF NOT EXISTS cliente_temp(
	id_cliente 		BIGINT, 
	nombre 			STRING, 
	apellidos 		STRING, 
	numero_id  		BIGINT, 
	email 			STRING, 
	telefono 		STRING, 
	direccion1 		STRING,
	direccion2 		STRING, 
	cp 			STRING, 
	pais 			STRING, 
	estado 			STRING, 
	ciudad 			STRING, 
	fecha_union 		TIMESTAMP, 
	tile 			STRING, 
	fecha__nacimiento  	TIMESTAMP, 
	id_miembro_prog 	BIGINT, 
	robbinson   		STRING, 
	opt_in 			STRING, 
	genero 			INT , 
	estado_marital 		INT, 
	num_hijos 		INT, 
	tipo_vivienda 		INT, 
	personalizado1 		STRING, 
	personalizado2  	STRING, 
	personalizado3  	STRING, 
	personalizado4 		STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',';



LOAD DATA INPATH '/user/${hiveconf:USER}/etl/${hiveconf:DATABASE}/cliente'
OVERWRITE INTO TABLE cliente_temp;

SET hive.enforce.bucketing = true;

INSERT OVERWRITE TABLE cliente
SELECT 
	c.id_cliente, 
	c.nombre, 
	c.apellidos, 
	c.numero_id , 
	c.email, 
	c.telefono, 
	c.direccion1,
	c.direccion2, 
	c.cp, 
	c.pais, 
	c.estado, 
	c.ciudad, 
	c.fecha_union, 
	c.tile, 
	c.fecha__nacimiento, 
	c.id_miembro_prog, 
	c.robbinson, 
	c.opt_in, 
	c.genero, 
	c.estado_marital, 
	c.num_hijos, 
	c.tipo_vivienda, 
	c.personalizado1, 
	c.personalizado2, 
	c.personalizado3, 
	c.personalizado4
FROM cliente_temp c;

dfs -rm -r /user/${hiveconf:USER}/etl/${hiveconf:DATABASE}/cliente;


