# FiapRide - Aula 03

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

Todos os atributos foram encapsulados utilizando o modificador `private`.

## Encapsulamento

Na Aula 03, os atributos da classe `Tenis` foram protegidos utilizando encapsulamento.

Agora outras classes não conseguem acessar diretamente os atributos.

Exemplo que não é permitido:

tenis1.preco = 999999.0;

O acesso deve ser realizado através dos métodos da classe.

## Getters

Foram criados getters públicos para consultar os dados do objeto:

- `getModelo()`
- `getCor()`
- `getTamanho()`
- `getPreco()`

## Setters

Os setters foram criados como métodos privados:

- `setModelo()`
- `setCor()`
- `setTamanho()`
- `setPreco()`

Dessa forma, outras classes não conseguem alterar os atributos diretamente.

## Regras de negócio

O sistema possui algumas regras de proteção.

O tamanho do tênis deve ser maior que zero.

O preço também deve ser maior que zero.

Caso seja informado um valor inválido, o sistema bloqueia a alteração.

## Construtor

Foi criado um construtor que recebe:

- modelo
- cor
- tamanho
- preço

Exemplo:

Tenis tenis1 = new Tenis("Nike Air Max", "Preto", 42, 599.90);

## Métodos de comportamento

A classe continua possuindo os métodos:

### alterarPreco()

Permite alterar o preço do tênis, desde que o novo preço seja maior que zero.

### aplicarDesconto()

Aplica um desconto percentual ao preço do tênis.

O desconto precisa ser maior que 0% e menor que 100%.

## Testes realizados

Foi criado o arquivo `TesteMeuObjeto.java` para testar exclusivamente o projeto pessoal.

Foram realizados testes para:

- Consultar os dados através dos getters.
- Alterar o preço.
- Aplicar desconto.
- Tentar utilizar um preço inválido.
- Tentar cadastrar um tamanho inválido.
- Verificar a proteção dos atributos privados.

## Estrutura do projeto

FiapRide
|
├── .gitignore
├── README.md
|
└── src
    ├── br.com.fiapride.model
    │   └── Tenis.java
    |
    └── br.com.fiapride.main
        ├── SistemaPrincipal.java
        └── TesteMeuObjeto.java

## Objetivo da Aula 03

O objetivo da Aula 03 foi aprender o conceito de encapsulamento, utilizando atributos privados, getters, setters, construtores e regras de negócio para proteger os dados dos objetos.