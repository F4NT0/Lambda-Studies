# $$\boxed{\color{orange}\Lambda \frak{ \space \color{magenta}Lambda \space \color{lightgreen}Expressions}}$$

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

#### $$\sf Exemplos \space de \space uso \space de \space Collections$$

<summary>O que é Collections e seus métodos</summary>
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
        <td><img src="images/collections/stream().png" width="600"></td>
    </tr>
</table>

<summary>Explicação do código do List com Streams</summary>
<details>
    $\color{yellow}\sf Arrays$ é uma classe utilitária do Java com métodos prontos para lidar com vetores de diferentes tipos.
    No exemplo passado, o método $\color{orange}\sf asList()$ transforma qualquer valor passado em uma lista de valores.
    <br>
    <table align="center">
    <tr>
        <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/collections/Arrays.png" width="600"></td>
    </tr>
    </table>
    <br>
    Utilizamos o método $\sf \color{orange}stream()$ da classe <code>java.util.Collection</code> em Java, que retorna um fluxo (stream) de elementos presentes na coleção. O stream é uma sequência de elementos que pode ser manipulada e processada de forma funcional e declarativa.
    <br>
    O método $\sf \color{orange}filter()$ é um método da interface <code>Stream<T></code> no Java Streams API. Ele é usado para filtrar os elementos de um stream com base em um critério especificado por uma expressão lambda.
    <br>
    No nosso caso, a expressão Lambda definida verifica se os valores da lista tem o resto da divisão por 2 igual a zero, significando que esse valor é par (valores divididos por 2).
    <br>
    No final O método $\sf\color{orange}collect()$ é um método da interface <code>Stream<T></code> no Java Streams API. Ele é usado para coletar os elementos de um stream e armazená-los em uma coleção ou realizar outras operações de agregação.
    <br>
    Nessa operação de agragação usamos O $\sf\color{orange}Collectors$ é uma classe utilitária do Java <code>Streams API</code> que fornece diversos coletores pré-definidos para realizar operações de agregação em streams. Esses coletores são usados em conjunto com o método collect() para coletar os elementos de um stream em uma forma desejada, como uma lista, um conjunto, um mapa, entre outros.
    Transformamos todos os dados em uma lista usando o método $\sf\color{orange}toList()$
    <br>
    <table align="center">
    <tr>
        <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/collections/filters().png" width="600"></td>
    </tr>
    </table>
    Para imprimir todos os valores, não precisa criar todo um for complexo sem necessidade, para isso podemos usar um for simplificado chamado $\color{yellow}foreach$ imprimindo cada elemento da coleção utilizando **sintaxe de referência de método**.
    <br>
    $\color{yellow}System.out::println$: É uma sintaxe de referência de método que representa o método `println` da classe `System.out`. Neste caso, estamos usando a referência de método para a função println sem passar explicitamente um argumento. Isso significa que cada elemento da coleção será passado automaticamente como argumento para o método `println, que é responsável por imprimir o valor no console.
    <table align="center">
    <tr>
        <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/collections/foreach-sintax.png" width="600"></td>
    </tr>
    </table>
</details>

---

<table align="center">
    <tr>
        <td><img src="images/collections/arraylist().png" width="600"></td>
    </tr>
</table>

<summary>Explicação do código do ArrayList</summary>
<details>
    Primeiramente foi iniciado um ArrayList em nosso programa.
    $\sf \color{yellow}ArrayList$ é uma classe fornecida pela biblioteca padrão do Java (java.util.ArrayList) que implementa a estrutura de dados de uma lista dinâmica baseada em array. Ela é uma implementação da interface List.
    <table align="center">
    <tr>
        <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/collections/newArrayList().png" width="600"></td>
    </tr>
    </table>
    Com a inicialização do ArrayList, podemos adicionar valores na variável `number3` utilizando o método $\sf \color{lightblue}add(value)$.
    <table align="center">
    <tr>
        <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/collections/add().png" width="300"></td>
    </tr>
    </table>
    Agora podemos utilizar o $\sf \color{orange}foreach$ do java para imprimir todos os valores da lista `number3`
    <table align="center">
    <tr>
        <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/collections/foreachelement().png" width="600"></td>
    </tr>
    </table>
    Podemos então utilizar os métodos da classe $\sf \color{orange}Collection$.
    $\sf \color{lightblue}Collections.sort()$: É um método estático da classe Collections que ordena a lista fornecida como primeiro argumento. O segundo argumento é um objeto que implementa a interface Comparator, responsável por definir a lógica de comparação dos elementos.
    (a, b) -> b - a: É uma expressão lambda que representa uma função de comparação personalizada. Neste caso, a função compara dois elementos a e b, subtraindo b de a.
    <br>
    Se o resultado da subtração for negativo, significa que a é menor que b, então a deve ser colocado antes de b na ordem.
    <br>
    Se o resultado for zero, significa que a é igual a b.
    <br>
    Se o resultado for positivo, significa que a é maior que b, então a deve ser colocado depois de b na ordem.
    <br>
    Portanto, usando (a, b) -> b - a, os elementos serão comparados em ordem decrescente.
    <table align="center">
    <tr>
        <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/collections/sort().png" width="600"></td>
    </tr>
    </table>
    No fim imprimimos a lista novamente e ela estará colocado de forma decrescente após ter sido feito o `sort` nela seguindo a regra acima.
</details>

---

## $$\color{orange} \sf interface$$

Uma interface com lambda em Java refere-se ao uso de uma expressão lambda para implementar uma interface funcional. Uma interface funcional é uma interface que possui apenas um único método abstrato. A introdução das expressões lambda em Java 8 permite que você forneça uma implementação concisa e direta para esse método por meio de uma expressão lambda.

<table align="center">
    <tr>
        <td><img src="images/calculator-lambda.png" width="600"></td>
    </tr>
</table>

<summary>Detalhes sobre o código</summary>
<details>
    Uma $\sf \color{yellow}interface$ em Java é uma estrutura que define um conjunto de métodos e constantes que as classes podem implementar. Ela permite definir um contrato que as classes devem seguir ao implementar a interface.
    <br>   
    Foi criado dentro da interface um método somente declarado, chamado `Calcular()` que recebe dois inteiros como atributos.
    <br>
    <table align="center">
    <tr>
        <td><img src="images/calculator-interface.png" width="600"></td>
    </tr>
    </table>
    <br>
    Agora com essa estrutura, podemos criar definições para o que o método `Calcular` vai fazer em cada utilização da interface.
    <br>
    Podemos por exemplo criar uma utilização da interface que vai fazer uma soma com os valores dos tributos recebidos:
    <table align="center">
    <tr>
        <td><img src="images/calculator-sum.png" width="600"></td>
    </tr>
    </table>
    Com isso podemos criar o sistema de calcular possiveis de uma calculadora, só criar uma chamada da interface e trazer dois valores utilizando lambdas.
</details>
