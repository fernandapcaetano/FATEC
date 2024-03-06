----------------------------------
--SCRIPT
----------------------------------
CREATE DATABASE IMOVEIS
go

USE IMOVEIS
go

-- Tabelas

CREATE TABLE Bairro (
       cd_Bairro            int NOT NULL,
       cd_Cidade            int NOT NULL,
       sg_Estado            char(2) NOT NULL,
       nm_Bairro            varchar(20) NULL
)
go

CREATE TABLE Cidade (
       cd_Cidade            int NOT NULL,
       sg_Estado            char(2) NOT NULL,
       nm_Cidade            varchar(20) NULL
)
go

CREATE TABLE Comprador (
       cd_Comprador         int NOT NULL,
       nm_Comprador         varchar(20) NULL,
       ds_Endereco          varchar(20) NULL,
       cd_CPF               int NULL,
       nm_Cidade            varchar(20) NULL,
       nm_Bairro            varchar(20) NULL,
       sg_Estado            varchar(20) NULL,
       cd_Telefone          varchar(20) NULL,
       ds_Email             varchar(20) NULL
)
go

CREATE TABLE Estado (
       sg_Estado            char(2) NOT NULL,
       nm_Estado            varchar(20) NULL
)
go

CREATE TABLE Faixa_Imovel (
       cd_Faixa             int NOT NULL,
       nm_Faixa             varchar(30) NULL,
       vl_Maximo            money NULL,
       vl_Minimo            money NULL
)
go

CREATE TABLE Imovel (
       cd_Imovel            int NOT NULL,
       cd_Vendedor          int NULL,
       cd_Bairro            int NULL,
       cd_Cidade            int NULL,
       sg_Estado            char(2) NULL,
       ds_Endereco          varchar(40) NULL,
       qt_AreaUtil          decimal(10,2) NULL,
       qt_AreaTotal         decimal(10,2) NULL,
       ds_Imovel            varchar(300) NULL,
       vl_Imovel            money NULL,
       qt_Ofertas           int NULL,
       ic_Vendido           char(1) NULL,
       dt_Lancto            datetime NULL,
       qt_ImovelIndicado    int NULL
)
go

CREATE TABLE Oferta (
       cd_Comprador         int NOT NULL,
       cd_Imovel            int NOT NULL,
       vl_Oferta            money NULL,
       dt_Oferta            datetime NULL
)
go

CREATE TABLE Vendedor (
       cd_Vendedor          int NOT NULL,
       nm_Vendedor          varchar(40) NULL,
       ds_Endereco          varchar(40) NULL,
       cd_CPF               decimal(11) NULL,
       nm_Cidade            varchar(20) NULL,
       nm_Bairro            varchar(20) NULL,
       sg_Estado            char(2) NULL,
       cd_Telefone          varchar(20) NULL,
       ds_Email             varchar(80) NULL
)
go
Create Table Contrato (
	cd_Contrato int not null,
	cd_Imovel int,
	cd_Comprador int,
	dt_Contrato datetime,
	vl_Contrato money,
	qt_Parcela int)
go
Create Table Parcelas (
	cd_Contrato int not null,
	qt_Parcela int not null,
	vl_Parcela money,
	dt_Vencimento datetime,
	dt_Pagamento datetime,
	vl_Multa money)
go
Create Table Inadimplentes (
	cd_Imovel int not null,
	qt_Parcela int not null,
	dt_Vencimento datetime,
	vl_Parcela money)
go

-- Chaves Prim�rias

ALTER TABLE Bairro
       ADD PRIMARY KEY (cd_Bairro, cd_Cidade, sg_Estado)
go
ALTER TABLE Cidade
       ADD PRIMARY KEY (cd_Cidade, sg_Estado)
go
ALTER TABLE Comprador
       ADD PRIMARY KEY (cd_Comprador)
go
ALTER TABLE Estado
       ADD PRIMARY KEY (sg_Estado)
go
ALTER TABLE Faixa_Imovel
       ADD PRIMARY KEY (cd_Faixa)
go
ALTER TABLE Imovel
       ADD PRIMARY KEY (cd_Imovel)
go
ALTER TABLE Oferta
       ADD PRIMARY KEY (cd_Comprador, cd_Imovel)
go
ALTER TABLE Vendedor
       ADD PRIMARY KEY (cd_Vendedor)
go
Alter Table Contrato
	   Add Primary Key (cd_Contrato)
go
Alter Table Parcelas
	   Add Primary Key (cd_Contrato, qt_Parcela)
go
Alter Table Inadimplentes
	   Add Primary Key (cd_Imovel, qt_Parcela)
go
-- Chaves Estrangeiras

ALTER TABLE Bairro
       ADD FOREIGN KEY (cd_Cidade, sg_Estado)
                             REFERENCES Cidade
go
ALTER TABLE Cidade
       ADD FOREIGN KEY (sg_Estado)
                             REFERENCES Estado
go
ALTER TABLE Imovel
       ADD FOREIGN KEY (cd_Vendedor)
                             REFERENCES Vendedor
go
ALTER TABLE Imovel
       ADD FOREIGN KEY (cd_Bairro, cd_Cidade, sg_Estado)
                             REFERENCES Bairro
go
ALTER TABLE Oferta
       ADD FOREIGN KEY (cd_Comprador)
                             REFERENCES Comprador
go
ALTER TABLE Oferta
       ADD FOREIGN KEY (cd_Imovel)
                             REFERENCES Imovel
go
Alter Table Parcelas
	   Add Foreign Key (cd_Contrato)
                             References Contrato
go
Alter Table Contrato
	   Add Foreign Key (cd_Imovel)
                             References Imovel
go
Alter Table Inadimplentes
	   Add Foreign Key (cd_Imovel)
                             References Imovel
go
-- Registros
insert into Estado
	values( 'SP','S�O PAULO')
go
insert into Estado
	values( 'RJ','RIO DE JANEIRO')
go


insert into Cidade
	values( 1,'SP','S�O PAULO')
go
insert into Cidade
	values(2,'SP','SANTO ANDR�')
go
insert into Cidade
	values(3,'SP','CAMPINAS')
go
insert into Cidade
	values(1,'RJ','RIO DE JANEIRO')
go
insert into Cidade
	values(2,'RJ','NITEROI')
go


insert into Bairro
	values(1,1,'SP','JARDINS')
go
insert into Bairro
	values(2,1,'SP','MORUMBI')
go
insert into Bairro
	values(3,1,'SP','AEROPORTO')
go
insert into Bairro
	values(1,1,'RJ','AEROPORTO')
go
insert into Bairro
	values(2,1,'RJ','NITEROI')
go


insert into Vendedor (cd_Vendedor, nm_Vendedor,ds_Endereco,ds_Email)
	values(1,'MARIA DA SILVA','RUA DO GRITO, 45','msilva@nova.com')
go
insert into Vendedor (cd_Vendedor, nm_Vendedor,ds_Endereco,ds_Email)
	values(2,'MARCO ANDRADE','AV. DA SAUDADE,325','mandrade@nova.com')
go
insert into Vendedor (cd_Vendedor, nm_Vendedor,ds_Endereco,ds_Email)
	values(3,'ANDR� CARDOSO','AV. BRASIL, 401','acardoso@nova.com')
go
insert into Vendedor (cd_Vendedor, nm_Vendedor,ds_Endereco,ds_Email)
	values(4,'TATIANA SOUZA','RUA DO IMPERADOR, 778','tsouza@nova.com')
go


insert into Imovel 
	(cd_Imovel,cd_Vendedor,cd_Bairro,cd_Cidade,sg_Estado,ds_Endereco,qt_AreaUtil,qt_AreaTotal,vl_Imovel)
	values(1,1,1,1,'SP','AL. TIETE, 3304/101',250,400,180000)
go
insert into Imovel
		(cd_Imovel,cd_Vendedor,cd_Bairro,cd_Cidade,sg_Estado,ds_Endereco,qt_AreaUtil,qt_AreaTotal,vl_Imovel)
	values(2,1,2,1,'SP','AV. MORUMBI, 2230',150,250,135000)
go
insert into Imovel
	(cd_Imovel,cd_Vendedor,cd_Bairro,cd_Cidade,sg_Estado,ds_Endereco,qt_AreaUtil,qt_AreaTotal,vl_Imovel)
	values(3,2,1,1,'RJ','R. GAL. OSORIO, 445/34',250,400,185000)
go
insert into Imovel
	(cd_Imovel,cd_Vendedor,cd_Bairro,cd_Cidade,sg_Estado,ds_Endereco,qt_AreaUtil,qt_AreaTotal,vl_Imovel)
	values(4,2,2,1,'RJ','R. D. PEDRO I, 882',120,200,110000)
go
insert into Imovel
	(cd_Imovel,cd_Vendedor,cd_Bairro,cd_Cidade,sg_Estado,ds_Endereco,qt_AreaUtil,qt_AreaTotal,vl_Imovel)
	values(5,3,3,1,'SP','AV. RUBENS BERTA, 2355',110,200,95000)
go
insert into Imovel
	(cd_Imovel,cd_Vendedor,cd_Bairro,cd_Cidade,sg_Estado,ds_Endereco,qt_AreaUtil,qt_AreaTotal,vl_Imovel)
	values(6,4,1,1,'RJ','R. GETULIO VARGAS, 552',200,300,99000)
go


insert into Comprador (cd_Comprador,nm_Comprador,ds_Endereco,ds_Email)
	values(1,'EMMANUEL ANTUNES','R. SARAIVA, 452','eantunes@nova.com')
go
insert into Comprador (cd_Comprador,nm_Comprador,ds_Endereco,ds_Email)
	values(2,'JOANA PEREIRA','AV PROTUGAL, 52','jpereira@nova.com')
go
insert into Comprador (cd_Comprador,nm_Comprador,ds_Endereco,ds_Email)
	values(3,'RONALDO CAMPELO','R. ESTADOS UNIDOS','rcampelo@nova.com')
go
insert into Comprador (cd_Comprador,nm_Comprador,ds_Endereco,ds_Email)
	values(4,'MANFRED AUGUSTO','AV. BRASIL,351','maugusto@nova.com')
go


insert into Oferta
	values(1,1,170000,'10-01-2009')
go
insert into Oferta
	values(1,3,180000,'10-01-2009')
go
insert into Oferta
	values(2,2,135000,'15-01-2009')
go
insert into Oferta
	values(2,4,100000,'15-02-2009')
go
insert into Oferta
	values(3,1,160000,'15-01-2009')
go
insert into Oferta
	values(3,2,140000,'20-02-2009')
go

insert into Faixa_Imovel
	values	(1,'BAIXO',0,105000)
			(2,'M�DIO',105001,180000)
			(3,'ALTO',180001,999999)
go
----------------------------------
--Atividade de Banco de Dados II--
----------------------------------
----------------------------------
----------------------------------
--1. Faça uma busca que mostre cd_Imovel, vl_Imovel e nm_Bairro, cujo código do vendedor seja 3.
----------------------------------
Select	I.cd_Imovel , I.vl_Imovel,
		B.nm_Bairro
From	Imovel as I inner join	Bairro as B
	on	I.cd_Bairro = B.cd_Bairro and
		I.cd_Cidade = B.cd_Cidade and
		I.sg_Estado = B.sg_Estado
Where	I.cd_Vendedor = 3
go
----------------------------------
--1. !!OUTRA MANEIRA!!
----------------------------------
Select	I.cd_Imovel, I.vl_Imovel,
		B.nm_Bairro
From	Imovel as I,
		Bairro as B
Where	I.cd_Bairro = B.cd_Bairro and
		I.cd_Cidade = B.cd_Cidade and
		I.sg_Estado = B.sg_Estado and
		I.cd_Vendedor = 3
go
----------------------------------
--2. Faça uma busca que mostre todos os imóveis que tenham ofertas cadastradas.
----------------------------------
Select	*
From	Imovel as I,
		Oferta as O
Where	I.cd_Imovel = O.cd_Imovel
go
----------------------------------
--3. Faça uma busca que mostre todos os imóveis e ofertas mesmo que não haja ofertas cadastradas para o imóvel.
----------------------------------
Select	I.cd_Imovel, I.ds_Endereco,
		O.vl_Oferta, O.dt_Oferta
From	Imovel as I,
		Oferta as O
Where	I.cd_Imovel = O.cd_Imovel
go
----------------------------------
--4. Faça uma busca que mostre os compradores e as respectivas ofertas realizadas por eles.
----------------------------------
Select	C.nm_Comprador,
		O.vl_Oferta
From	Comprador as C,
		Oferta as O
Where	C.cd_Comprador = O.cd_Comprador
go
----------------------------------
--5. Faça a mesma busca, porém acrescentando os compradores que ainda não fizeram ofertas para os imóveis.
----------------------------------
Select	C.cd_Comprador, C.nm_Comprador,
		O.vl_Oferta
From	Comprador as C
		Left join Oferta as O
On		C.cd_Comprador = O.cd_Comprador
go
----------------------------------
--6. Faça uma busca que mostre o endereço do imóvel, o bairro e nível de preço do imóvel.
----------------------------------
Select	I.ds_Endereco, I.vl_Imovel,
		B.nm_Bairro
From	Imovel as I
		inner join	Bairro as B
on		I.cd_Bairro = B.cd_Bairro
go
----------------------------------
--7. Verifique a diferença de valores entre o maior e o menor imóvel da tabela.
----------------------------------
Select	I.ds_Endereco, I.vl_Imovel,
		B.nm_Bairro, 
		F.nm_Faixa
From	Imovel as I,
		Bairro as B,
		Faixa_Imovel as F
Where	(I.vl_Imovel between F.vl_Maximo and F.vl_Minimo) and 
		I.cd_Bairro = B.cd_Bairro and 
		I.cd_Cidade = B.cd_Cidade and 
		I.sg_Estado=B.sg_Estado	
go
----------------------------------
--8. Mostre o código do vendedor e o menor valor do imóvel dele no cadastro. Exclua da busca os valores de imóveis inferiores a 10 mil.
----------------------------------
Select		cd_vendedor, min(vl_imovel) as minimo 
From		imovel 
Where		vl_imovel > 100000
Group by	cd_vendedor	
go
----------------------------------
--9. Mostre o código e o nome do comprador e a média do valor das ofertas e o número de ofertas deste comprador.
----------------------------------
Select	C.cd_comprador, C.nm_comprador, 
		AVG(O.vl_oferta) media, count(*) qtde_oferta 
From	Comprador C inner join Oferta O
		on C.cd_comprador = O.cd_comprador
Group by C.cd_comprador, C.nm_comprador
go