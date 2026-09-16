package br.com.fiapride.model;

public class Tenis {
	
	public String modelo;
	public String cor; 
	public double tamanho; 
	public double preco;
	
	public void alterarPreco(double novoPreco) {
		
		if (novoPreco <= 0) {
			
			System.out.println("Erro: o preço deve ser maior que zero.");
			return;
		}
		
		this.preco = novoPreco;
		
		System.out.println("Preço alterado com sucesso.");
		System.out.println("Novo preço: R$ " + this.preco);
	}
	
	public void aplicarDesconto(double percentual) {
		
		if (percentual <= 0 || percentual >= 100) {
			System.out.println("Erro: o desconto deve estar entre 0% e 100%.");
			return;
		}
		
		this.preco = this.preco - (this.preco * percentual / 100);
		
		System.out.println("Desconto aplicado com sucesso.");
		System.out.println("Novo preço: R$ " + this.preco);
	}
}