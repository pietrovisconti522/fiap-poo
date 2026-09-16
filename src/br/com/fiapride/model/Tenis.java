package br.com.fiapride.model;

public class Tenis {

    // Atributos privados
    private String modelo;
    private String cor;
    private int tamanho;
    private double preco;

    // Construtor
    public Tenis(String modelo, String cor, int tamanho, double preco) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setTamanho(tamanho);
        this.setPreco(preco);
    }

    // Método para alterar o preço
    public void alterarPreco(double novoPreco) {

        if (novoPreco <= 0) {
            System.out.println("Erro: o preço deve ser maior que zero.");
            return;
        }

        this.preco = novoPreco;

        System.out.println("Preço alterado com sucesso.");
        System.out.println("Novo preço: R$ " + this.preco);
    }

    // Método para aplicar desconto
    public void aplicarDesconto(double percentual) {

        if (percentual <= 0 || percentual >= 100) {
            System.out.println("Erro: o desconto deve estar entre 0% e 100%.");
            return;
        }

        this.preco = this.preco - (this.preco * percentual / 100);

        System.out.println("Desconto aplicado com sucesso.");
        System.out.println("Novo preço: R$ " + this.preco);
    }

    // Getter do modelo
    public String getModelo() {
        return this.modelo;
    }

    // Setter do modelo
    private void setModelo(String modelo) {

        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Erro: o modelo do tênis é obrigatório.");
        }
    }

    // Getter da cor
    public String getCor() {
        return this.cor;
    }

    // Setter da cor
    private void setCor(String cor) {
        this.cor = cor;
    }

    // Getter do tamanho
    public int getTamanho() {
        return this.tamanho;
    }

    // Setter do tamanho
    private void setTamanho(int tamanho) {

        if (tamanho > 0) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Erro: o tamanho deve ser maior que zero.");
        }
    }

    // Getter do preço
    public double getPreco() {
        return this.preco;
    }

    // Setter do preço
    private void setPreco(double preco) {

        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: o preço deve ser maior que zero.");
        }
    }
}