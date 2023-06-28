package TipAndTotal;
import java.util.Scanner;

/*
 * Harry Challis - 111585522
 * CIS 331 Section 2
 * Assignment 1 - calculate tips
 * I have followed the JMU Honor Code
 */
public class TipAndTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subtotal: $");

        double subtotal = sc.nextDouble(); //input from user for subtotal
        System.out.print("Please enter desired gratuity (%): ");
        double rate = sc.nextDouble(); //input from user for gratuity rate

        double tip = subtotal * rate / 100; //calculation of tip amount
        double total = tip + subtotal; //calculation of total amount

        
        System.out.println("With a " + rate + "% tip on a $" + subtotal 
                + " bill, the total will be: $" + total);
    }
}