package org.example;
import java.util.*;
import java.util.stream.Collectors;


interface Calculadora {
    int Calcular(int a, int b);
}
public class Main {

    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_BLACK = "\u001B[30m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_BLUE = "\u001B[34m";
    static final String ANSI_PURPLE = "\u001B[35m";
    static final String ANSI_CYAN = "\u001B[36m";
    static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main( String[] args ) {

        //sort string using lambda expression
        System.out.print("\n" +  ANSI_RED + "Sort string using lambda expression: " + ANSI_RESET);
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        Arrays.sort(names, (first, second) -> first.compareToIgnoreCase(second));
        for (String name : names) {
            System.out.print(name + ","); //Alexis, KRISTY, Kyleen, Tim
        }

        //find number using lambda expression
        System.out.print("\n" + ANSI_GREEN + "Find number using lambda expression: " + ANSI_RESET);
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(numbers).sum();
        System.out.print(sum); //21

        //hashmap using lambda expression
        System.out.print("\n" + ANSI_BLUE +"Hashmap using lambda expression: " + ANSI_RESET);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.forEach((k, v) -> System.out.print((k + ":" + v) + ","));//a:1 b:2

        //arraylist using lambda expression
        System.out.print("\n" + ANSI_CYAN + "Arraylist using lambda expression: " + ANSI_RESET);
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Alexis");
        names2.add("Tim");
        names2.add("Kyleen");
        names2.add("KRISTY");
        names2.forEach(name -> System.out.print(name + ","));//Alexis, Tim, Kyleen, KRISTY

        //collection example to remove a number from a list using lambda expression
        System.out.print("\n" + ANSI_PURPLE + "Collection example to remove a number from a list using lambda expression: " + ANSI_RESET);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.removeIf(n -> (n % 2 == 0));
        numbers2.forEach(n -> System.out.print(n + ",")); //1,3,5

        //queue example using lambda expression
        System.out.print("\n" + ANSI_YELLOW + "Queue example using lambda expression: " + ANSI_RESET);
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.forEach(element -> System.out.print(element + ","));
        System.out.print("\n" + ANSI_YELLOW + "Removed element: "  + ANSI_RESET + queue.remove());
        System.out.print("\n" + ANSI_YELLOW + "Queue example after removed the first: " + ANSI_RESET);
        queue.forEach(element -> System.out.print(element + ",")); //b,c,d

        //hashset example using lambda expression
        System.out.print("\n" + ANSI_RED + "Hashset example using lambda expression: " + ANSI_RESET);
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.forEach(element -> System.out.print(element + ","));
        System.out.print("\n" + ANSI_RED + "Removed element: "  + ANSI_RESET+ set.remove("a"));
        System.out.print("\n" + ANSI_RED + "Hashset example after removed letter a: " + ANSI_RESET);
        set.forEach(element -> System.out.print(element + ",")); //b,c,d

        //map example using lambda expression
        System.out.print("\n" + ANSI_BLUE + "Map example using lambda expression: " + ANSI_RESET);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> numerosPares = numeros
                                    .stream()
                                    .filter(n -> n % 2 == 0)
                                    .collect(Collectors.toList());
        numerosPares.forEach(n -> System.out.print(n + ",")); //2,4,6


        //example of functional interface using lambda expression
        System.out.print("\n" + ANSI_GREEN + "Example of functional interface using lambda expression: " + ANSI_RESET);
        System.out.print("\n" + ANSI_GREEN + "Example of sum: " + ANSI_RESET);
        Calculadora soma = (int a, int b) -> a + b;
        System.out.print(soma.Calcular(2, 3)); //5

        System.out.print("\n" + ANSI_GREEN + "Example of subtraction: " + ANSI_RESET);
        Calculadora subtracao = (int a, int b) -> a - b;
        System.out.print(subtracao.Calcular(2, 3)); //-1

        System.out.print("\n" + ANSI_GREEN + "Example of multiplication: " + ANSI_RESET);
        Calculadora multiplicacao = (int a, int b) -> a * b;
        System.out.print(multiplicacao.Calcular(2, 3)); //6

        System.out.print("\n" + ANSI_GREEN + "Example of division: " + ANSI_RESET);
        Calculadora divisao = (int a, int b) -> a / b;
        System.out.print(divisao.Calcular(2, 3)); //0

        System.out.print("\n" + ANSI_GREEN + "Example of module: " + ANSI_RESET);
        Calculadora modulo = (int a, int b) -> a % b;
        System.out.print(modulo.Calcular(2, 3)); //2

        //example of collection with arraylist using lambda expression
        System.out.print("\n" + ANSI_PURPLE + "Example of collection with arraylist using lambda expression: " + ANSI_RESET);
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        numbers3.forEach(element -> System.out.print(element + ","));
        Collections.sort(numbers3, (a, b) -> b - a);
        System.out.print("\n" + ANSI_PURPLE + "Example of collection with arraylist using lambda expression after sort: " + ANSI_RESET);
        numbers3.forEach(element -> System.out.print(element + ",")); //5,4,3,2,1

        // search from a word in the list and use lambda expressions
        System.out.print("\n" + ANSI_CYAN + "Search from a word in the list and use lambda expressions: " + ANSI_RESET);
        List<String> locations = new ArrayList<>();
        locations.add("New York");
        locations.add("Los Angeles");
        locations.add("Chicago");
        locations.add("Denver");
        locations.add("Las Vegas");
        locations.stream()
                    .filter((phrase) -> phrase.contains("New"))
                    .map((local) -> local.toUpperCase())
                    .sorted()
                    .forEach(System.out::print);//NEW YORK
        System.out.println("\n");
    }
}
