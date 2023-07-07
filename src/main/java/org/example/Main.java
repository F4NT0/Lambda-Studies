package org.example;
import java.util.*;


interface Calculadora {
    int calcular(int a, int b);
}
public class Main {
    public static void main( String[] args ) {

        //sort string using lambda expression
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        Arrays.sort(names, (first, second) -> first.compareToIgnoreCase(second));
        for (String name : names) {
            System.out.println(name);
        }

        //find number using lambda expression
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

        //hashmap using lambda expression
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.forEach((k, v) -> System.out.println((k + ":" + v)));

        //arraylist using lambda expression
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Alexis");
        names2.add("Tim");
        names2.add("Kyleen");
        names2.add("KRISTY");
        names2.forEach(name -> System.out.println(name));

        //collection example to remove a number from a list using lambda expression
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.removeIf(n -> (n % 2 == 0));
        numbers2.forEach(System.out::println);

        //queue example using lambda expression
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.forEach(element -> System.out.println(element));
        System.out.println("Removed element: " + queue.remove());
        queue.forEach(element -> System.out.println(element));

        //hashset example using lambda expression
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.forEach(element -> System.out.println(element));
        System.out.println("Removed element: " + set.remove("a"));
        set.forEach(element -> System.out.println(element));

        /**
         * functional interface is an interface that contains only one abstract method.
         * They can have only one functionality to exhibit.
         * From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
         * A functional interface can have any number of default methods.
         * Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
         */

        Calculadora soma = (int a, int b) -> a + b;
        System.out.println(soma.calcular(2, 3)); //5
        Calculadora subtracao = (int a, int b) -> a - b;
        System.out.println(subtracao.calcular(2, 3)); //-1
        Calculadora multiplicacao = (int a, int b) -> a * b;
        System.out.println(multiplicacao.calcular(2, 3)); //6
        Calculadora divisao = (int a, int b) -> a / b;
        System.out.println(divisao.calcular(2, 3)); //0
        Calculadora modulo = (int a, int b) -> a % b;
        System.out.println(modulo.calcular(2, 3)); //2

        //example of collection with arraylist using lambda expression

    }
}
