package br.com.fiapride.main;

import br.com.fiapride.model.Tenis;

public class SistemaPrincipal {

    public static void main(String[] args) {


        Tenis tenis1 = new Tenis();

        tenis1.modelo = "Nike Air Max";
        tenis1.cor = "Preto";
        tenis1.tamanho = 42;
        tenis1.preço = 599.90;
        tenis1.preço = 699.90;

        Tenis tenis2 = new Tenis();

        tenis2.modelo = "Adidas Ultraboost";
        tenis2.cor = "Branco";
        tenis2.tamanho = 40;
        tenis2.preço = 799.90;

        System.out.println("--- Cadastro de Tênis ---");

        System.out.println("Tênis 1:");
        System.out.println("Modelo: " + tenis1.modelo);
        System.out.println("Cor: " + tenis1.cor);
        System.out.println("Tamanho: " + tenis1.tamanho);
        System.out.println("Preço: R$ " + tenis1.preço);

        System.out.println();

        System.out.println("Tênis 2:");
        System.out.println("Modelo: " + tenis2.modelo);
        System.out.println("Cor: " + tenis2.cor);
        System.out.println("Tamanho: " + tenis2.tamanho);
        System.out.println("Preço: R$ " + tenis2.preço);
    }
}

