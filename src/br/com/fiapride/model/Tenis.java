package br.com.fiapride.model;

public class Tenis {

    private String modelo;
    private String cor;
    private int tamanho;
    private double preco;

    public Tenis(String modelo, String cor, int tamanho, double preco) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setTamanho(tamanho);
        this.setPreco(preco);
    }

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

    public String getModelo() {
        return this.modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    private void setTamanho(int tamanho) {
        if (tamanho > 0) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Erro: o tamanho deve ser maior que zero.");
        }
    }

    public double getPreco() {
        return this.preco;
    }

    private void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: o preço deve ser maior que zero.");
        }
    }
}