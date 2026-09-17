package br.com.fiapride.main;

import br.com.fiapride.model.Marca;
import br.com.fiapride.model.Tenis;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE TÊNIS =====");

        // Criando os objetos Marca
        Marca nike = new Marca("Nike");
        Marca adidas = new Marca("Adidas");

        // Criando os objetos Tênis associados às marcas
        Tenis tenis1 = new Tenis(
                "Air Max",
                "Preto",
                42,
                599.90,
                nike
        );

        Tenis tenis2 = new Tenis(
                "Ultraboost",
                "Branco",
                40,
                799.90,
                adidas
        );

        // Exibindo os dados do primeiro tênis
        System.out.println("\n--- Tênis 1 ---");
        System.out.println("Modelo: " + tenis1.getModelo());
        System.out.println("Marca: " + tenis1.getMarca().getNome());
        System.out.println("Cor: " + tenis1.getCor());
        System.out.println("Tamanho: " + tenis1.getTamanho());
        System.out.println("Preço: R$ " + tenis1.getPreco());

        // Exibindo os dados do segundo tênis
        System.out.println("\n--- Tênis 2 ---");
        System.out.println("Modelo: " + tenis2.getModelo());
        System.out.println("Marca: " + tenis2.getMarca().getNome());
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

        // Demonstrando a associação
        System.out.println("\n===== TESTE DE ASSOCIAÇÃO =====");

        System.out.println(
                "O tênis " + tenis1.getModelo()
                + " pertence à marca "
                + tenis1.getMarca().getNome()
        );

        System.out.println(
                "O tênis " + tenis2.getModelo()
                + " pertence à marca "
                + tenis2.getMarca().getNome()
        );
    }
}