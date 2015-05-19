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
	fecha_baja		TIMESTAMP, 
	tile 			STRING, 
	fecha__nacimiento  	DATE, 
	id_miembro_prog 	BIGINT,
	id_pos			INT, 
	robbinson   		STRING, 
	opt_in 			STRING, 
	genero 			STRING, 
	estado_marital 		STRING, 
	num_hijos 		INT, 
	tipo_vivienda 		STRING, 
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
	fecha_baja		TIMESTAMP, 
	tile 			STRING, 
	fecha__nacimiento  	DATE, 
	id_miembro_prog 	BIGINT,
	id_pos			INT, 
	robbinson   		STRING, 
	opt_in 			STRING, 
	genero 			STRING, 
	estado_marital 		STRING, 
	num_hijos 		INT, 
	tipo_vivienda 		STRING, 
	personalizado1 		STRING, 
	personalizado2  	STRING, 
	personalizado3  	STRING, 
	personalizado4 		STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',';



-- LOAD DATA INPATH '/user/${hiveconf:USER}/etl/${hiveconf:DATABASE}/cliente'
--OVERWRITE INTO TABLE cliente_temp;

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
	C.fecha_baja, 
	c.tile, 
	cast(c.fecha__nacimiento as date), 
	c.id_miembro_prog,
	c.id_pos, 
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


