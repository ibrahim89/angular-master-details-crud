CREATE SEQUENCE customer_seq;

CREATE TABLE customer(
	customer_id bigint DEFAULT NEXTVAL ('customer_seq') NOT NULL,
	name character varying(50) NULL,
 CONSTRAINT pk_customer PRIMARY KEY 
(
	customer_id ASC
) 
);
--------------------------------------------
CREATE SEQUENCE item_seq;

CREATE TABLE item(
	item_id int DEFAULT NEXTVAL ('item_seq') NOT NULL,
	name character varying(50) NULL,
	Price decimal(18, 2) NULL,
 CONSTRAINT pk_item PRIMARY KEY 
(
	item_id ASC
) 
);
-----------------------------------------------
CREATE SEQUENCE order_seq;

CREATE TABLE order(
	order_id bigint DEFAULT NEXTVAL ('Order_seq') NOT NULL,
	order_no character varying(50) NULL,
	customer_id int NULL,
	pmethod character varying(50) NULL,
	GTotal decimal(18, 2) NULL,
 CONSTRAINT pk_order PRIMARY KEY 
(
	order_id ASC
) 
);
----------------------------------------------------
CREATE SEQUENCE order_items_seq;

CREATE TABLE order_items(
	order_item_id bigint DEFAULT NEXTVAL ('order_items_seq') NOT NULL,
	order_id bigint NULL,
	item_id int NULL,
	quantity int NULL,
 CONSTRAINT pk_order_items PRIMARY KEY 
(
	order_item_id ASC
) 
);
--------------------------------------------------------






