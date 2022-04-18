create table marcas(
cod int primary key,
nome_da_marca varchar,
cnpj varchar,
representante varchar
);
insert into marcas
(cod,nome_da_marca,representante,cnpj)
values
(1,'Jubilenson','Lâmpada','521.727.145-31'),
(2,'Roberto','Tijolo','568.645.658-01');
--------------------------------------------
create table clientes(
cod integer primary key,
nome varchar,
cpf varchar,
telefone varchar,
cep varchar
);
insert into clientes
(cod,nome,cpf,telefone,cep)
values
(1,'Roberto Carlos','138.986.652-96','48542546645','8898-985'),
(2,'Rogério','661.635.986-25','48559266654','86548-951');
---------------------------------------------
create table roupas(
cod integer primary key,
colecao varchar,
qtd int,
tam_roupa varchar,
cor varchar,
tecido varchar,
preco decimal(6,2),
estampa boolean,
cod_marca int,
foreign key (cod_marca) references marcas(cod)
);
insert into roupas
(cod,colecao,cod_marca,tam_roupa,cor,tecido,estampa,qtd, preco)
values
(1,'vede_batata',1,'GG','verde-preto','poliester a base de frango',false,8,100.50),
(2,'marmore',2,'G','Marmore Grécia','algodão, com fios de pedra',true,10,500.99),
(3,'verde_batata',1,'P','verde batata doce', 'poliester a base de academia', true, 20, 760.95);
-------------------------------------------------------------------
create table compras(
data_compra date,
cod_roupa int,
cod_cliente int,
foreign key (cod_roupa) references roupas(cod),
foreign key (cod_cliente) references clientes(cod)
);
insert into compras
(data_compra,cod_roupa,cod_cliente)
values
('2022-02-26',1,1),
('2022-01-16',2,1),
('2022-01-25',2,2);
-------------------------------------------------------------------
create table funcionarios(
cod int primary key,
nome varchar,
funcao varchar,
endereco varchar,
telefone varchar(15),
salario decimal(6,2),
carga_horaria int
);
INSERT into funcionarios
(cod,nome,funcao,endereco,telefone,salario,carga_horaria)
values
(1,'Roberto','Vendedor','Rua tal','(48) 9878-54389',1000.30,45),
(2,'Marina','Gerente','Avenida tal','(48) 995-98745',1500.49,40);
 
---------------------------- select -------------------------
 
--roupa para marcas --
SELECT roupas.preco as preço,roupas.cor as cor, roupas.colecao as coleção,roupas.tam_roupa as tamanho
, roupas.qtd as quantidade,roupas.tecido as tecido,roupas.estampa,marcas.nome_da_marca as marca,
marcas.representante
from roupas inner join marcas on roupas.cod_marca = marcas.cod
-- clientes para roupas --
select roupas.preco as "preço da compra",compras.data_compra as data, clientes.nome as "nome do cliente"
,roupas.cor,roupas.colecao as  "coleção da compra", roupas.tam_roupa as "tamanho da roupa"
from compras
INNER join clientes On compras.cod_cliente = clientes.cod
inner join roupas on compras.cod_roupa = roupas.cod

