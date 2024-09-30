package com.pluralsight;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(myScanner.nextLine());
        System.out.println("Enter the second number: ");
        int secondNumber = Integer.parseInt(myScanner.nextLine());
        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option by entering the capital letter that corresponds to the action: ");
        String operation = myScanner.nextLine();

        if (Objects.equals(operation, "A")){
            int addValue = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " +  secondNumber + " = " + addValue);
        } else if (Objects.equals(operation, "S")){
            int subtractValue = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " +  secondNumber + " = " + subtractValue);
        } else if (Objects.equals(operation, "M")){
            int multiplyValue = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " +  secondNumber + " = " + multiplyValue);
        } else if (Objects.equals(operation, "D")){
            double divideValue = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " +  secondNumber + " = " + divideValue);
        }else{
            System.out.println("invalid option");
        }


    }


}
