package Semana06;

public class Produto {

	private int codigo;
	private String nome;
	private float valor;
	private Fornecedor fornecedor;
	private static float totalProdutos;  //soma o valor do produto criado.
	private static int numeroProdutos; //conta o total de produtos criados

	
	public static float getMediaValor() {
		float media;
		media = totalProdutos/numeroProdutos;
		return media;
	}
	
	public static int getNumeroProdutos() {
		return numeroProdutos;
	}
	
	public static float getTotalProdutos() {
		return totalProdutos;
	}
	//Metodos construtor 
	public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.fornecedor = fornecedor;
		numeroProdutos++;
		totalProdutos += valor;	
	}

	public Produto(){
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public float atualizarPreco(float i) {
		valor = (valor*i)/100;
		return valor;
	}

	public void imprimir() {
		System.out.println("codigo do produto: "+ this.getCodigo());
		System.out.println("nome do produto: "+ this.getNome());
		System.out.println("valor do produto: "+ this.getValor());
		System.out.println("nome do fornecedor: "+ this.getFornecedor().getNome());
		System.out.println("CNPF do fornecedor: "+ this.getFornecedor().getCNPJ());
		System.out.println("\n");
	}
	
	public void imprimirMedia() {
		System.out.println("numero de produtos cadastrados: "+ this.getNumeroProdutos());
		System.out.println("total dos valores dos produtos: "+ this.getTotalProdutos());
		System.out.println("média dos valores: "+ this.getMediaValor());
		System.out.println("\n");
	}
}
