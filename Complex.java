//Babita Thapa
// CSC 360
// Assignment 4//

import java.util.Scanner;
public class Complex implements Cloneable {
    //* Declare data fields */
    private double realPart;
    private double imaginaryPart;

    //* Create a  parameterized constructor*/
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex(double realPart) {
        this.realPart = realPart;
        this.imaginaryPart = 0.0;
    }

    //* Default constructor*/
    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;

    }
    //* get method to get the real part of complex number*/
    public double getRealPart() {
        return this.realPart;
    }

    //* get method to get the imaginary part of complex number*/
    public double getImaginaryPart() {
        return this.imaginaryPart;
    }

    //*method to add*/
    public Complex add(Complex b) {
        Complex a = this;
        double realPart = a.realPart + b.getRealPart();
        double imaginaryPart = a.imaginaryPart + b.getImaginaryPart();
        return new Complex(realPart, imaginaryPart);
    }

    //*method to subtract*/
    public Complex subtract(Complex b) {
        Complex a = this;
        double realPart = a.realPart - b.getRealPart();
        double imaginaryPart = a.imaginaryPart - b.getImaginaryPart();
        return new Complex(realPart, imaginaryPart);
    }

    //* method to multiply to complex numbers*/
    public Complex multiply(Complex b) {
        Complex a = this;
        double realPart = a.realPart * b.realPart - a.imaginaryPart * b.imaginaryPart;
        double imaginaryPart = a.realPart * b.imaginaryPart + a.imaginaryPart * b.realPart;
        return new Complex(realPart, imaginaryPart);
    }

    //*method to divide */
    public Complex divide(Complex b) {
        Complex a = this;
        double realPart = (a.realPart * b.realPart + a.imaginaryPart * b.imaginaryPart) / (b.realPart * b.realPart + b.imaginaryPart * b.imaginaryPart);
        double imaginaryPart = (a.imaginaryPart * b.realPart - a.realPart * b.imaginaryPart) / (b.realPart * b.realPart + b.imaginaryPart * b.imaginaryPart);
        return new Complex(realPart, imaginaryPart);
    }

    //* function to get absolute value*/
    public double abs() {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);

    }

    //* to string method to return the result*/
    public String toString() {
        String finalNum;
        finalNum = realPart + "+" + imaginaryPart + "i";
        if (this.imaginaryPart == 0) {
            return this.realPart + "";
        }
        return finalNum;
    }

    public Complex Clone() {
        try {
            double realPart = this.realPart;
            double imaginaryPart = this.imaginaryPart;
            return new Complex(realPart, imaginaryPart);
        } catch (Exception CloneNotSupportedExtension) {
            System.out.println("Clone is not found");
            return null;
        }
    }

    public static void main(String[] args) {
        //* create scanner object*/
        Scanner input = new Scanner(System.in);
        //*Ask to enter the first complex num*/
        System.out.println("Enter first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex num1 = new Complex(a, b);

        //* Ask to input the second complex num*/
        System.out.println("Enter second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex num2 = new Complex(c, d);

        //* Prints the result of add, substract, multiply, divide and absoulte of two complex numbers*/
        System.out.println("(" + a + " + " + b + "i) + (" + c + " + " + d + "i) = " + num1.add(num2).toString());
        System.out.println("(" + a + " + " + b + "i) - (" + c + " + " + d + "i) = " + num1.subtract(num2).toString());
        System.out.println("(" + a + " + " + b + "i) * (" + c + " + " + d + "i) = " + num1.multiply(num2).toString());
        System.out.println("(" + a + " + " + b + "i) / (" + c + " + " + d + "i) = " + num1.divide(num2).toString());
        System.out.println("|" + a + " + " + b + "i| = " + num1.abs());
    }
}






