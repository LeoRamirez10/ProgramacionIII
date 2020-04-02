create database productoss;
USE productoss;

CREATE TABLE `productoss`.`productoss` (
`id` INT NOT NULL AUTO_INCREMENT,
`nombreProducto` VARCHAR(45) NULL,
`precioProducto` DOUBLE NULL,
`cantidadProducto` INT (45) NULL,
`totalProducto` DOUBLE NULL,
PRIMARY KEY (`id`));



set global time_zone = '-6:00';

select * from productoss.productoss;


