CREATE DATABASE `eazybank`;
Use eazybank;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `enabled` int NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `authorities` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `authority` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

create table `customer` (
`id` int NOT NULL auto_increment,
`email` varchar(45) NOT NULL,
`pwd` varchar(200) NOT NULL,
`role` varchar(45) NOT NULL,
primary key (`id`)
);

INSERT IGNORE INTO `users`
(`id`,
`username`,
`password`,
`enabled`)
VALUES
(NULL, "happy", "12345", "1");

INSERT IGNORE INTO `authorities`
(`id`,
`username`,
`authority`)
VALUES
(NULL, "happy","write");

INSERT INTO `customer`
(`email`,
`pwd`,
`role`)
VALUES
("johndoe@example.com",
"54321",
"admin");


