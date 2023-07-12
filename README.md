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

<table align="center">
    <tr>
        <td><img src="images/collections/1-ordernar-vetor.png" width="600"></td>
    </tr>
</table>

<table align="center">
    <tr>
        <td><img src="images/collections/2-hashmap-valores.png" width="600"></td>
    </tr>
</table>

<table align="center">
    <tr>
        <td><img src="images/collections/3-Somando-valores-arrays.png" width="600"></td>
    </tr>
</table>

<table align="center">
    <tr>
        <td><img src="images/collections/4-ArrayList-print.png" width="600"></td>
    </tr>
</table>

<table align="center">
    <tr>
        <td><img src="images/collections/5-ArrayList-RemoveIf.png" width="600"></td>
    </tr>
</table>

<table align="center">
    <tr>
        <td><img src="images/collections/6-Queue.png" width="600"></td>
    </tr>
</table>

<table align="center">
    <tr>
        <td><img src="images/collections/7-HashSet.png" width="600"></td>
    </tr>
</table>

<table align="center">
    <tr>
        <td><img src="images/collections/8-list-stream.png" width="600"></td>
    </tr>
</table>

<table align="center">
    <tr>
        <td><img src="images/collections/10-ArrayList-Lambda.png" width="600"></td>
    </tr>
</table>

<table align="center">
    <tr>
        <td><img src="images/collections/11-ArrayList-find.png" width="600"></td>
    </tr>
</table>

---

## $$\color{orange} \sf interface$$

Uma interface com lambda em Java refere-se ao uso de uma expressão lambda para implementar uma interface funcional. Uma interface funcional é uma interface que possui apenas um único método abstrato. A introdução das expressões lambda em Java 8 permite que você forneça uma implementação concisa e direta para esse método por meio de uma expressão lambda.

<table align="center">
    <tr>
        <td><img src="images/collections/9-calculator-interface.png" width="600"></td>
    </tr>
</table>

---

## $$\color{magenta} \sf Classes \space e \space Métodos \space utilizados$$

|Classe|Método|Uso|
|---|---|---|
|Arrays|sort()|`Arrays.sort(names,(first, second) -> first.compareToIgnoreCase(second))`
