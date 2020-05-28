/*select * from course;
select * from subject;
select co_num, pr_name
	from course
		join professor
        on co_pr_num = pr_num;
#select 속성 from 테이블A join 테이블B on 테이블A.속성명 = 테이블B.속성명 where 조건;
#join은 두 테이블을 연결하여 하나의 테이블을 만듬
#두 테이블을 연결해주는 연결고리에 해당하는 부분이 on 다음
#on을 통해 비교할 때 속성명이 서로 다른 경우 테이블명을 생략할 수 있다.
*/
/*select co_num, su_title
	from course
		join subject 
        on co_su_num = su_num;
select co_num, pr_name, su_title
	from course
		join professor
		on pr_num = co_pr_num
		join subject
        on su_num = co_su_num;
*/
/*select * from student;
select * from professor;
select * from coach;
select st_name, pr_name
	from coach
		join student
        on st_num = ch_st_num
        join professor
        on pr_num = ch_pr_num;*/
/*select * from subject;
select * from course;
select * from attend;
select * from student;
select su_title
	from subject
    join course
    on su_num = co_su_num
    join attend
    on co_num = at_co_num
    join student
    on at_st_num = st_num
    where st_name = '유관순';*/
/*select su_title
    from (select * from student where st_name = '유관순') as st
    #stdent 테이블에서 st_name이 '유관순'인 카디널리티들을 st라는 임시테이블로 생성
    join attend
    on at_st_num = st.st_num
    join course
    on co_num = at_co_num
    join subject
    on su_num = co_su_num;
   #위에 있는 조회문과 같은 구문이지만 join하는 테이블 순서는 상관이 없다.*/
select * from subject;
select * from course;
select su_title
	from subject
    join course
    on co_su_num = su_num
	where co_num like '2020_%_1_%';