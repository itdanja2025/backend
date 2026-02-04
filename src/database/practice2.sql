-- 아래 문제는 'practice2' 데이터베이스 생성 후 진행 합니다.
drop database if exists practice2; -- 데이터베이스 존재하면 삭제 
create database practice2; -- 데이터베이스 생성
use practice2; -- 데이터베이스 사용/활성화

create table members(  -- [문제 1]아래 조건에 맞는 members 테이블을 생성하는 SQL을 작성하세요.
	member_id int auto_increment, -- 정수,  자동 증가
	constraint primary key ( member_id ) , -- Primary Key,
	member_name varchar(50) not null , -- 문자열(50), NULL 허용 안함
    email varchar(100) unique not null ,  -- 문자열(100), Unique, NULL 허용 안함
    join_date datetime default now() ,  -- 날짜/시간, Default 현재 날짜/시간
    is_active bool default true
);
select * from members;	

-- [문제 2] 아래 조건에 맞는 products 테이블을 생성하는 SQL을 작성하세요.
create table products( 
	product_id int auto_increment , 
    constraint primary key ( product_id ) ,
    product_name varchar(100) not null , 
    price int unsigned not null , 
    stock int default 0 not null ,
    create_at datetime default now()  -- 마지막 속성 뒤로는 ,쉼표가 없다.
);
select * from products;

-- [문제 3] 아래 조건에 맞는 orders 테이블을 생성하는 SQL을 작성하세요.
create table orders(
	order_id bigint auto_increment , 
    constraint primary key( order_id ),
    member_id int ,
    constraint foreign key( member_id ) 
				references members(member_id) on delete cascade on update cascade , 
	order_date datetime default now(),
    total_price int unsigned not null
);
select * from orders;








