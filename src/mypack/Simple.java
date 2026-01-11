package mypack;

import mathutils.Calculator;
import mathutils.Square;


public class Simple {
    public static void main(String[] args) {
        System.out.println("Welcome to mypack class");

        Calculator calc = new Calculator();
        System.out.println(calc.add(1,2));

        Square calcSquare = new Square();
        System.out.println(calcSquare.square(3));
    }
}