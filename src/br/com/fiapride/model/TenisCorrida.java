package br.com.fiapride.model;

public class TenisCorrida extends Tenis {

    // Atributo exclusivo do tênis de corrida
    private String tipoPisada;

    // Construtor
    public TenisCorrida(
            String modelo,
            String cor,
            int tamanho,
            double preco,
            Marca marca,
            String tipoPisada) {

        // Chama o construtor da superclasse Tenis
        super(modelo, cor, tamanho, preco, marca);

        // Atributo específico desta classe
        this.tipoPisada = tipoPisada;
    }

    // Getter do tipo de pisada
    public String getTipoPisada() {
        return this.tipoPisada;
    }
}