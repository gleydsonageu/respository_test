package Semana06;

/*
 * 2) De acordo com as modificações realizadas no exercício
 * acima, a classe TesteProduto implementada na atividade
 * da semana passada continua compilando? Se não, quais
 * são os erros apresentados? Explique cada um deles. Altere
 * a classe TesteProduto para que a mesma volte a funcionar,
 * de acordo com as mudanças realizadas no exercício acima.
 */

//Resposta
/*Não, o programa percebe que foi implementado um novo construtor com parametros, 
 * assim o construtor padrão deixa de existir de forma padrão e passa a força ou 
 * sua criação ou a utilização do novo construtor. 
 * Assim inicialização dos objetos não reconhece um construtor sem paramentro, 
 * orientado a utilização do novo. teste teste*/

public class TesteProduto {

	public static void main(String[] args) {
		
		Fornecedor fornecedor1 = new Fornecedor("Zé Maria","1234321");
		Fornecedor fornecedor2 = new Fornecedor("Claudio", "543212345");
		Fornecedor fornecedor3 = new Fornecedor("José", "9999999");
		
		Produto produto = new Produto(5, "Estabilizador", 200.00f, fornecedor3);
		
		Produto produto1 = new Produto(1, "TV LCD", 3500.00f, fornecedor1);
		Produto produto2 = new Produto(2,"notebook", 2000.00f, fornecedor2);
		Produto produto3 = new Produto(3,"impressora", 232.00f, fornecedor2);
		Produto produto4 = new Produto(4,"Filtro de Linha", 80.00f, fornecedor3);
		
		produto.imprimirMedia();
		produto1.imprimir();
		produto2.imprimir();
		produto3.imprimir();
		produto4.imprimir();
		produto.imprimir();
		produto4.imprimirMedia(); /* aqui a chamada desse metodo pode ser por qualquer 
									objeto pelo fato dos seus elementos estarem no metodo construtor, 
									assim todas as vezes que o metodo é chamado os atributos static são 
									incrementados */ 
	}


}
