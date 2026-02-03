/*[실습] * 제출용 
[문제 1] 데이터베이스 생성*/
create database my_db; -- 실행할 명령어에 커서를 두고 ctrl+enter : 줄단위 가능

/*[문제 2] 데이터베이스 목록 확인*/
show databases; -- 명령어 뒤에는 ; 세미콜론이 들어간다.

/*[문제 3] 데이터베이스 사용지시: 문제 1에서 생성한 'my_db' 데이터베이스를 사용하도록 활성화하는 SQL 코드를 작성하시오.*/
use my_db;

/* [문제 4] 데이터베이스 삭제 지시: 'my_db' 데이터베이스를 삭제하는 SQL 코드를 작성하시오. */
drop database my_db;

/*[문제 5] 지시: 아래 순서에 따라 SQL 코드를 작성하고 실행하시오.*/
drop database if exists company_db;
create database company_db;
use company_db;
show databases;




