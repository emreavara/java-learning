package ch.avara.random;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterfaces {
  public static void main(String[] args) {
    // Function
    Function<Integer,Integer> multiplyBy2  = (num) -> num*2;
    System.out.println("Function Result: " + multiplyBy2.apply(5));

    // BiFunction
    BiFunction<Integer, Integer, Integer> multiply = (num1, num2) -> num1 * num2;
    System.out.println("BiFunction Result: " + multiply.apply(5, 3));

  }
}
