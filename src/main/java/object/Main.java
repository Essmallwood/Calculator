package object;

public class Main  {

    public static void main(String[] args) {
        //Use a constructor to create a calculator Object
        Calculator calculator  = new Calculator(1,2);

        // Call/invoke each method on the object and print out the results in main
        System.out.println(calculator.Add(10,20));
        System.out.println(calculator.Divide(10,2));
        System.out.println(calculator.Subtract(10,5));calculator.Subtract(5,1);
        System.out.println(calculator.Square(5));
        System.out.println (calculator.Multiply(12,2));
        System.out.println(calculator.squareRoot(64));
        System.out.println(calculator.exponents(5,2));
    }
    }
