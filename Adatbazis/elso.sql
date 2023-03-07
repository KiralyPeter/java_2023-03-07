CREATE DATABASE szfesti_elso;
USE szfesti_elso;

CREATE TABLE workers(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50),
	city VARCHAR(20),
	salary INT,
	born DATE
);

INSERT INTO workers(name, city, salary, born) VALUES
("Rabsz Olga", "Vác", 450000, "1996-02-21"),
("Kalap Pál", "Ócsa", 560000, "2001-05-06"),
("Har Mónika", "Szeged", 490000, "1995-11-12");
