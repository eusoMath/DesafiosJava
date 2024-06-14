package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>();
		return produtosPorNome;
	}
	
	public Set<Produto> exibirPorPrecos(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoSet.addAll(produtoSet);
		return produtosPorPreco;
	}
	
	public static void main(String args[]) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		cadastroProdutos.adicionarProduto("Produto 0", 1L, 15d, 5);
		cadastroProdutos.adicionarProduto("Produto 1", 2L, 35d, 10);
		cadastroProdutos.adicionarProduto("Produto 2", 3L, 25d, 2);
		cadastroProdutos.adicionarProduto("Produto 3", 4L, 55d, 2);
		
		System.out.println(cadastroProdutos.produtoSet);
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
	}
}
