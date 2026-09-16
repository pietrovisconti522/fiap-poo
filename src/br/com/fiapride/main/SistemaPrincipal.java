package br.com.fiapride.main;

import br.com.fiapride.model.Tenis;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE TÊNIS =====");

        // Criando o primeiro tênis através do construtor
        Tenis tenis1 = new Tenis(
                "Nike Air Max",
                "Preto",
                42,
                599.90
        );

        // Criando o segundo tênis através do construtor
        Tenis tenis2 = new Tenis(
                "Adidas Ultraboost",
                "Branco",
                40,
                799.90
        );

        // Exibindo os dados através dos getters
        System.out.println("\n--- Tênis 1 ---");
        System.out.println("Modelo: " + tenis1.getModelo());
        System.out.println("Cor: " + tenis1.getCor());
        System.out.println("Tamanho: " + tenis1.getTamanho());
        System.out.println("Preço: R$ " + tenis1.getPreco());

        System.out.println("\n--- Tênis 2 ---");
        System.out.println("Modelo: " + tenis2.getModelo());
        System.out.println("Cor: " + tenis2.getCor());
        System.out.println("Tamanho: " + tenis2.getTamanho());
        System.out.println("Preço: R$ " + tenis2.getPreco());

        // Alterando o preço
        System.out.println("\n===== ALTERANDO PREÇO =====");

        tenis1.alterarPreco(699.90);

        // Aplicando desconto
        System.out.println("\n===== APLICANDO DESCONTO =====");

        tenis1.aplicarDesconto(10);

        // Testando preço inválido
        System.out.println("\n===== TESTE DE VALOR INVÁLIDO =====");

        tenis2.alterarPreco(-100);

        // Testando desconto inválido
        System.out.println("\n===== TESTE DE DESCONTO INVÁLIDO =====");

        tenis2.aplicarDesconto(150);

        // Testando construtor com tamanho inválido
        System.out.println("\n===== TESTE DE CONSTRUTOR =====");

        Tenis tenis3 = new Tenis(
                "Tênis Teste",
                "Azul",
                -10,
                300.00
        );

        System.out.println("Modelo: " + tenis3.getModelo());
        System.out.println("Tamanho: " + tenis3.getTamanho());
        System.out.println("Preço: R$ " + tenis3.getPreco());

        // Estado final
        System.out.println("\n===== ESTADO FINAL =====");

        System.out.println(
                "Tênis 1: " + tenis1.getModelo()
                + " | Preço: R$ " + tenis1.getPreco()
        );

        System.out.println(
                "Tênis 2: " + tenis2.getModelo()
                + " | Preço: R$ " + tenis2.getPreco()
        );
    }
}