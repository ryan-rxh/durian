--create table userinfo
create table userinfo(
id character varying(30) not null primary key,
password character varying(30) not null,
usertype int not null default 1
);
--create table bill
create table bill(
id int not null primary key,
summary character varying(255) default '',
cost numeric not null default 0,
createDate date not null,
userId character varying(30) not null,
constraint fk_bill_userinfo foreign key (userId) references userinfo(id) 
);
--create table item
create table item(
id int not null primary key,
name character varying(255) not null,
cost numeric not null default 0,
billId int not null,
constraint fk_item_bill foreign key (billId) references bill("id")
);

CREATE OR REPLACE FUNCTION initTestData() RETURNS void AS   
$$  
    DECLARE  
        count int;  
        summary character varying(255);
	BEGIN
		delete from bill where userid='test';
	    delete from userinfo where id='test';
	    insert into userinfo values('test', '123', 0);
	    count := 0;
        while count < 100000 loop  
			summary = 'bill'||count;
            insert into bill values(count, summary, count, '2014-07-29', 'test');  
            count := count+1;  
        end loop;     
	END;  
$$   
LANGUAGE plpgsql; 

select initTestData();