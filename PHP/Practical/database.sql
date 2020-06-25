CREATE TABLE customer(
id int AUTO_INCREMENT PRIMARY KEY not null,
fullname varchar (128) not null,
email varchar (50) not null UNIQUE ,
username varchar (50) not null UNIQUE ,
password varchar (50) not null
)