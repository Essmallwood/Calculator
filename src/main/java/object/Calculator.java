package object;
/*

Create a Calculator class with the following methods:
Add()
Subtract()
Multiply()
Divide()
square()
squareRoot()
exponents().

 */

public class Calculator {
    private double valueOne;
    private double valueTwo;

public Calculator(double valueOne, double valueTwo){
this.valueOne = valueOne;
this.valueTwo = valueTwo;
}
    // setter - changes
    public void setValueOne(Double valueOne) {
        this.valueOne = valueOne;
    }

    // getter - returns
    public double getValueOne(Double valueOne) {
        return this.valueOne = valueOne;
    }


    // setter - changes
    public void setValueTwo(Double valueTwo) {
        this.valueTwo = valueTwo;
    }

    // getter - returns
    public double getValueTwo(Double valueTwo) {
        return this.valueTwo = valueTwo;
    }


    public double Add(double valueOne, double valueTwo) {
        return valueOne + valueTwo;
    }

    public double Subtract(double valueOne,double valueTwo) {
        return valueOne - valueTwo;
    }

    public double Multiply(double valueOne,double valueTwo) {
        return valueOne * valueTwo;

    }

    public double Divide(double valueOne,double valueTwo) {
        return valueOne / valueTwo;
    }

    public double Square(double valueOne) {
        return valueOne * valueOne;

    }

    public static double squareRoot(double valueOne) {
        return Math.sqrt(valueOne);
    }

    public static double exponents(double valueOne, double valueTwo) {
        return Math.pow(valueOne, valueTwo);
    }




}
