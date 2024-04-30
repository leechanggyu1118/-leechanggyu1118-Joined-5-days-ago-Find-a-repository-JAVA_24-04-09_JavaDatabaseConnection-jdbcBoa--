--유저 생성구문
CREAT user 'javaUser'@'localhost' indentified by 'mysql';

--DB 생성
CREATE DATABASE javadb;

--유저 권한 부여
GRANT ALL PRIVILEGES ON javadb.* TO 'javaUser'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;

-- board 등록
CREATE TABLE board(
bno INT NOT NULL AUTO_INCREMENT,
title VARCHAR(50) NOT NULL,
writer VARCHAR(30) NOT NULL,
 content TEXT,
regdate DATETIME DEFAULT NOW(),
moddate DATETIME DEFAULT NOW(),
PRIMARY KEY(bno));