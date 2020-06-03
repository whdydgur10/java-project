SELECT * FROM student;
SELECT * FROM attend;
SELECT * FROM course;
SELECT * FROM subject;
select co_num as 학기, st_num as 학번, st_name as 학생이름, sum(su_point) as 총이수학점
	from (select * from student where st_num = '2016110011') as st
    join (select * from attend where at_complete = 'Y') as at
    on st.st_num = at.at_st_num
    join course
    on at_co_num = co_num
    join subject
    on co_su_num = su_num
    group by co_num;

/*drop trigger if exists update_st_point;
delimiter //
create trigger update_st_point after update on attend
for each row
begin
	declare _st_point int default 0;
    set _st_point = (select sum(su_point) from subject
						join course
						on su_num = co_su_num
                        join attend
                        on at_co_num = co_num
						where co_num = old.at_co_num and new.at_complete = 'y');
	update student
		set st_point = _st_point
		where st_num = old.at_st_num;
	set _st_point = (select infull(sum(su_point),0)
						from attend
                        join course
                        on co_num = at_co_num
                        join subject
                        on su_num = co_su_num
                        where at_st_num = new.at_st_num and at_complete ='y');
    update student
		set st_point = _st_point
        where st_num = new.at_st_num;
	/*if new.at_complete = 'y' then
			set _st_point =
				 (select intfull(sum(su_point),0)
						from attend
                        join course
                        on co_num = at_co_num
                        join subject
                        on su_num = co_su_num
                        where at_st_num = new.at_st_num and at_complete ='y')
		update student
			set st_point = _st_point
			where st_num = new.at_st_num;
		end if;
end//
delimiter ;*/
#이수수정시 이수학점 수정
#이 트리거는 attend 테이블에서 이벤트가 발생할 때 실행되는 테이블이기 때문에 트리거 안에서 attend 테이블을 수정할 수 없다.

/*drop procedure if exists 프로시저명;
delimiter //
create procedure 프로시저명(
	in 매개변수 자료형,
    out 리턴변수 자료형
)
begin
end//
delimiter ;*/
/*drop procedure if exists select_student;
delimiter //
create procedure select_student(
	in student_num int,
    out student_name varchar(40)
)
begin
	set student_name = (select st_name from student where st_num = student_num);
end//
delimiter ;
call select_student(2015110011, @student_name);
select @student_name;
# @변수는 한번선언하면 끝까지 사용할 수 있는 변수
select * from univercity.student;*/

/*drop procedure if exists insert_course;
delimiter //
create procedure insert_course(
	in course_year int, subject_code varchar(6), course_season int, course_class int, course_room VARCHAR(15), 
    course_time VARCHAR(30), course_pr_num int, course_su_num VARCHAR(6)
)
begin
	declare _code varchar(16);
    set _code = concat(course_year,'_',subject_code,'_',course_season,'_',course_class);
    if course_season >= 1 and course_season <=4 and (select count(*) from subject where su_num = subject_code) != 0
		and (select count(*) from professor where pr_num = course_pr_num) != 0
        and convert(course_pr_num / 1000000,signed integer) <= course_year
        #그냥 나누면 소수점이 나와 같은 년도일 경우 오류가 발생하므로 나눈 값을 int형으로 바꿔준다.
        and (select count(*) from course where co_num = _code) = 0
    then
        insert into course values(_code , course_room, course_time, course_class, course_pr_num, course_su_num);
    end if;
end//
delimiter ;
call insert_course(2018,'MCS006',1,1,'강의실 501호','월7,8',2016110002,'MCS006');
select * from course;*/