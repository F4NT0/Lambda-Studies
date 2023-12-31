# $$\boxed{\color{orange}\Lambda \frak{ \space \color{magenta}Lambda \space \color{lightgreen}Expressions}}$$

![Static Badge](https://img.shields.io/badge/11-orange?logo=openjdk&logoColor=orange&label=Java&labelColor=black)
[![GitHub](https://img.shields.io/badge/github_actions-%23121011.svg?logo=github&logoColor=white)](https://github.com/F4NT0/Lambda-Studies/actions/workflows/main.yml)
![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/F4NT0/Lambda-Studies/main.yml)
![GitHub](https://img.shields.io/github/license/F4NT0/Lambda-Studies)
![GitHub commit activity (branch)](https://img.shields.io/github/commit-activity/t/F4NT0/Lambda-Studies?color=orange)
![GitHub last commit (branch)](https://img.shields.io/github/last-commit/F4NT0/Lambda-Studies/main)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/F4NT0/Lambda-Studies)

<summary>Como rodar o projeto</summary>
<details>
    Faça <a href="https://maven.apache.org/download.cgi?.">Download</a> e <a href="https://mkyong.com/maven/how-to-install-maven-in-windows/">Configure</a> o $\color{lightgreen}\sf maven$ em seu computador.
    <br>
    Faça <a href="https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html">Download</a> e <a href="https://windowsreport.com/install-java-windows-11/">Configure</a> o $\color{orange}\sf Java \space 11$ em seu computador.
    <br>
    O comando para instalar os pacotes do projeto é abrindo um console no diretório principal (Lambda-Studies) e rodando o seguinte:
    <br><br>
    $$\boxed{\color{lightblue}\sf mvn \space \color{yellow}clean \space \color{lightgreen}install}$$
    <br>
    Após finalizar a instalação das bibliotecas necessária, no mesmo console rode o comando:
    <br>
    $$\boxed{\color{lightblue}\sf mvn \space \color{yellow}exec: \color{lightgreen}java}$$
    <br>
    Deve apresentar no console a seguinte saída:
    <br>
    <table align="center">
        <tr>
            <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/exit.png" width="600"></td>
        </tr>
    </table>
    <br>
    Se o seu console possui saída de cores, a saída vai estar da seguinte forma:
    <br>
    <table align="center">
        <tr>
            <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/exit-colored.png" width="600"></td>
        </tr>
    </table>
    <br>
    Este projeto possui um Github Actions para compilar o projeto se não puder compilar localmente, uma saída de exemplo pode ser visto no workflow.
    <br>
    Só precisa enviar um commit para a branch `main` e acessar a etapa de compilação chamada $\color{orange}\sf Rodar \space o \space Projeto \space entregando \space resultado$ na linha 229 se encontra a saída do programa compilado.
    <br>
    <table align="center">
        <tr>
            <td><img src="https://github.com/F4NT0/Lambda-Studies/blob/main/images/github-actions.png" width="600"></td>
        </tr>
    </table>
</details>

---

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
        <td><img src="images/collections/11-ArrayList-find.png" width="800"></td>
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

|Classe|Método|Descrição
|---|---|---|
|Arrays|sort()|permite ordenar os elementos de um array em ordem crescente.
|String|compareToIgnoreCase()|permite comparar duas strings para determinar sua ordem lexicográfica, ignorando diferenças de maiúsculas e minúsculas.
|Hashmap|put(key, value)|adiciona o valor e a chave dentro de um Hashmap.
|Hashmap|foreach()|percorre e imprimir os elementos do HashMap.
|ArrayList|foreach()|percorre e imprimir os elementos do ArrayList.
|Queue|foreach()|percorre e imprimir os elementos da Fila.
|ArrayList|removeIf()|permite remover elementos de uma coleção com base em uma condição especificada. Nesse caso, a condição é definida por meio de uma expressão lambda.
|Arrays|stream()|usado para criar um fluxo (stream) a partir do array numbers. Um fluxo é uma sequência de elementos que permite realizar operações em coleções de dados de forma mais concisa e funcional.
|Arrays|sum()|chamado para realizar a operação de soma de todos os elementos do fluxo
|List|stream()|usado para criar um fluxo (stream) a partir do array numbers. Um fluxo é uma sequência de elementos que permite realizar operações em coleções de dados de forma mais concisa e funcional.
|List|filter()|o método filter() é aplicado ao fluxo para filtrar apenas os elementos que atendem a uma determinada condição. Nesse caso, a condição é definida por meio da expressão lambda (n -> n % 2 == 0), que verifica se o número n é divisível por 2, ou seja, se é um número par.
|List|collect(Collectors.toList())|é utilizado para coletar os elementos filtrados e retornar uma nova lista contendo esses elementos.
|List|map()|usado para transformar cada string restante em letras maiúsculas, aplicando a função toUpperCase() a cada elemento do fluxo.
|List|sorted()|utilizado para ordenar as strings em ordem alfabética ou lexicográfica.

---


