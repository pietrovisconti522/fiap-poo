package br.com.fiapride.main;

import br.com.fiapride.model.Tenis;

public class TesteMeuObjeto {

    public static void main(String[] args) {

        System.out.println("===== TESTE DO MEU OBJETO: TÊNIS =====");

        Tenis tenis1 = new Tenis(
                "Nike Air Max",
                "Preto",
                42,
                599.90
        );

        Tenis tenis2 = new Tenis(
                "Adidas Ultraboost",
                "Branco",
                40,
                799.90
        );

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

        System.out.println("\n--- Alterando preço ---");
        tenis1.alterarPreco(699.90);

        System.out.println("\n--- Aplicando desconto ---");
        tenis1.aplicarDesconto(10);

        System.out.println("\n--- Testando tamanho inválido ---");


        System.out.println("\n--- Testando preço inválido ---");
        tenis2.alterarPreco(-100);

        System.out.println("\n--- Estado Final ---");
        System.out.println(
                tenis1.getModelo() +
                " | Preço: R$ " +
                tenis1.getPreco()
        );

        System.out.println(
                tenis2.getModelo() +
                " | Preço: R$ " +
                tenis2.getPreco()
        );

        // TESTE DE HACK
        // Descomente a linha abaixo para ver o Eclipse bloquear o acesso:

        // tenis1.preco = 999999.0;
    }
}