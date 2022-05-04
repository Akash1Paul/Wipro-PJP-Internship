create table login(
UserID varchar(200),
Password varchar(200),
name varchar(200),
IncorectAttempts  Number(2),
LockStatus Number(2),
UserType varchar(200)
);
insert into login values('AB1001','AB1001','Hari',0,0,'Admin');

insert into login values('TA1002','TA1002','Prasath',0,0,'Employee');
insert into login values('RS1003','RS1003','Ganesh',0,0,'Employee');



select *  from login;
