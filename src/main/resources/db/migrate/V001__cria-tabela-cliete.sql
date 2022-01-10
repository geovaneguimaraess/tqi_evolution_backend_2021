create table cliente (
 	id bigint not null auto_increment,
	nome varchar(60) not null,
	rg varchar(20) not null,
	cpf varchar(11) not null,
	endereco varchar(200) not null,
	email varchar(200) not null,
	senha varchar(20) not null,
	renda numeric (10,3) not null,

	primary key (id)
);