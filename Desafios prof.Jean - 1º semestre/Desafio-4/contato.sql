create database contato;
use contato;

create table contato
(
	#id_contato int primary key auto_increment,
	email varchar(45) not null unique ,
    nome varchar(45) not null,
    descricao varchar(45) not null
    
);


describe contato;

insert into contato (email, nome, descricao) values
('fatec@fatec.sp.gov.br','fatec','Flask'),
('fatec1@fatec.sp.gov.br','fatec','Banco de Dados');


select * from contato;
