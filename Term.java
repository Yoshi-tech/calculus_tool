/*
This program is an oject that is meant to simulate an algebraic term. The object has three main properties, the value of the coefficiant, the value of the exponent, and the value of the x variable.\
flowchart: https://pdsb1-my.sharepoint.com/:u:/g/personal/885628_pdsb_net/EWCJtQjAZZFDl3oTWhldjn0BldRjTFIYedrg3Q5ewIlT_Q?e=sJS5A5
Author: Yash Joshi
variable dictionary
double coeff = value of the coefficient
double x = value of the variable x
double exp = value of the exponent of the variable
double c = parameter of the object corresponding to the coefficient
double e = paramter for the object corresponding to the exponent
double valueFin = the final value of the term given a certain x value
*/
class Term{ // term object opens 

  // Define the properties of a term
  protected double coeff; // coefficient of the term
  protected double x; // value of the variable x
  protected double exp; // exponent of the variable x

  // Constructor method that takes in the coefficient and exponent of a term
  public Term(double c, double e){
    coeff = c;// set the coefficient of the term to the input coefficient
    exp = Math.abs(Math.floor(e)); // set the exponent of the term to the absolute value and get rid of decimals of the input  
    //exponent
  }

  // Getter method for the coefficient of the term
  public double coeffGetter(){
    return coeff;
  }

  // Getter method for the value of the variable x
  public double xGetter(){
    return x;
  }

  // Getter method for the exponent of the variable x
  public double expGetter(){
    return exp;
  }

  // Method that evaluates the value of the term for a given value of x
  public double eval(double var){
    x = var; // set the value of x to the input value
    double valueFin = coeff*(Math.pow(var, exp)); // calculate the value of the term using the input value of x
    return valueFin; // return the calculated value of the term
  }

}
