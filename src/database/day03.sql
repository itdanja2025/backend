drop database if exists mydb0204;
create database mydb0204;
use mydb0204;
create table test( 
	mno int auto_increment ,
    constraint primary key(mno),
    mname varchar(30) not null unique , 
    mcount int default 2
);
# DML : 조작어 , 1]INSERT 저장 2]SELECT 조회 3]UPDATE 수정 4]DELETE 삭제
# [1] INSERT : 레코드/행/튜플/1줄/*DTO1개 삽입
# 1) insert into 테이블명( 속성명1 , 속성명2 ) values( 값1 , 값2 );
insert into test( mno , mname , mcount ) values( 1 , "유재석" , 30 );
# 2) 속성명의 순서와 대응하는 값은 위치가 일치 해야한다.
insert into test( mcount , mname , mno ) values( 40 , "강호동" , 2 );
# 3) auto_increment 생략해도 된다.
insert into test( mname , mcount ) values( "신동엽" , 50);
# 4) default 기본값 있으므로 생략해도 된다.
insert into test( mname ) values( "서장훈" );
# 5) not null 제약조건 속성은 꼭 삽입 자료가 존재 해야한다.
-- insert into test( mno , mcount ) values( 5 , 25 ); -- 오류발생 
# 6) unique 제약조건 속성은 중복값이 불가능 하다,
-- insert into test( mname ) values( "유재석" ); -- 오류발생 
# 7) 모든 속성에 대해 값 삽입 할 경우 속성명 생략 가능하다. 값 대응시 속성명 순서 일치
insert into test values( 5 , "박명수" , 60 );
# 8) 하나의 명령어에서 다수 레코드 삽입 , values( 레코드1 ) , ( 레코드2 ) , ( 레코드3 );
insert into test values( 6 , "하하" , 70 ) , ( 7 , "바나나" , 31 ) , ( 8 , "수박" , 65 );
# 확인 
select * from test;











