select bt_code from board_type;
select st_num from student;
insert into 
	board(bo_title, bo_content, bo_bt_code, bo_st_num)
	values('게시글1','게시글입니다.','ABC123',2020110011);
SELECT * FROM univercity.board;