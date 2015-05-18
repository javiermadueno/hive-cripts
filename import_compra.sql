CREATE DATABASE IF NOT EXISTS ${hiveconf:DATABASE};

USE ${hiveconf:DATABASE};



CREATE TABLE IF NOT EXISTS compra(
	id_compra		BIGINT, 
	id_ticket 		BIGINT,
	id_cliente		BIGINT,
	id_producto 	BIGINT,
	fecha 			STRING,
	cantidad_pagada FLOAT,
	unidades 		INT,
	id_pos 			INT, 
	cod_promocion 	STRING,
	id_tipo 		STRING,
	codigo_vale		STRING,
	personalizado1 	STRING,
	personalizado2 	STRING,
	personalizado3 	STRING)
PARTITIONED BY (fecha_part STRING);



CREATE EXTERNAL TABLE IF NOT EXISTS compra_temp(
	id_compra		BIGINT, 
	id_ticket 		BIGINT,
	id_cliente		BIGINT,
	id_producto 	BIGINT,
	fecha 			STRING,
	cantidad_pagada FLOAT,
	unidades 		INT,
	id_pos 			INT, 
	cod_promocion 	STRING,
	id_tipo 		STRING,
	codigo_vale		STRING,
	personalizado1 	STRING,
	personalizado2 	STRING,
	personalizado3 	STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\073';


LOAD DATA INPATH '/user/hive/tmp/compras'
OVERWRITE INTO TABLE compra_temp;

set hive.exec.dynamic.partition.mode=nonstrict;

INSERT INTO TABLE compra
PARTITION(fecha_part)
SELECT 
	c.id_compra,
	c.id_ticket,
	c.id_cliente,
	c.id_producto,
	from_unixtime(unix_timestamp(c.fecha,'dd/MM/yyyy HH:mm:ss')),
	c.cantidad_pagada,
	c.unidades,
	c.id_pos,
	c.cod_promocion,
	c.id_tipo,
	c.codigo_vale,
	c.personalizado1,
	c.personalizado2,
	c.personalizado3,
	from_unixtime(unix_timestamp(c.fecha,'dd/MM/yyyy HH:mm:ss'), 'yyyy-MM')
FROM compra_temp c;

set hive.exec.dynamic.partition.mode=strict;
