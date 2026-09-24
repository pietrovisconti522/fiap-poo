package br.com.fiapride.model;

public class TenisBasquete extends Tenis {

    // Atributo exclusivo do tênis de basquete
    private boolean canoAlto;

    // Construtor
    public TenisBasquete(
            String modelo,
            String cor,
            int tamanho,
            double preco,
            Marca marca,
            boolean canoAlto) {

        // Chama o construtor da superclasse Tenis
        super(modelo, cor, tamanho, preco, marca);

        // Atributo específico desta classe
        this.canoAlto = canoAlto;
    }

    // Getter do cano alto
    public boolean isCanoAlto() {
        return this.canoAlto;
    }
}