create database exe;
use exe;
create table student(
id int primary key not null auto_increment,
reg_no int not null,
name varchar(20) not null,
sex varchar(20) not null,
age int not null,
grade varchar(20) not null,
major varchar(50) not null
);

insert into student values(1,20171201,'changsu','man',31,'2008','zhexue');
insert into student values(2,20171202,'yanjing','man',31,'2008','zhengzhi');
insert into student values(3,20171203,'jingheng','man',31,'2016','renti');
insert into student values(4,20171204,'gongyu','woman',31,'2013','zhengzhi');
insert into student values(5,20171205,'nihong','woman',31,'2006','zshengyue');
insert into student values(6,20171206,'banruo','woman',31,'2009','internal');


