CREATE TABLE `consumer` (
	`id`	varchar(15)	NOT NULL,
	`pw`	varchar(255)	NULL,
	`name`	varchar(20)	NULL,
	`phone`	varchar(13)	NULL,
	`address`	varchar(50)	NULL,
	`withdrawal`	varchar(1)	NULL
);

CREATE TABLE `product` (
	`code`	varchar(20)	NOT NULL,
	`name`	varchar(20)	NULL,
	`size`	varchar(20)	NULL,
	`price`	varchar(20)	NULL,
	`type`	varchar(10)	NULL,
	`se_id`	varchar(15)	NOT NULL
);

CREATE TABLE `order` (
	`num`	int	NOT NULL,
	`co_id`	varchar(15)	NOT NULL,
	`all_price`	int	NULL
);

CREATE TABLE `seller` (
	`id`	varchar(15)	NOT NULL,
	`pw`	varchar(255)	NULL,
	`name`	varchar(20)	NULL,
	`phone`	varchar(13)	NULL,
	`address`	varchar(50)	NULL,
	`ma_id`	varchar(15)	NOT NULL
);

CREATE TABLE `manager` (
	`id`	varchar(15)	NOT NULL,
	`pw`	varchar(255)	NULL
);

CREATE TABLE `enrollment` (
	`num`	int	NOT NULL,
	`title`	varchar(255)	NULL,
	`content`	text	NULL,
	`thumbnail`	varchar(255)	NULL,
	`date`	datetime	NULL,
	`ma_id`	varchar(15)	NOT NULL
);

CREATE TABLE `delivery` (
	`code`	int	NOT NULL,
	`name`	varchar(20)	NULL,
	`phone`	varchar(13)	NULL,
	`location`	varchar(50)	NULL,
	`se_id`	varchar(15)	NOT NULL,
	`or_num`	int	NOT NULL
);

CREATE TABLE `product_enrollment` (
	`list`	int	NOT NULL,
	`en_num`	int	NOT NULL,
	`pd_code`	varchar(20)	NOT NULL,
	`amount`	int	NULL
);

CREATE TABLE `order_list` (
	`list`	int	NOT NULL,
	`or_num`	int	NOT NULL,
	`pe_list`	int	NOT NULL,
	`all_quantity`	int	NULL
);

ALTER TABLE `consumer` ADD CONSTRAINT `PK_CONSUMER` PRIMARY KEY (
	`id`
);

ALTER TABLE `product` ADD CONSTRAINT `PK_PRODUCT` PRIMARY KEY (
	`code`
);

ALTER TABLE `order` ADD CONSTRAINT `PK_ORDER` PRIMARY KEY (
	`num`
);

ALTER TABLE `seller` ADD CONSTRAINT `PK_SELLER` PRIMARY KEY (
	`id`
);

ALTER TABLE `manager` ADD CONSTRAINT `PK_MANAGER` PRIMARY KEY (
	`id`
);

ALTER TABLE `enrollment` ADD CONSTRAINT `PK_ENROLLMENT` PRIMARY KEY (
	`num`
);

ALTER TABLE `delivery` ADD CONSTRAINT `PK_DELIVERY` PRIMARY KEY (
	`code`
);

ALTER TABLE `product_enrollment` ADD CONSTRAINT `PK_PRODUCT_ENROLLMENT` PRIMARY KEY (
	`list`
);

ALTER TABLE `order_list` ADD CONSTRAINT `PK_ORDER_LIST` PRIMARY KEY (
	`list`
);

