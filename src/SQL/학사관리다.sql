CREATE TABLE `student` (
	`st_num`	int	NOT NULL,
	`st_name`	varchar(40)	NULL,
	`st_identification_num`	varchar(14)	NULL,
	`type`	varchar(2)	NULL
);

CREATE TABLE `coach` (
	`ch_num`	int	NOT NULL,
	`ch_st_num`	int	NOT NULL,
	`ch_pr_num`	int	NOT NULL
);

CREATE TABLE `professor` (
	`pr_num`	int	NOT NULL,
	`pr_name`	varchar(40)	NULL,
	`pr_age`	int	NULL,
	`pr_phone`	varchar(20)	NULL,
	`pr_room`	varchar(15)	NULL
);

CREATE TABLE `course` (
	`co_num`	varchar(16)	NOT NULL,
	`co_room`	varchar(15)	NULL,
	`co_time`	varchar(30)	NULL,
	`co_class`	int	NULL,
	`co_pr_num`	int	NOT NULL,
	`co_su_num`	varchar(6)	NOT NULL
);

CREATE TABLE `subject` (
	`su_num`	varchar(6)	NOT NULL,
	`su_title`	varchar(20)	NULL,
	`su_point`	int	NULL,
	`su_time`	int	NULL
);

CREATE TABLE `attend` (
	`at_num`	int	NOT NULL,
	`at_middle`	int	NULL,
	`at_final`	int	NULL,
	`at_homework`	int	NULL,
	`at_attendance`	int	NULL,
	`at_st_num`	int	NOT NULL,
	`at_co_num`	varchar(16)	NOT NULL
);

CREATE TABLE `board` (
	`bo_num`	int	NOT NULL,
	`bo_title`	varchar(50)	NULL,
	`bo_content`	text	NULL,
	`bo_register_date`	datetime	NULL,
	`bo_bt_code`	varchar(6)	NOT NULL,
	`st_num`	int	NOT NULL
);

CREATE TABLE `attachments` (
	`ac_num`	int	NOT NULL,
	`ac_file_name`	varchar(100)	NULL,
	`ac_file_path`	varchar(150)	NULL,
	`ac_bo_num`	int	NOT NULL
);

CREATE TABLE `graduated` (
	`gr_num`	varchar(20)	NOT NULL,
	`gr_major`	varchar(20)	NULL,
	`gr_entrance`	int	NULL,
	`gr_english`	varchar(20)	NULL,
	`gr_test`	varchar(1)	NULL,
	`gr_project`	varchar(1)	NULL,
	`gr_paper`	varchar(1)	NULL
);

CREATE TABLE `graduation` (
	`gd_num`	int	NOT NULL,
	`gd_graduated`	varchar(3)	NULL,
	`gd_gr_num`	varchar(20)	NOT NULL,
	`gd_st_num`	int	NOT NULL
);

CREATE TABLE `board_type` (
	`bt_code`	varchar(6)	NOT NULL,
	`bo_type`	varchar(15)	NULL
);

ALTER TABLE `student` ADD CONSTRAINT `PK_STUDENT` PRIMARY KEY (
	`st_num`
);

ALTER TABLE `coach` ADD CONSTRAINT `PK_COACH` PRIMARY KEY (
	`ch_num`
);

ALTER TABLE `professor` ADD CONSTRAINT `PK_PROFESSOR` PRIMARY KEY (
	`pr_num`
);

ALTER TABLE `course` ADD CONSTRAINT `PK_COURSE` PRIMARY KEY (
	`co_num`
);

ALTER TABLE `subject` ADD CONSTRAINT `PK_SUBJECT` PRIMARY KEY (
	`su_num`
);

ALTER TABLE `attend` ADD CONSTRAINT `PK_ATTEND` PRIMARY KEY (
	`at_num`
);

ALTER TABLE `board` ADD CONSTRAINT `PK_BOARD` PRIMARY KEY (
	`bo_num`
);

ALTER TABLE `attachments` ADD CONSTRAINT `PK_ATTACHMENTS` PRIMARY KEY (
	`ac_num`
);

ALTER TABLE `graduated` ADD CONSTRAINT `PK_GRADUATED` PRIMARY KEY (
	`gr_num`
);

ALTER TABLE `graduation` ADD CONSTRAINT `PK_GRADUATION` PRIMARY KEY (
	`gd_num`
);

ALTER TABLE `board_type` ADD CONSTRAINT `PK_BOARD_TYPE` PRIMARY KEY (
	`bt_code`
);

