package com.pluralsight;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float firstNumber = myScanner.nextFloat();
        System.out.println("Enter the second number: ");
        float secondNumber = myScanner.nextFloat();
        myScanner.nextLine();
        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option by entering the capital letter that corresponds to the action: ");
        String operation = myScanner.nextLine();

        if (Objects.equals(operation, "A")){
            float addValue = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " +  secondNumber + " = " + addValue);
        } else if (Objects.equals(operation, "S")){
            float subtractValue = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " +  secondNumber + " = " + subtractValue);
        } else if (Objects.equals(operation, "M")){
            float multiplyValue = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " +  secondNumber + " = " + multiplyValue);
        } else if (Objects.equals(operation, "D")){
            float divideValue = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " +  secondNumber + " = " + divideValue);
        }else{
            System.out.println("invalid option");
        }


    }


}
