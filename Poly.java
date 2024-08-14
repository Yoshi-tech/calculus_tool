/*
This program is an oject that is meant to simulate an algebraic polynomial, the object has three main properties the input array of coeeficiants in type String, the middle man array of coefficiants in type int, and the final array fo term objects
flowchart: https://pdsb1-my.sharepoint.com/:u:/g/personal/885628_pdsb_net/EWCJtQjAZZFDl3oTWhldjn0BldRjTFIYedrg3Q5ewIlT_Q?e=sJS5A5
Author: Yash Joshi 
variable dictionary

protected String[] coeffString = array to take input values for coeff
protected int[] coeffInt = array to convert coeffs to int
protected Term[] t = final array of term objects 
int i, j = counters for for loops
*/
class Poly {
// Array to store coefficient values as strings
protected String[] coeffString;

// Array to store coefficient values as integers
protected int[] coeffInt;

// Array to store Term objects
protected Term[] t;



// Constructor that takes a string of coefficients as input
Poly(String coeffs) {
  /* Split the input string by space and store the 
  resulting substrings in coeffString array*/
  coeffString = coeffs.split(" ");
  // Initialize coeffInt array with the same length as coeffString
  coeffInt = new int[coeffString.length];


  // Initialize t array with the same length as coeffString
  t = new Term[coeffString.length];

  // Iterate through the coeffString array
  for (int i = 0; i < coeffString.length; i++) {
    // Convert each substring to an integer and store it in coeffInt array
    coeffInt[i] = Integer.parseInt(coeffString[i]);

    /* Create a new Term object with the coefficient
    and exponent, and store it in the t array*/
    t[i] = new Term(coeffInt[i], coeffInt.length - i - 1);
  }
}

// Method to get the leading coefficient of the polynomial
public double getLead() {
  // Return the coefficient of the first term (leading term) in the t array
  return t[0].coeffGetter();
}

// Method to get the constant term of the polynomial
public double getConst() {
  // Return the coefficient of the last term (constant term) in the t array
  return t[t.length - 1].coeffGetter();
}

// Method to get the order of the polynomial
public int getOrder() {
  /* Return the length of the t array minus 1 
  (since the exponents start from the highest power) */
  return t.length - 1;
}


// Method to evaluate the polynomial for a given value of x
public double f(double x) {
  // Initialize a variable to store the result
  double result = 0;

  // Iterate through the t array
  for (int j = 0; j < t.length; j++) {
    // Add the evaluated value of each term to the result
    result = result + t[j].eval(x);
  }

  // Return the final result of evaluating the polynomial
  return result;
 }
public double integratePoly(double l, double r){

  double temp = r - l;
  double dx = temp/1000000.00;

  double sum = 0;
  double j = 0;

  for (double i = 1; i <= 1000000; i++){
      sum = sum + (dx*(f(l+ j*dx)));
      j++;
  }
System.out.printf("Integral for this function from x = %.2f to x = %.2f is %.2f", l, r, sum);
return sum;
}
}
