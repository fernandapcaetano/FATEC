Use Vendas
go

-----------------------
---1. Mostre o país e a cidade que tenha mais que 6 clientes
-----------------------
Select	E.nm_Pais, E.nm_Cidade, Count(*) as Contagem
From	ClienteEndereco as CE inner join Endereco as E
on		CE.cd_Endereco = E.cd_Endereco
Group by E.nm_Pais, E.nm_Cidade
Having Count(*) > 6
go
-----------------------
---2. Mostre os nomes dos três primeiros clientes que compraram a maior quantidade de produtos de uma só vez
-----------------------
Select top(3)	V.cd_Cliente, C.nm_Primeiro, Count(*) as Quantidade
From	Cliente as C, Venda as V, ItensVenda as IV
Where	V.cd_Venda = IV.cd_Venda and
		V.cd_Cliente = C.cd_Cliente
Group By V.cd_Cliente, C.nm_Primeiro
Order By Count(*) Desc
go
-----------------------
---3. Mostre o código e o nome do produto que mais vendeu
-----------------------
Select top(2)	P.cd_Produto, P.ds_Produto, Count(*) Quantidade
From	Produto as P, ItensVenda as IV
Where	P.cd_Produto = IV.cd_Produto
Group By P.cd_Produto, P.ds_Produto
Order By Count(*) Desc
go
-----------------------
---4. Mostre o código, o nome, a soma da quantidade e o do total do valor unitário de todos os produtos vendidos, somente para os produtos com valor unitário maiores que a 1.450,00
-----------------------
Select	P.cd_Produto, P.ds_Produto, SUM(IV.qt_Produto) Quantidade, SUM(IV.vl_Unitario) Unitario 
From	Produto as P, ItensVenda as IV
Where	P.cd_Produto = IV.cd_Produto and
		IV.vl_Unitario > 1450
Group By	P.cd_Produto, P.ds_Produto
go
-----------------------
---5. Mostre qual foi o lucro das vendas em junho de 2008
-----------------------
Select Sum((IV.vl_Unitario - IV.vl_Desconto - P.vl_Custo) * IV.qt_Produto) ValorTotal
From ItensVenda IV, Venda V, Produto P
Where IV.cd_Venda = V.cd_Venda and
 P.cd_Produto = IV.cd_Produto and
 Month(V.dt_Venda) = 6 and
 Year(V.dt_Venda) = 2008 
 go
-----------------------
---6. Mostrar o primeiro nome, o último nome e endereço de todos os cliente que tenha o escritório em Quebec no Canada
-----------------------
Select	C.nm_Primeiro, C.nm_Ultimo, E.ds_Endereco1
From	Cliente as C, Endereco as E, ClienteEndereco as CE
Where	C.cd_Cliente = CE.cd_Cliente and
		CE.cd_Endereco = E.cd_Endereco and
		CE.ds_TipoEndereco = 'Main Office' and
		E.nm_Cidade = 'Quebec'
go
-----------------------
---7. Qual é o primeiro e o último nome do cliente que comprou o produto mais caro
-----------------------
Select top(3)	C.nm_Primeiro, C.nm_Ultimo, MAX(IV.vl_Unitario) maior
From	Cliente as C, Venda as V, ItensVenda as IV
Where	C.cd_Cliente = V.cd_Cliente and
		V.cd_Venda = IV.cd_Venda
Group By C.nm_Primeiro, C.nm_Ultimo
Order by maior Desc
go
-----------------------
---8. Qual é o produto mais caro já vendido
-----------------------
Select top(1) P.ds_Produto, MAX(IV.vl_Unitario) maior
From	Venda V, ItensVenda IV, Produto P
Where	V.cd_Venda = IV.cd_Venda and
		IV.cd_Produto = P.cd_Produto
Group By P.ds_Produto
Order By maior desc
-----------------------
---9. Qual é a porcentagem aplicada no valor de venda em relação ao valor de custo de todos os Produto cadastrados no Banco de Dados
-----------------------
Select cd_Produto, ds_Produto, vl_Custo, vl_Venda,
 ((vl_Venda * 100) / vl_Custo) - 100 Porcentagem
From Produto
go
-----------------------
---10. Qual é a soma dos descontos aplicados nas vendas em junho de 2008
-----------------------
Select sum(vl_Desconto) Desconto
From Venda V inner Join ItensVenda IV
on V.cd_Venda = IV.cd_Venda
Where Month(V.dt_Venda) = 6 and Year(V.dt_Venda) = 2008
go