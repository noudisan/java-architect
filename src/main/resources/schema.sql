CREATE TABLE student_tbl
(
   student_id         VARCHAR(255) PRIMARY KEY,
   student_name       VARCHAR(10) NOT NULL,
   student_sex        VARCHAR(10),
   student_birthday   DATE,
   class_id           VARCHAR(255)
);

insert into student_tbl (STUDENT_ID, STUDENT_NAME, STUDENT_SEX, STUDENT_BIRTHDAY, CLASS_ID)
values ('11', 'xiaoming', 'nan', to_date('26-12-2013 15:11:41', 'dd-mm-yyyy hh24:mi:ss'), '1');