package br.com.fiapride.main;

import br.com.fiapride.model.Tenis;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Tenis tenis1 = new Tenis();

        tenis1.modelo = "Nike Air Max";
        tenis1.cor = "Preto";
        tenis1.tamanho = 42;
        tenis1.preco = 599.90;

        Tenis tenis2 = new Tenis();

        tenis2.modelo = "Adidas Ultraboost";
        tenis2.cor = "Branco";
        tenis2.tamanho = 40;
        tenis2.preco = 799.90;

        System.out.println("===== SISTEMA DE TÊNIS =====");

        System.out.println("\n--- Tênis 1 ---");
        System.out.println("Modelo: " + tenis1.modelo);
        System.out.println("Cor: " + tenis1.cor);
        System.out.println("Tamanho: " + tenis1.tamanho);
        System.out.println("Preço: R$ " + tenis1.preco);

        System.out.println("\n--- Tênis 2 ---");
        System.out.println("Modelo: " + tenis2.modelo);
        System.out.println("Cor: " + tenis2.cor);
        System.out.println("Tamanho: " + tenis2.tamanho);
        System.out.println("Preço: R$ " + tenis2.preco);

        System.out.println("\n===== ALTERANDO PREÇO =====");

        tenis1.alterarPreco(699.90);

        System.out.println("\n===== APLICANDO DESCONTO =====");

        tenis1.aplicarDesconto(10);

        System.out.println("\n===== TESTE DE VALOR INVÁLIDO =====");

        tenis2.alterarPreco(-100);

        System.out.println("\n===== TESTE DE DESCONTO INVÁLIDO =====");

        tenis2.aplicarDesconto(150);

        System.out.println("\n===== ESTADO FINAL =====");

        System.out.println("Tênis 1: " + tenis1.modelo
                + " | Preço: R$ " + tenis1.preco);

        System.out.println("Tênis 2: " + tenis2.modelo
                + " | Preço: R$ " + tenis2.preco);
    }
}