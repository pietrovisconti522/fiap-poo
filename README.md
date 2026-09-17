## Aula 05 - Associação de Objetos

Na Aula 05 foi implementado o relacionamento entre objetos.

No projeto pessoal, a classe `Tenis` foi associada à classe `Marca`.

Um tênis possui uma marca, representada pelo atributo:

private Marca marca;

A classe `Marca` possui o atributo `nome`.

A associação permite que o objeto `Tenis` acesse informações do objeto `Marca`.

Exemplo:

tenis1.getMarca().getNome();

Nesse caso, o objeto `Tenis` acessa sua `Marca` e depois consulta o nome dela.

## Classes da Aula 05

### Tenis

Possui:

- modelo
- cor
- tamanho
- preco
- marca

### Marca

Possui:

- nome

## Conceito de Associação

A associação foi utilizada para representar o relacionamento:

Tenis TEM UMA Marca.

O objeto `Marca` é criado separadamente e depois passado para o construtor de `Tenis`.

Isso demonstra a passagem de objetos como parâmetros e a comunicação entre objetos.

## Testes realizados

Foram realizados testes para:

- Criar objetos da classe `Marca`.
- Criar objetos da classe `Tenis`.
- Associar cada tênis a uma marca.
- Consultar a marca através do tênis.
- Consultar o nome da marca através do objeto associado.
- Alterar o preço do tênis.
- Aplicar desconto.
- Testar regras de negócio.
