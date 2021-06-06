/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        final double tax = 0.055;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        Integer price_one = scan.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        Integer quant_one = scan.nextInt();
        System.out.print("Enter the price of item 2: ");
        Integer price_two = scan.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        Integer quant_two = scan.nextInt();
        System.out.print("Enter the price of item 3: ");
        Integer price_three = scan.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        Integer quant_three = scan.nextInt();

        double subtotal = (price_one*quant_one) + (price_two*quant_two) + (price_three*quant_three);
        double total_tax = subtotal * tax;
        double total_cost = total_tax + subtotal;


        System.out.println(String.format("Subtotal: $%.02f", subtotal));
        System.out.println("Tax: $"+total_tax);
        System.out.println("Total: $"+total_cost);
    }
}
