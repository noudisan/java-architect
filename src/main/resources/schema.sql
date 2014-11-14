CREATE DATABASE BUILD;


CREATE TABLE TB_ARCHITECT
(
   ID INT PRIMARY KEY AUTO_INCREMENT,
   NAME VARCHAR (50),
   IMAGE_PATH VARCHAR (50),
   REMARKS VARCHAR (2000),
   TYPE VARCHAR (30),
   CREATE_DATE DATETIME,
   STATUS VARCHAR (30) default 1
);

CREATE TABLE TB_CONTACT
(
  ID INT PRIMARY KEY AUTO_INCREMENT,
  FULL_NAME VARCHAR (50),
  EMAIL VARCHAR (50),
  PHONE VARCHAR (20),
  SUBJECT VARCHAR (100),
  MESSAGE VARCHAR (800),
  CREATE_DATE DATETIME
);

CREATE TABLE TB_ARCHITECT_DETAIL
(
   ID INT PRIMARY KEY AUTO_INCREMENT,
   NAME VARCHAR (50),
   IMAGE_PATH VARCHAR (50),
   REMARKS VARCHAR (2000),
   CREATE_DATE DATETIME,
   ARCHITECT_ID INT,
   SORT INT
);

