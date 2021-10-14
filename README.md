Examen técnico 

Java JDK: 1.8+

Script Tablas
CREATE TABLE SUCURSALES (
	sucursal_id INT NOT NULL AUTO_INCREMENT,
	nombre varchar(50) NOT NULL,
	PRIMARY KEY (sucursal_id)
);

CREATE TABLE ORDENES (
	orden_id INT NOT NULL AUTO_INCREMENT,
	sucursal_id INT NOT NULL,
	fecha date NOT NULL,
	total decimal NOT NULL,
	PRIMARY KEY (orden_id),
	FOREIGN KEY (sucursal_id) REFERENCES SUCURSALES(sucursal_id)
)ENGINE=INNODB;

CREATE TABLE PRODUCTOS(
	producto_id INT NOT NULL AUTO_INCREMENT,
	orden_id INT NOT NULL,
	codigo varchar(20) NOT NULL,
	precio decimal NOT NULL,
	PRIMARY KEY (producto_id),
	FOREIGN KEY (orden_id) REFERENCES ORDENES(orden_id)
)ENGINE=INNODB;
