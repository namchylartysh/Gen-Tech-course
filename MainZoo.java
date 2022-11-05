package Lesson2;

/**
 * Java Professional Homework #2
 *
 * @author Artysh
 * @version 03.11 - 07.11
 */

public class MainZoo {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 3);
        Dog dog = new Dog("Sharik", "black", 5);

        //Cat emptyCat = new Cat();

        cat.voice();
        dog.voice();
        System.out.println(cat);
        System.out.println(dog);

        // иллюстрация перегрузки метода
        System.out.println(add(5, 3));
        System.out.println(add(5.1, 3.0));
        System.out.println(add("123", "456"));
    }

    // перегрузка методов
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String add(String a, String b) {
        return a + b;
    }
}
