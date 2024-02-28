Create database Biblioteca
go
use Biblioteca
go
-- Tabelas
Create Table Assunto(
	sg_Assunto char(01) not null,
	ds_Assunto varchar(40))
go
Create Table Editora(
	cd_Editora int not null,
	nm_Editora varchar(40))
go
Create Table Autor(
	cd_Autor int not null,
	nm_Autor varchar(40),
	ds_EnderecoAutor varchar(50))
go
Create Table Livro(
	cd_Livro int not null,
	nm_Titulo varchar(30),
	vl_Livro money,
	dt_Lancamento datetime,
	sg_Assunto char(01),
	cd_Editora int)
go
-- Chaves Primarias
Alter Table Assunto
	Add Primary Key (sg_Assunto)
go
Alter Table Editora
	Add Primary Key (cd_Editora)
go
Alter Table Autor
	Add Primary Key (cd_Autor)
go
Alter Table Livro
	Add Primary Key (cd_Livro)
go
-- Chaves Estrangeiras
Alter Table Livro
	Add Foreign Key (sg_Assunto)
	References Assunto
go
Alter Table Livro
	Add Foreign Key (cd_Editora)
	References Editora
go
-- Registros
Insert Into Assunto
	Values 	('D','Drama'),
		('A','Aventura'),
		('C','Com�dia')
go
Insert Into Editora
	Values 	(1,'Erica'),
		(2,'Campus')
go
Insert Into Autor
	Values 	(1,'MARIA DA SILVA','RUA DO GRITO, 45'),
		(2,'ANDR� CARDOSO','AV. DA SAUDADE,325'),
		(3,'TATIANA SOUZA','AV. BRASIL, 4011'),		
		(4,'MARCO ANDRADE','RUA DO IMPERADOR, 778')
go
Insert Into Livro
	(cd_Livro, nm_Titulo, cd_Editora, sg_Assunto, vl_Livro)
	Values 	(1,'Mar em F�ria',1,'D',65.00),
		(2,'O Aeroporto',2,'A',30.00),
		(3,'Einstein',2,'D',4.50),
		(4,'Mar sem fim',1,'A',58.00)
go
----------------------------------
--Atividade de Banco de Dados II--
----------------------------------
----------------------------------
----------------------------------
--1. Criar a tabela Autor_Livro do relacionamento N para N, utilizando uma instrução SQL sem especificar as (chaves) restrições de integridade. Depois altere a tabela de forma a incluir a chave primária nomeando a restrição para PK_AutorLivro e as chaves estrangeiras, nomeando as restrições para FK_Autor e FK_Livro
----------------------------------
Create Table Autor_Livro (
	cd_Autor int,
	cd_Livro int
)
go
Alter Table Autor_Livro
	Add Constraint PK_AutorLivro 
	Primary Key(cd_Autor, cd_Livro)
go
Alter Table Autor_Livro
	Add Constraint FK_Autor
	Foreign Key (cd_Autor)
	References Autor (cd_Autor)
go
Alter table Autor_Livro
	Add Constraint FK_Livro
	Foreign Key (cd_Livro)
	References Livro (cd_Livro)
go
Insert into Autor_Livro
	Values	(1,3),
			(1,2),
			(2,1),
			(3,4),
			(4,2),
			(4,3)
go
----------------------------------
--2. Crie uma instrução para adicionar a coluna qt_Edicao na tabela Livro, essa coluna deve aceitar números inferior a 20. Depois escreva outra instrução para remover a coluna qt_Edicao da tabela Livro
----------------------------------
Alter table Livro
	Add qt_Edicao Int
go
Alter table Livro
Add Constraint chk_Livro_qt_Edicao
	Check (qt_Edicao < 20)
go
Alter Table Livro
	Drop Constraint chk_Livro_qt_Edicao
go
Alter Table Livro
	Drop Column qt_Edicao
go
----------------------------------
--3. Renomear a coluna vl_Livro para vl_VolumeLivro
----------------------------------
