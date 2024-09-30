package com.pluralsight;
import java.util.*;
public class Calculator2 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){

        float firstNumber = promptForFloat("Please enter First Number: ");
        float secondNumber = promptForFloat("Please enter Second Number: ");

        String operation = promptForOperationType();

        if (Objects.equals(operation, "A")) doAdd(firstNumber,secondNumber);
        else if (Objects.equals(operation, "S")) doSubtract(firstNumber,secondNumber);
        else if (Objects.equals(operation, "M")) doMultiply(firstNumber,secondNumber);
        else if (Objects.equals(operation, "D")) doDivide(firstNumber,secondNumber);
        else{
            System.out.println("invalid option");
        }


    }
    public static String promptForOperationType(){
        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option by entering the capital letter that corresponds to the action: ");
        return myScanner.nextLine();
    }

    public static float promptForFloat(String prompt){
        System.out.println(prompt);
        float firstNumber = myScanner.nextFloat();
        myScanner.nextLine();
        return firstNumber;
    }

    public static void doAdd(float firstNumber, float secondNumber){
        float addValue = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " +  secondNumber + " = " + addValue);
    }

    public static void doSubtract(float firstNumber, float secondNumber){
        float subtractValue = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " +  secondNumber + " = " + subtractValue);
    }

    public static void doMultiply(float firstNumber, float secondNumber){
        float multiplyValue = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " +  secondNumber + " = " + multiplyValue);
    }

    public static void doDivide(float firstNumber, float secondNumber){
        float divideValue = firstNumber / secondNumber;
        System.out.printf("%.2f / %.2f = %.2f",firstNumber,secondNumber,divideValue);
    }


}
