package ch.avara.random;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FunctionalInterfaces {
  public static void main(String[] args) {
    // Function<T, R>
    Function<Integer,Integer> multiplyBy2  = (num) -> num*2;
    System.out.println("Function Result: " + multiplyBy2.apply(5));

    // BiFunction<T, U, R>
    BiFunction<Integer, Integer, Integer> multiply = (num1, num2) -> num1 * num2;
    System.out.println("BiFunction Result: " + multiply.apply(5, 3));

    // Consumer<T>
    Consumer<String> logText = (text) -> System.out.println(text);
    logText.accept("Consumer: I am logging this text...");

    // BiConsumer<T, U>
    BiConsumer<String, String> concatenateText = (firstWord, secondWord) -> System.out.println(firstWord + " " + secondWord);
    concatenateText.accept("BiConsumer: Hello", "World");

    // Suplier<T>
    Supplier<Double> randomIntegerSupplier = () ->  Math.ceil(Math.random() * 100);
    System.out.println("Supplier Result: " + randomIntegerSupplier.get());

    // Predicate<T>
    Predicate<Integer> isAdult = (age) -> age >= 18;
    List<Integer> ages = List.of(19,12,33,14,51);
    List<Integer>  filteredAges = ages.stream()
        .filter(isAdult)
        .collect(Collectors.toList());
    System.out.println("Predicate Result: " + filteredAges);

    // UnaryOperator<T>
    UnaryOperator<Integer> square = num -> num*num;
    System.out.println("UnaryOperator Result: " + square.apply(5) );


    // BinaryOperator<T>
    BinaryOperator<Integer> multiplyBinaryOperator = (num1, num2) -> num1 * num2;
    System.out.println("BinaryOperator Result: " + multiplyBinaryOperator.apply(6, 5));

  }
}
