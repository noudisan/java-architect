CREATE DATABASE BUILD;

CREATE TABLE TB_ARCHITECT
(
   ID INT PRIMARY KEY AUTO_INCREMENT,
   NAME VARCHAR (50),
   IMAGE_PATH VARCHAR (50),
   REMARKS VARCHAR (2000),
   TYPE VARCHAR (30),
   CREATE_DATE DATETIME,
   STATUS VARCHAR (30) default 1,
   SORT INT default 999,
   title varchar(50)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

CREATE TABLE TB_CONTACT
(
  ID INT PRIMARY KEY AUTO_INCREMENT,
  FULL_NAME VARCHAR (50),
  EMAIL VARCHAR (50),
  PHONE VARCHAR (20),
  SUBJECT VARCHAR (100),
  MESSAGE VARCHAR (800),
  CREATE_DATE DATETIME
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

CREATE TABLE TB_ARCHITECT_DETAIL
(
   ID INT PRIMARY KEY AUTO_INCREMENT,
   NAME VARCHAR (50),
   IMAGE_PATH VARCHAR (50),
   REMARKS VARCHAR (2000),
   CREATE_DATE DATETIME,
   ARCHITECT_ID INT,
   SORT INT
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

CREATE TABLE TB_ARCHITECT_INFO
(
   ID INT PRIMARY KEY AUTO_INCREMENT,
   ARCHITECT_ID VARCHAR (50),
   DESC1 text,
   DESC2 text,
   DESC3 text,
   CREATE_DATE DATETIME
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

