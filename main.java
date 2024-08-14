/*
This program is meant to be a driver for the polynomial object, it prompts the user to enter a string of numbers with which the program invokes the polynomial object, it then prints out the lead term, order, constant term, y int, and a little table of values 
flowchart: https://pdsb1-my.sharepoint.com/:u:/g/personal/885628_pdsb_net/EWCJtQjAZZFDl3oTWhldjn0BldRjTFIYedrg3Q5ewIlT_Q?e=sJS5A5
Author: Yash Joshi 885628@pdsb.net
variable dictionary

protected String[] coeffString = array to take input values for coeff
protected int[] coeffInt = array to convert coeffs t
o int
protected Term[] t = final array of term objects 
int i, j = counters for for loops
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner sc = new Scanner(System.in); 
    // Prompt the user to enter a set of numbers
    System.out.print("Please enter a set of numbers separated by spaces: "); 
    // Read the input from the user and store it in the coeff variable
    String coeff = sc.nextLine(); 
    // Create a new Poly object using the input coefficients
    Poly p = new Poly(coeff); 

    // Print the leading coefficient of the polynomial
    System.out.printf("Lead term: %.2f\n", p.getLead());

    // Print the constant term of the polynomial
    System.out.printf("Constant term: %.2f\n", p.getConst());

    // Print the order of the polynomial
    System.out.printf("Order: %d\n", p.getOrder());

    // Print the y-intercept of the polynomial at x = 0
    System.out.printf("Y-intercept: (0, %d)\n", (int) p.f(0));

    for (int x = 1; x <= 5; x++) { // Iterate from x = 1 to x = 5
      /* Compute the value of the polynomial for
      the current x value and print it as an ordered pair (x, f(x))*/
      System.out.printf("f(%d): (%d, %d)\n", x, x, (int) p.f(x));

    }  
    double low = 0;
    double high = 0;
    System.out.print("Pick an interval to integrate the function for, enter the lower bound: ");

    low = sc.nextInt();


    high = sc.nextInt();

    System.out.println();

    p.integratePoly(low, high);




  }
}
