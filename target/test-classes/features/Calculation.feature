#language: pt
#Author: Priscila Barbosa

@calculation
Funcionalidade: Realizar a soma de três números na calculadora android
	Eu como usuário do android
	Quero realizar a soma de três números
	Para obter o resultado do cálculo

	Cenário: Realizar a soma de três números com sucesso
		Dado que o usuário clique no número dois
		E clique no operador de soma
		E clique no número três
		E clique no operador de soma
		E clique no número quatro
		Quando clicar no sinal de igual
		Então irá apresentar o resultado da soma igual a nove