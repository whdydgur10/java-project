select pr_num from professor;
select su_num from subject;
insert into
	course(co_num, co_room, co_time, co_class, co_pr_num, co_su_num)
    values('2020_MCS001_1_1','강의실 101호','월1,2 수2,3',1,19900301,1);
SELECT * FROM univercity.course;