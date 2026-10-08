## Aula 07 - Polimorfismo de Sobrescrita

Na Aula 07 foi implementado o conceito de polimorfismo de sobrescrita.

Foi criado o método `calcularDesempenho()` na superclasse `Tenis`.

As subclasses `TenisCorrida` e `TenisBasquete` sobrescrevem esse método utilizando a anotação `@Override`.

## Método da superclasse

A classe `Tenis` possui o método:

`calcularDesempenho()`

O método possui um comportamento genérico para um tênis.

## Sobrescrita

A classe `TenisCorrida` sobrescreve o método para apresentar um comportamento específico para tênis de corrida.

A classe `TenisBasquete` também sobrescreve o método para apresentar um comportamento específico para tênis de basquete.

## @Override

Foi utilizada a anotação `@Override` para indicar que os métodos das subclasses estão sobrescrevendo o método existente na classe `Tenis`.

As três classes possuem a mesma assinatura:

`public String calcularDesempenho()`

## Lista polimórfica

Foi criada uma lista do tipo `List<Tenis>`.

Essa lista recebeu objetos das subclasses:

- `TenisCorrida`
- `TenisBasquete`

Como as duas classes são tipos de `Tenis`, elas podem ser armazenadas na mesma lista.

## Teste de polimorfismo

Foi utilizado um laço `for` para percorrer a lista.

O mesmo comando:

`tenisAtual.calcularDesempenho()`

produziu resultados diferentes dependendo do objeto que estava sendo percorrido.

## Conceito aprendido

O polimorfismo permite utilizar uma referência da superclasse para trabalhar com diferentes subclasses.

Cada objeto pode executar o mesmo método de acordo com seu próprio comportamento.
