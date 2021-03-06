DROP DATABASE IF EXISTS ${hiveconf:DATABASE} CASCADE;

CREATE DATABASE IF NOT EXISTS ${hiveconf:DATABASE};

USE ${hiveconf:DATABASE};

CREATE TABLE IF NOT EXISTS compra(
	id_compra		BIGINT, 
	id_ticket 		BIGINT,
	id_cliente		BIGINT,
	id_producto 		BIGINT,
	fecha 			STRING,
	cantidad_pagada 	FLOAT,
	unidades 		INT,
	id_pos 			INT, 
	cod_promocion 		STRING,
	id_tipo 		STRING,
	codigo_vale		STRING,
	personalizado1 		STRING,
	personalizado2 		STRING,
	personalizado3 		STRING)
PARTITIONED BY (fecha_part STRING);



CREATE EXTERNAL TABLE IF NOT EXISTS compra_temp(
	id_compra		BIGINT, 
	id_ticket 		BIGINT,
	id_cliente		BIGINT,
	id_producto 		BIGINT,
	fecha 			STRING,
	cantidad_pagada 	FLOAT,
	unidades 		INT,
	id_pos 			INT, 
	cod_promocion 		STRING,
	id_tipo 		STRING,
	codigo_vale		STRING,
	personalizado1 		STRING,
	personalizado2 		STRING,
	personalizado3 		STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\073';


CREATE TABLE IF NOT EXISTS producto(
	id_producto 		BIGINT, 
	id_categoria 		BIGINT, 
	id_marca 		BIGINT, 
	id_proveedor 		BIGINT, 
	nombre 			STRING, 
	cod_sku 		STRING, 
	fecha_lanzamiento	TIMESTAMP, 
	precio_venta 		FLOAT, 
	precio_estandar 	FLOAT, 
	precio_unitario 	FLOAT, 
	volumen 		STRING, 
	activo 			INT, 
	id_categoria2 		BIGINT, 
	id_categoria3 		BIGINT, 
	id_categoria4 		BIGINT, 
	id_categoria5 		BIGINT, 
	id_categoria6 		BIGINT, 
	id_categoria7		BIGINT, 
	id_categoria8 		BIGINT, 
	id_categoria9 		BIGINT, 
	id_categoria10 		BIGINT, 
	id_categoria11 		BIGINT, 
	gama 			FLOAT) 
CLUSTERED BY (id_producto)  
INTO 4 BUCKETS; 

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


CREATE TABLE IF NOT EXISTS categoria(
	id_categoria 		BIGINT, 
	id_nivel_categoria 	INT,
	nombre			STRING, 
	asociado 		INT, 
	estado 			TINYINT);




