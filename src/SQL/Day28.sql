/*SELECT * FROM product;
SELECT * FROM product_enrollment;
SELECT * FROM enrollment;
select list as 등록번호, title as 등록글, content as 등록내용, date as 등록일시, code as 상품코드, name as 상품이름, size as 상품사이즈, price as 상품가격, type as 분류, amount as 남은수량, se_id as 판매자
	from product
	join (select * from product_enrollment where amount != 0) as pe
    on code = pe.pd_code
    join enrollment
    on en_num = num;*/
    
/*SELECT * FROM order_list;
SELECT * FROM product_enrollment;
SELECT * FROM shopping.order;
SELECT * FROM product;
select co_id as 구매자, sum(price) as 총구매값
	from shopping.order
    join order_list as ol
    on num = ol.or_num
    join product_enrollment as pe
    on ol.pe_list = pe.list
    join product as pd
    on pd.code = pe.pd_code
    group by co_id;*/
    
/*drop trigger if exists insert_order_list;
#insert_order_list라는 트리거가 있으면 삭제
delimiter //
create trigger insert_order_list after insert on order_list
#트리거를 만드는데 트리거명은 insert_order_list이고 order_list에 insert동작 후 작동한다.
for each row
#특정 동작 후 변경되는 각행
begin
	declare _amount int default 0;
    #_amount라는 변수를 선언 정수형 초기화 0
	set _amount = (select amount from product_enrollment where list = new.pe_list);
    #구매 리스트에 추가된 제품의 현재 재고량을 가져와 _amount에 저장
    #초기화한다 _amount 를 찾는다 amount 를 에서 product_enrollment 조건이 list와 새롭게 추가하는 pe_list가 같을때
    #new.pe_list는 지금 테이블에 추가된 구매리스트의 등록상품 번호
    set _amount = _amount - new.all_quantity;
    #현재 재고량에서 구매한 재고량을 뺌
    #초기화한다 _amount를 _amount 빼기 새롭게 추가하는 all_quantity값을
    update product_enrollment
		set amount = _amount
        #초기화한다 amount 를 _amount로
        where list = new.pe_list;
        #list와 새롭게 추가하는 pe_list가 같을때
end//
delimiter ;*/

/*drop trigger if exists insert_all_price
delimiter //
create trigger insert_all_price after insert on order_list
#값을 삽입하는 테이블을 기본으로 한다.
for each row
begin
	declare _amount int default 0;
    declare _price int default 0;
    declare _all_price int default 0;
	set _amount = (select amount from product_enrollment where list = new.pe_list);
	set _amount = _amount - new.all_quantity;
		update product_enrollment
			set amount = _amount
			where list = new.pe_list;
	set _price = (select price 
						from product
						join product_enrollment
                        on code = pd_code
                        where list = new.pe_list);
	set _all_price = (select all_price from shopping.order where num = new.or_num);
    set _all_price = _all_price + new.all_quantity * _price;
    update shopping.order
		set all_price = _all_price
        where num = new.or_num;
end//
delimiter ;*/
#구매시 재고량 감소와 구매금액 증가
/*drop trigger if exists delete_all_price 
delimiter //
create trigger delete_all_price before delete on order_list
for each row
begin 
	declare amount_ int default 0;
    declare price_ int default 0;
    declare all_price_ int default 0;
    set amount_ = (select amount from product_enrollment where list = old.pe_list);
    set amount_ = amount_ + old.all_quantity;
		update product_enrollment
        set amount = amount_
        where list = old.pe_list;
	set price_ = (select price 	
						from product
						join product_enrollment
						on code = pd_code
						where list = old.pe_list);
	set all_price_ = (select all_price from shopping.order where num = old.or_num);
    set all_price_ = all_price_ - old.all_quantity * price_;
    update shopping.order
		set all_price = all_price_
        where num = old.or_num;
end//
delimiter ;*/
#구매취소시 재고량 증가와 구매금액 감소
drop trigger if exists update_all_price
delimiter //
create trigger update_all_price after update on order_list
for each row
begin
	declare _amount int default 0;
	declare amount_ int default 0;
    declare _price int default 0;
    declare price_ int default 0;
    declare _all_price int default 0;
    declare all_price_ int default 0;
    set amount_ = (select amount from product_enrollment where list = old.pe_list) + old.all_quantity;
		update product_enrollment
        set amount = amount_
        where list = old.pe_list;
	set price_ = (select price 	
						from product
						join product_enrollment
						on code = pd_code
						where list = old.pe_list);
	set all_price_ = (select all_price from shopping.order where num = old.or_num) - old.all_quantity * price_;
    update shopping.order
		set all_price = all_price_
        where num = old.or_num;
	set _amount = (select amount from product_enrollment where list = new.pe_list) - new.all_quantity;
		update product_enrollment
			set amount = _amount
			where list = new.pe_list;
	set _price = (select price 
						from product
						join product_enrollment
                        on code = pd_code
                        where list = new.pe_list);
	set _all_price = (select all_price from shopping.order where num = new.or_num);
    set _all_price = _all_price + new.all_quantity * _price;
    update shopping.order
		set all_price = _all_price
        where num = new.or_num;
end//
delimiter ;
#구매수정시 재고량 수정과 구매금액 수정