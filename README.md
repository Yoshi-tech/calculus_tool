The java program allows the user to integrate a function and get some basic information about it, 
the only function types that are currently supported are polynomial functions, 
however with future releases, more complex functions such as trigonometric functions and logarithmic functions will be added

Variable dictionary:

Main.java:
protected String[] coeffString = array to take input values for coeff
protected int[] coeffInt = array to convert coeffs t
o int
protected Term[] t = final array of term objects 
int i, j = counters for for loop

Poly.java
protected String[] coeffString = array to take input values for coeff
protected int[] coeffInt = array to convert coeffs to int
protected Term[] t = final array of term objects 
int i, j = counters for for loops

Term.java
double coeff = value of the coefficient
double x = value of the variable x
double exp = value of the exponent of the variable
double c = parameter of the object corresponding to the coefficient
double e = paramter for the object corresponding to the exponent
double valueFin = the final value of the term given a certain x value

Author -Yash Joshi
