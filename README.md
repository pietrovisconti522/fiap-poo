## Aula 06 - Herança

Na Aula 06 foi implementado o conceito de herança no projeto pessoal.

A classe `Tenis` foi utilizada como superclasse.

Foram criadas duas subclasses:

- `TenisCorrida`
- `TenisBasquete`

## Superclasse

A classe `Tenis` possui os atributos:

- `modelo`
- `cor`
- `tamanho`
- `preco`
- `marca`

Esses atributos são comuns aos diferentes tipos de tênis.

## Subclasse TenisCorrida

A classe `TenisCorrida` herda da classe `Tenis`.

Além dos atributos herdados, possui:

- `tipoPisada`

A relação utilizada é:

TenisCorrida É UM Tenis.

## Subclasse TenisBasquete

A classe `TenisBasquete` também herda da classe `Tenis`.

Além dos atributos herdados, possui:

- `canoAlto`

A relação utilizada é:

TenisBasquete É UM Tenis.

## Uso do extends

As classes filhas utilizam a palavra `extends`:

public class TenisCorrida extends Tenis

public class TenisBasquete extends Tenis

Isso permite que as subclasses reutilizem atributos e métodos da classe `Tenis`.

## Uso do super

Os construtores das subclasses utilizam `super()` para chamar o construtor da classe `Tenis`.

Dessa forma, a superclasse continua responsável pela inicialização dos seus próprios atributos.

## Reaproveitamento de código

Os métodos `alterarPreco()` e `aplicarDesconto()` não precisaram ser repetidos nas subclasses.

Eles são herdados diretamente da classe `Tenis`.

## Testes realizados

Foram realizados testes para:

- Criar um tênis de corrida.
- Criar um tênis de basquete.
- Utilizar atributos específicos das subclasses.
- Acessar atributos herdados.
- Utilizar métodos herdados.
- Alterar o preço de um objeto filho.
- Aplicar desconto em um objeto filho.
- Verificar a relação de herança entre as classes.

## Conceito É UM

A herança foi utilizada porque:

- TenisCorrida É UM Tenis.
- TenisBasquete É UM Tenis.

Esse relacionamento representa uma especialização da classe `Tenis`.
