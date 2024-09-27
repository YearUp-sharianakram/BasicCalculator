package com.pluralsight;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = myScanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = myScanner.nextInt();
        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option by entering the capital letter that corresponds to the action: ");
        String opertaion = myScanner.nextLine();
        System.out.println(opertaion);

        if (opertaion == "A"){
            int addValue = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " +  secondNumber + " = " + addValue);
        } else if (opertaion == "S"){
            int subtractValue = firstNumber - secondNumber;
        } else if (opertaion == "M"){
            int multiplyValue = firstNumber * secondNumber;
        } else {
            double divideValue = firstNumber / secondNumber;
        }


    }


}
