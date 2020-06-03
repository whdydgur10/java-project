/*select * from student; - student 테이블의 모든 속성값 
#select 속성명1, 속성명2,... from 데이터베이스명.테이블명;
select st_num, st_name from student; - stdent 테이블의 st_num 속성과 st_name의 속성값
select * from student where st_num = 2020110012;
*/
/*insert into student(st_num, st_name, st_identification_num, st_type)
	values (2020110011, '홍길동', '000101-3312433', '학사');
#insert into 테이블명(속성명1, 속성명2 ...) values (속성1의 값, 속성2의 값...)
select * from student;
#1.속성에 지정된 타입과 값의 타입이 같은지 확인
#2.속성에 지정된 제약조건에 값이 맞는지 확인
#3.insert할 때에 생략할 수 없는 속성
#  - 기본키인 속성
#  - 제약조건이 NOT NULL이고, 기본값이 없는 경우
*/
/*update student 
	set 
		st_name = '유관순'
where st_num = 2020110012;
#update 테이블명 
	set 
		속성명1 = 속성값1, 
		속성명2 = 속성값2 student
			 ... 
where 조건;
select * from student;
#조건에는 기본키를 많이 사욯한다.
#조건에서는 NULL을 속성명 IS NULL, 속성명 IS NOT NULL을 사용한다.
*/
/*delete from student where st_type = '석사';
#delete from 테이블명 where 속성명1 = 속성값1;student
select * from student;
*/
#drop table if exists 테이블명;
#테이블에 테이블명이 있으면 삭제 - 기존에 테이블명이 있는지 확실하지 않을 때 삭제 후 재생성을 할 경우
