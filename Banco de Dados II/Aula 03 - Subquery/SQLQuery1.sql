-----------------
--1. Faça uma lista de imóveis da mesma cidade do imóvel 2. Exclua o imóvel 2 da sua busca
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
--2. Faça uma lista que mostre todos os imóveis que custam mais que 50% do menor de preço dos imóveis.
-----------------
Select	cd_Imovel, vl_Imovel
From	Imovel
Where	vl_Imovel > (	Select	MIN(vl_Imovel)
						From	Imovel)
go
-----------------
--3. Faça uma lista com o código e nome dos compradores que tenham ofertas cadastradas com valor superior a R$ 150 mil
-----------------
Select	cd_Comprador, nm_Comprador
From	Comprador
Where	cd_Comprador in (	Select cd_Comprador
							From Oferta
							Where vl_Oferta > 150000)
go
-----------------
--4. Faça uma lista dos imóveis com oferta superior à média das ofertas do imóvel 2.
-----------------
Select	*
From	Imovel
Where	vl_Imovel > (	Select	AVG(vl_Oferta)
						From	Oferta
						Where	cd_Imovel = 2)
go
-----------------
--5. Faça uma lista dos imóveis com preço superior à média de preço dos imóveis do mesmo bairro.
-----------------
Select	*
From	Imovel as I
Where	vl_Imovel > (	Select	AVG(vl_Imovel)
						From	Imovel
						Where	cd_Bairro = I.cd_Bairro)
go
-----------------
--6. Faça uma lista dos imóveis com o maior preço agrupado por bairro, cujo maior preço seja superior à média de preços dos imóveis.
-----------------
Select	*
From	Imovel
Where	vl_Imovel in (	Select	AVG(vl_Imovel)
						From	Imovel
						Group By cd_Bairro)
go
-----------------
--7. Faça uma lista dos imóveis que tem o menor preço igual a oferta.
-----------------
Select	*
From	Imovel as I
Where	vl_Imovel in (	Select	vl_Oferta
						From	Oferta
						Where	cd_Imovel = I.cd_Imovel)
go
-----------------
--8. Faça uma lista com os imóveis que têm o preço igual ao menor preço de todos os vendedores, exceto os imóveis do próprio vendedor.
-----------------
Select	*
From	Imovel as I
Where	vl_Imovel = (	Select	min(vl_Imovel)
						From	Imovel
						Where	cd_Vendedor <> I.cd_Vendedor)
-----------------
--9. Faça uma lista com as ofertas menores que todas as ofertas do comprador 2, exceto os imóveis do próprio comparador.
-----------------
Select	cd_Imovel, cd_Comprador, vl_Oferta
From	Oferta
Where	vl_Oferta < (	Select	max(vl_Oferta)
						From	Oferta
						Where	cd_Comprador = 2)
And cd_Comprador <> 2
go
-----------------
--10.	Faça uma lista de todos os imóveis cujo Estado e Cidade sejam os mesmos do vendedor 3, exceto os imóveis do vendedor 3.
-----------------
Select	cd_Imovel, sg_Estado, cd_Cidade, cd_Vendedor
From	Imovel
Where	sg_Estado = (	Select sg_Estado From Imovel Where cd_Vendedor = 3) and
		cd_Cidade = (Select cd_Cidade From Imovel Where cd_Vendedor = 3) and
		cd_Vendedor <> 3
-----------------
--11.	Faça uma lista com os nomes de vendedores cujos imóveis sejam do mesmo estado do imóvel 1.
-----------------
Select nm_Vendedor, cd_Imovel
From Vendedor as V, (Select cd_Vendedor, cd_Imovel From Imovel
Where sg_Estado = (Select sg_Estado From Imovel
Where cd_Imovel = 1)) as I
Where V.cd_Vendedor = I.cd_Vendedor