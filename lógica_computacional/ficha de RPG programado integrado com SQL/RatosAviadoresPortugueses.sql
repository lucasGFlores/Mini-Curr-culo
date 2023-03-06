
create table usuario(
nome varchar primary key,
senha varchar
);
create table personagem(
id integer primary key,
	nome varchar,
	classe varchar,
	raca varchar,
	nome varchar references usuario(nome)
);
create table poderes(
id_do_personagem int,
nivel int,
dado varchar,
tdc varchar,
descricao varchar,
vmc varchar,
nome varchar,
id int primary key
);
create table conhecem(
id_do_personagem int references personagem(id),
id_da_magia int references poderes (id)
);
create table status(
id_do_personagem int references personagem(id),
str int,
dex int,
	cont int,
	cha int,
	sab int,
	inte int
);
