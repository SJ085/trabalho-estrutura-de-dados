create database clientes_comprebem;
use clientes_comprebem;

create table clientes
(
id int unsigned not null auto_increment primary key,
nome varchar(45) not null,
cpf varchar(15) not null unique,
celular varchar(15) not null unique,
email varchar(45) not null unique
);
insert into clientes values (null, 'Jose da Silva', '99966655533', '8588776655', 'josegmail.com');
insert into clientes values (null, 'Paulo Silva', '88877744423', '8599445522', 'paulogmail.com');
insert into clientes values (null, 'Sonia Oliveira', '00022255589', '8589993322', 'soniagmail.com');
insert into clientes values (null, 'Maria Julia', '00011155578', '8587999999', 'mariagmail.com');
insert into clientes values (null, 'Vicente Lucas', '11155588823', '8598888888', 'vicentegmail.com');
insert into clientes values (null, 'Francisco Aluisio', '00088899956', '8599882233', 'fcoalugmail.com');
insert into clientes values (null, 'Soraia Machado', '33322255589', '8587777777', 'soraiagmail.com');
insert into clientes values (null, 'Adriano Garcia', '66633355578', '8586555555', 'adriggmail.com');
insert into clientes values (null, 'Livia Queiroz', '77788844456', '8597444444', 'liviagmail.com');
insert into clientes values (null, 'Tais Ramos', '22288899912', '8585666666', 'taisgmail.com');
select * from clientes; 

create database clientes_comprebem
