package br.com.fiapride.main;

import br.com.fiapride.model.Marca;
import br.com.fiapride.model.Tenis;
import br.com.fiapride.model.TenisBasquete;
import br.com.fiapride.model.TenisCorrida;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE TÊNIS =====");

        // Criando as marcas
        Marca nike = new Marca("Nike");
        Marca adidas = new Marca("Adidas");

        // Criando um tênis de corrida
        TenisCorrida tenisCorrida = new TenisCorrida(
                "Air Zoom Pegasus",
                "Preto",
                42,
                699.90,
                nike,
                "Neutra"
        );

        // Criando um tênis de basquete
        TenisBasquete tenisBasquete = new TenisBasquete(
                "D.O.N. Issue",
                "Vermelho",
                41,
                799.90,
                adidas,
                true
        );

        // Exibindo dados do tênis de corrida
        System.out.println("\n--- TÊNIS DE CORRIDA ---");

        System.out.println("Modelo: " + tenisCorrida.getModelo());
        System.out.println("Marca: " + tenisCorrida.getMarca().getNome());
        System.out.println("Cor: " + tenisCorrida.getCor());
        System.out.println("Tamanho: " + tenisCorrida.getTamanho());
        System.out.println("Preço: R$ " + tenisCorrida.getPreco());
        System.out.println("Tipo de pisada: " + tenisCorrida.getTipoPisada());

        // Exibindo dados do tênis de basquete
        System.out.println("\n--- TÊNIS DE BASQUETE ---");

        System.out.println("Modelo: " + tenisBasquete.getModelo());
        System.out.println("Marca: " + tenisBasquete.getMarca().getNome());
        System.out.println("Cor: " + tenisBasquete.getCor());
        System.out.println("Tamanho: " + tenisBasquete.getTamanho());
        System.out.println("Preço: R$ " + tenisBasquete.getPreco());

        if (tenisBasquete.isCanoAlto()) {
            System.out.println("Cano alto: Sim");
        } else {
            System.out.println("Cano alto: Não");
        }

        // Testando método herdado
        System.out.println("\n--- TESTE DE HERANÇA ---");

        tenisCorrida.alterarPreco(749.90);

        System.out.println(
                "Novo preço do tênis de corrida: R$ "
                + tenisCorrida.getPreco()
        );

        // Testando desconto herdado
        tenisBasquete.aplicarDesconto(10);

        System.out.println(
                "Preço do tênis de basquete após desconto: R$ "
                + tenisBasquete.getPreco()
        );
    }
}