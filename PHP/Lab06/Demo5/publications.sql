CREATE DATABASE publications;
USE publications;

CREATE TABLE classics(
author VARCHAR (128),
title VARCHAR (128),
category VARCHAR (16),
year SMALLINT ,
isbn CHAR (16),
index (author(20)),
index (title(20)),
index (category(4)),
index(year),
PRIMARY KEY (isbn)); ENGINE InnoDB;

ALTER TABLE classics ADD FULLTEXT(author, title);

INSERT INTO classics(author, title, category, year, isbn)
    VALUES('Charles Dickens','Little Dorrit','Fiction','1857','9780141439969');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('Mark Twain','The Adventures of Tom Sawyer','Fiction','1876','7643723885');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('Jane Austen ','Pride and Prejudice','Fiction','1811','921736247324');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('Charles Darwin','The Origin of of Species','Non-Fiction','1856','92736214737');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('Charles Dickens','The Old Curiosity','Fiction','1841','97643723885');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('William Shakespeare','Romeo and Juliet','play','1594','902348732478');

CREATE TABLE customers(
name VARCHAR (128),
isbn VARCHAR (13),
PRIMARY KEY (isbn)); ENGINE InnoDB;

INSERT INTO customers(name,isbn)
   value('Joe Bloggs','9780099533474');
INSERT INTO customers(name,isbn)
   value('Mary Smith','9213246632672');
INSERT INTO customers(name, isbn)
   value('Jack & Wilson','97543265743');

SELECT * FROM customers;

