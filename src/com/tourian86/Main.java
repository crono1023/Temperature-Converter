package com.tourian86;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        double result = 0;
        String resultUnit = null;
        if(args.length < 2) {
            System.out.println("Error not enough arguments.");
            return;
        }

        switch(args[0]){
            case "-c":
                result = fahrenheitToCelsius(Double.parseDouble(args[1]));
                resultUnit = "celsius";
                break;

            case "-f":

            case "-k":
                break;

            default:
                throw new IllegalArgumentException();
        }
        if(resultUnit != null){
            System.out.printf("Result: %.2f %s", result, resultUnit);
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }


}
