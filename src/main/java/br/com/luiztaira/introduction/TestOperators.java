package br.com.luiztaira.introduction;

import java.util.Random;

public class TestOperators {

    public static void main(String[] args) {
        int n = new Random().nextInt();
        System.out.println("Random number: " + n + "\n");

        /**
         * Arithmetic Operators
         */
        // Remainder operator: %
        System.out.println("Remainder operator: ");
        int i = n % 2;
        if (i == 1 || i == -1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }

        // + Additive operator (also used for String concatenation)
        // - Subtraction operator
        // * Multiplication operator
        // / Division operator


        /**
         * Unary Operators
         */
        // +  Unary plus operator; indicates positive value (numbers are positive without this, however)
        // -  Unary minus operator; negates an expression
        // ++ Increment operator; increments a value by 1
        // -- Decrement operator; decrements a value by 1
        // !  Logical complement operator; inverts the value of a boolean


        /**
         * Equality and Relational Operators
         */
        // ==  Equal to
        // !=  Not equal to
        // >   Greater than
        // >=  Greater than or equal to
        // <   Less than
        // <=  Less than or equal to


        /**
         * Conditional Operators
         */
        // &&  Conditional-AND
        // ||  Conditional-OR
        // ?:  Ternary (shorthand for if-than-else statement)


        /**
         * Type Comparison Operator
         */
        // instanceof  Compares an object to a specified type


    }

}
