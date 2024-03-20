-----------------
--1. Fa�a uma lista de im�veis da mesma cidade do im�vel 2. Exclua o im�vel 2 da sua busca
-----------------
Select	cd_Imovel, vl_Imovel
From	Imovel
Where	cd_Cidade = (	Select cd_Cidade 
						From Imovel
						Where cd_Imovel = 2) 
and		sg_Estado =	(	Select	sg_Estado
						From	Imovel
						Where	cd_Imovel = 2) 
and
		cd_Imovel <> 2
	
go
-----------------
--2. Fa�a uma lista que mostre todos os im�veis que custam mais que 50% do menor de pre�o dos im�veis.
-----------------
Select	cd_Imovel, vl_Imovel
From	Imovel
Where	vl_Imovel > (	Select	MIN(vl_Imovel)
						From	Imovel)
go
-----------------
--3. Fa�a uma lista com o c�digo e nome dos compradores que tenham ofertas cadastradas com valor superior a R$ 150 mil
-----------------
Select	cd_Comprador, nm_Comprador
From	Comprador
Where	cd_Comprador in (	Select cd_Comprador
							From Oferta
							Where vl_Oferta > 150000)
go
-----------------
--4. Fa�a uma lista dos im�veis com oferta superior � m�dia das ofertas do im�vel 2.
-----------------
Select	*
From	Imovel
Where	vl_Imovel > (	Select	AVG(vl_Oferta)
						From	Oferta
						Where	cd_Imovel = 2)
go
-----------------
--5. Fa�a uma lista dos im�veis com pre�o superior � m�dia de pre�o dos im�veis do mesmo bairro.
-----------------
Select	*
From	Imovel as I
Where	vl_Imovel > (	Select	AVG(vl_Imovel)
						From	Imovel
						Where	cd_Bairro = I.cd_Bairro)
go
-----------------
--6. Fa�a uma lista dos im�veis com o maior pre�o agrupado por bairro, cujo maior pre�o seja superior � m�dia de pre�os dos im�veis.
-----------------
Select	*
From	Imovel
Where	vl_Imovel in (	Select	AVG(vl_Imovel)
						From	Imovel
						Group By cd_Bairro)
go
-----------------
--7. Fa�a uma lista dos im�veis que tem o menor pre�o igual a oferta.
-----------------
Select	*
From	Imovel as I
Where	vl_Imovel in (	Select	vl_Oferta
						From	Oferta
						Where	cd_Imovel = I.cd_Imovel)
go
-----------------
--8. Fa�a uma lista com os im�veis que t�m o pre�o igual ao menor pre�o de todos os vendedores, exceto os im�veis do pr�prio vendedor.
-----------------
Select	*
From	Imovel as I
Where	vl_Imovel = (	Select	min(vl_Imovel)
						From	Imovel
						Where	cd_Vendedor <> I.cd_Vendedor)
-----------------
--9. Fa�a uma lista com as ofertas menores que todas as ofertas do comprador 2, exceto os im�veis do pr�prio comparador.
-----------------
Select	cd_Imovel, cd_Comprador, vl_Oferta
From	Oferta
Where	vl_Oferta < (	Select	max(vl_Oferta)
						From	Oferta
						Where	cd_Comprador = 2)
And cd_Comprador <> 2
go
-----------------
--10.	Fa�a uma lista de todos os im�veis cujo Estado e Cidade sejam os mesmos do vendedor 3, exceto os im�veis do vendedor 3.
-----------------
Select	cd_Imovel, sg_Estado, cd_Cidade, cd_Vendedor
From	Imovel
Where	sg_Estado = (	Select sg_Estado From Imovel Where cd_Vendedor = 3) and
		cd_Cidade = (Select cd_Cidade From Imovel Where cd_Vendedor = 3) and
		cd_Vendedor <> 3
-----------------
--11.	Fa�a uma lista com os nomes de vendedores cujos im�veis sejam do mesmo estado do im�vel 1.
-----------------
Select nm_Vendedor, cd_Imovel
From Vendedor as V, (Select cd_Vendedor, cd_Imovel From Imovel
Where sg_Estado = (Select sg_Estado From Imovel
Where cd_Imovel = 1)) as I
Where V.cd_Vendedor = I.cd_Vendedor