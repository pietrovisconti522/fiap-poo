# FiapRide - Aula 04

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos.

## Objeto escolhido

O objeto escolhido para o projeto pessoal foi um Tênis.

A classe `Tenis` representa um tênis do mundo real dentro do sistema.

## Atributos

A classe possui os seguintes atributos:

- `modelo`: modelo do tênis.
- `cor`: cor do tênis.
- `tamanho`: tamanho do tênis.
- `preco`: preço do tênis.

Todos os atributos são privados para garantir o encapsulamento.

## Encapsulamento

Os atributos da classe `Tenis` foram definidos como `private`.

Os dados são acessados através de getters públicos.

Os setters são privados e possuem regras de negócio quando necessário.

## Construtor

Na Aula 04 foi utilizado um construtor para definir o estado inicial do objeto.

O construtor recebe:

- modelo
- cor
- tamanho
- preço

Exemplo:

Tenis tenis1 = new Tenis(
    "Nike Air Max",
    "Preto",
    42,
    599.90
);

Dessa forma, o objeto já nasce com seus principais dados definidos.

## Regras do construtor

O construtor utiliza os setters privados para validar os dados recebidos.

O modelo não pode ser vazio.

O tamanho deve ser maior que zero.

O preço deve ser maior que zero.

## Métodos

### alterarPreco()

Permite alterar o preço do tênis.

O novo preço precisa ser maior que zero.

### aplicarDesconto()

Aplica um desconto percentual ao preço do tênis.

O desconto deve ser maior que 0% e menor que 100%.

## Getters

Foram criados getters públicos para consultar os dados:

- `getModelo()`
- `getCor()`
- `getTamanho()`
- `getPreco()`

## Setters

Os setters são privados:

- `setModelo()`
- `setCor()`
- `setTamanho()`
- `setPreco()`

Isso impede que outras classes alterem os atributos diretamente.

## Testes realizados

Foram realizados testes para:

- Criar objetos utilizando o construtor.
- Consultar os dados utilizando getters.
- Alterar o preço.
- Aplicar desconto.
- Tentar utilizar preço inválido.
- Tentar utilizar tamanho inválido.
- Verificar regras de validação durante a criação do objeto.

## Estrutura do projeto

FiapRide
|
├── .gitignore
├── README.md
├── FiapRide.asta
|
└── src
    ├── br.com.fiapride.model
    │   └── Tenis.java
    |
    └── br.com.fiapride.main
        └── SistemaPrincipal.java

## Objetivo da Aula 04

O objetivo da Aula 04 foi compreender o funcionamento dos construtores em Java e utilizá-los para definir o estado inicial dos objetos.

Também foram aplicadas regras de negócio durante a criação dos objetos, garantindo que eles sejam inicializados com dados válidos.
