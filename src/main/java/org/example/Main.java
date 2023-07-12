package org.example;
import java.util.*;
import java.util.stream.Collectors;


interface Calculadora {
    int Calcular(int a, int b);
}
public class Main {
    public static void main( String[] args ) {

        //sort string using lambda expression
        System.out.print("\nSort string using lambda expression: ");
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        Arrays.sort(names, (first, second) -> first.compareToIgnoreCase(second));
        for (String name : names) {
            System.out.print(name + ","); //Alexis, KRISTY, Kyleen, Tim
        }

        //find number using lambda expression
        System.out.print("\nFind number using lambda expression: ");
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(numbers).sum();
        System.out.print(sum); //21

        //hashmap using lambda expression
        System.out.print("\nHashmap using lambda expression: ");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.forEach((k, v) -> System.out.print((k + ":" + v) + ","));//a:1 b:2

        //arraylist using lambda expression
        System.out.print("\nArraylist using lambda expression: ");
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Alexis");
        names2.add("Tim");
        names2.add("Kyleen");
        names2.add("KRISTY");
        names2.forEach(name -> System.out.print(name + ","));//Alexis, Tim, Kyleen, KRISTY

        //collection example to remove a number from a list using lambda expression
        System.out.print("\nCollection example to remove a number from a list using lambda expression: ");
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.removeIf(n -> (n % 2 == 0));
        numbers2.forEach(n -> System.out.print(n + ",")); //1,3,5

        //queue example using lambda expression
        System.out.print("\nQueue example using lambda expression: ");
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.forEach(element -> System.out.print(element + ","));
        System.out.print("\nRemoved element: " + queue.remove());
        System.out.print("\nQueue example after removed the first: ");
        queue.forEach(element -> System.out.print(element + ",")); //b,c,d

        //hashset example using lambda expression
        System.out.print("\nHashset example using lambda expression: ");
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.forEach(element -> System.out.print(element + ","));
        System.out.print("\nRemoved element: " + set.remove("a"));
        System.out.print("\nHashset example after removed letter a: ");
        set.forEach(element -> System.out.print(element + ",")); //b,c,d

        //map example using lambda expression
        System.out.print("\nMap example using lambda expression: ");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> numerosPares = numeros
                                    .stream()
                                    .filter(n -> n % 2 == 0)
                                    .collect(Collectors.toList());
        numerosPares.forEach(n -> System.out.print(n + ",")); //2,4,6


        //example of functional interface using lambda expression
        System.out.print("\nExample of functional interface using lambda expression: ");
        System.out.print("\nExample of sum: ");
        Calculadora soma = (int a, int b) -> a + b;
        System.out.print(soma.Calcular(2, 3)); //5

        System.out.print("\nExample of subtraction: ");
        Calculadora subtracao = (int a, int b) -> a - b;
        System.out.print(subtracao.Calcular(2, 3)); //-1

        System.out.print("\nExample of multiplication: ");
        Calculadora multiplicacao = (int a, int b) -> a * b;
        System.out.print(multiplicacao.Calcular(2, 3)); //6

        System.out.print("\nExample of division: ");
        Calculadora divisao = (int a, int b) -> a / b;
        System.out.print(divisao.Calcular(2, 3)); //0

        System.out.print("\nExample of module: ");
        Calculadora modulo = (int a, int b) -> a % b;
        System.out.print(modulo.Calcular(2, 3)); //2

        //example of collection with arraylist using lambda expression
        System.out.print("\nExample of collection with arraylist using lambda expression: ");
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        numbers3.forEach(element -> System.out.print(element + ","));
        Collections.sort(numbers3, (a, b) -> b - a);
        System.out.print("\nExample of collection with arraylist using lambda expression after sort: ");
        numbers3.forEach(element -> System.out.print(element + ",")); //5,4,3,2,1

        // search from a word in the list and use lambda expressions
        System.out.print("\nSearch from a word in the list and use lambda expressions: ");
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
    }
}
