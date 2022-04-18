create table fornecedor(
cod int primary key,
nome varchar,
cnpj varchar,
contato varchar
);

create table produtos(
	cod int primary key,
	nome varchar,
	preço decimal,
	qtd int,
	cod_fornecedor int references fornecedor(cod)
);
insert into produtos
(cod,nome,preço,qtd,cod_fornecedor)
values
(1,'chaveiro de elefante', 15.50,10,1)

-------
create table funcionarios(
id int primary key,
cargo varchar,
ferias varchar,
nome varchar,
observacoes varchar,
cpf varchar,
carga_horaria varchar,
salario decimal
);
insert into funcionarios
(id,nome,cargo,salario,cpf,carga_horaria,ferias,observacoes)
values
(1,'Roberto','vendedor',1500,'132568415-65','40 horas','1 mês','fuma muito derb');
---------------------
create table loja(
id int primary key,
id_funcionarios int references funcionarios(id),
nome varchar
);
insert into loja
(id,nome,id_funcionarios)
values
(1,'vendedor de brindes',1);
------------------
create table contem(
id_produtos int primary key produtos(cod),
id_loja int primary key loja(id)
);
insert into comtem
(id_produtos,id_loja)
values
(1,1)


-------------------
create table fornecedor(
cod int primary key,
nome varchar,
cnpj varchar,
contato varchar
);

create table produtos(
	cod int primary key,
	nome varchar,
	preço decimal,
	qtd int,
	cod_fornecedor int references fornecedor(cod)
);
insert into produtos
(cod,nome,preço,qtd,cod_fornecedor)
values
(1,'chaveiro de elefante', 15.50,10,1)

-------
create table funcionarios(
id int primary key,
cargo varchar,
ferias varchar,
nome varchar,
observacoes varchar,
cpf varchar,
carga_horaria varchar,
salario decimal
);
insert into funcionarios
(id,nome,cargo,salario,cpf,carga_horaria,ferias,observacoes)
values
(1,'Roberto','vendedor',1500,'132568415-65','40 horas','1 mês','fuma muito derb');
---------------------
create table loja(
id int primary key,
id_funcionarios int references funcionarios(id),
nome varchar
);
insert into loja
(id,nome,id_funcionarios)
values
(1,'vendedor de brindes',1);
------------------
create table contem(
id_produtos int primary key produtos(cod),
id_loja int primary key loja(id)
);
insert into comtem
(id_produtos,id_loja)
values
(1,1)


