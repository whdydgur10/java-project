/*select * from coach;
select * from student;
select * from professor;
select pr_name as 지도교수, st_name as 지도학생
	from (select * from professor where pr_name = '이순신') as pr
    join coach
    on pr.pr_num = ch_pr_num
    join student
    on ch_st_num = st_num;*/
/*select * from professor;
select * from subject;
select * from course;
select pr_name as 교수이름, su_title as 과목명
	from (select * from professor where pr_name = '이순신') as pr
    join course
    on pr.pr_num = co_pr_num
    join subject
    on co_su_num = su_num;*/
/*select * from professor;
select * from subject;
select * from course;
select  co_num, pr_name as 교수이름, su_title as 과목명
	from (select * from professor where pr_name = '이순신') as pr
		join (select * from course where co_num like '2020@_%@_1@_%' escape '@') as co
			on pr.pr_num = co.co_pr_num
		join subject
			on co.co_su_num = su_consumernum
	group by su_title;*/
select * from attend
	order by at_num desc;
