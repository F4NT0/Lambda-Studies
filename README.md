# $$\boxed{\Lambda \frak{ \space Lambda \space Expressions}}$$

As expressões lambda são uma forma concisa de escrever funções anônimas. 
Elas são usadas principalmente em contextos onde você precisa passar uma função como argumento para um método ou definir um comportamento personalizado para uma interface funcional.
<br><br>
A sintaxe básica de uma expressão lambda é `(argumentos) -> {corpo}`. 
Os argumentos são opcionais se a função não recebe nenhum parâmetro e o corpo pode ser uma única expressão ou um bloco de código.
<br><br>
As expressões lambda são usadas em conjunto com **interfaces funcionais**, que são interfaces com um único método abstrato. Essas interfaces funcionais servem como tipos para as expressões lambda. Exemplos de interfaces funcionais incluem Predicate, Consumer, Supplier, etc.
<br><br>
Expressões lambda são frequentemente usadas para substituir objetos de classe que implementam uma interface funcional. Em vez de criar uma nova classe para implementar a interface, você pode passar uma expressão lambda diretamente para o método que espera a interface funcional.
<br><br>
O uso de expressões lambda pode tornar o código mais legível e conciso, eliminando a necessidade de escrever classes completas para implementar interfaces funcionais simples. Isso melhora a produtividade do desenvolvedor e facilita a manutenção do código.

---

## $$\color{orange} \sf Collections$$

<summary>Explicação de Collections</summary>
<details>
Em Java, a classe `Collections` é uma classe utilitária que fornece métodos estáticos para trabalhar com coleções, como listas, conjuntos e mapas. Ela oferece funcionalidades adicionais para manipular, ordenar, pesquisar e realizar outras operações em coleções de forma conveniente. 

Aqui estão alguns métodos importantes da classe `Collections`:

1. `sort(List<T> list)`: Ordena os elementos em uma lista em ordem crescente, com base na ordem natural dos elementos ou usando um comparador personalizado.

2. `binarySearch(List<? extends Comparable<? super T>> list, T key)`: Realiza uma pesquisa binária na lista ordenada e retorna o índice do elemento encontrado, ou um valor negativo se o elemento não estiver presente.

3. `reverse(List<?> list)`: Inverte a ordem dos elementos em uma lista.

4. `shuffle(List<?> list)`: Embaralha aleatoriamente a ordem dos elementos em uma lista.

5. `addAll(Collection<? super T> c, T... elements)`: Adiciona elementos especificados a uma coleção.

6. `frequency(Collection<?> c, Object o)`: Retorna o número de ocorrências de um determinado objeto em uma coleção.

7. `max(Collection<? extends T> coll)`: Retorna o maior elemento em uma coleção, com base na ordem natural dos elementos ou usando um comparador personalizado.

8. `min(Collection<? extends T> coll)`: Retorna o menor elemento em uma coleção, com base na ordem natural dos elementos ou usando um comparador personalizado.

9. `unmodifiableCollection(Collection<? extends T> c)`: Retorna uma versão imutável (não modificável) de uma coleção.

10. `synchronizedCollection(Collection<T> c)`: Retorna uma versão sincronizada (thread-safe) de uma coleção.

Esses são apenas alguns exemplos dos métodos fornecidos pela classe `Collections`. Ela oferece uma variedade de outras funcionalidades úteis para manipulação e operações em coleções.
</details>

<table align="center">
    <tr>
        <td><img src="images/collections-pares.png"></td>
    </tr>
</table>

---

## $$\color{orange} \sf interface$$

Uma interface com lambda em Java refere-se ao uso de uma expressão lambda para implementar uma interface funcional. Uma interface funcional é uma interface que possui apenas um único método abstrato. A introdução das expressões lambda em Java 8 permite que você forneça uma implementação concisa e direta para esse método por meio de uma expressão lambda.

<table align="center">
    <tr>
        <td><img src="images/calculator-lambda.png"></td>
    </tr>
</table>
