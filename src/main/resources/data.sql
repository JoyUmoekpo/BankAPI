create table client(
id SERIAL primary key,
client_name varchar(50)
);

insert into client(client_name) values('Jasdhir');
insert into client(client_name) values('Ryan');
insert into client(client_name) values('Dan');
insert into client(client_name) values('Eric');

create table account(
id serial primary key,
account_number varchar,
balance_in_cents numeric,
client_id integer ,
foreign key (client_id) references client(id)
);

insert into account (account_number,balance_in_cents,client_id) 
values
('A001',200,1);
insert into account (account_number,balance_in_cents,client_id) 
values
('A002',400,1);