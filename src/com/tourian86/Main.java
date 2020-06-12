package com.tourian86;

public class Main {

    public static void printHelp() {
        System.out.println("Usage temp_conv -conversion-type <temperature>");
        System.out.println("Example (32 fahrenheit to celsius: ");
        System.out.println("tempconv -fc 32");
        System.out.println("32 celsius to kelvin:");
        System.out.println("temp_conv -ck 32\n");
        System.out.println("Converstion Type Options:");
        System.out.println("fc, cf, ck, kc, fk, kf");
    }

    public static void main(String[] args) {
	    // write your code here
        double result;
        String resultUnit;
        String origUnit;
        String conversionType;
        double origTemp;
        if(args.length < 2) {
            System.out.println("Error not enough arguments.");
            return;
        }
        conversionType = args[0];
        origTemp = Double.parseDouble(args[1]);

        switch(conversionType){
            case "-fc":
                result = fahrenheitToCelsius(origTemp);
                resultUnit = "celsius";
                origUnit = "fahrenheit";
                break;

            case "-cf":
                result = celsiusToFahrenheit(origTemp);
                resultUnit = "fahrenheit";
                origUnit = "celsius";
                break;

            case "-ck":
                result = celsiusToKelvin(origTemp);
                resultUnit = "kelvin";
                origUnit = "celsius";
                break;

            case "-kc":
                result = kelvinToCelsius(origTemp);
                resultUnit = "celsius";
                origUnit = "kelvin";
                break;

            case "-fk":
                result = fahrenheitToKelvin(origTemp);
                origUnit = "fahrenheit";
                resultUnit = "kelvin";
                break;

            case "-kf":
                result = kelvinToFahrenheit(origTemp);
                origUnit = "kelvin";
                resultUnit = "fahrenheit";
                break;

            default:
                throw new IllegalArgumentException();
        }
        System.out.printf("%.2f %s = %.2f %s", origTemp, origUnit, result, resultUnit);
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) { return (celsius + 273.15); }

    public static double kelvinToCelsius(double kelvin) { return (kelvin + 273.15); }

    public static double fahrenheitToKelvin(double fahrenheit){ return (celsiusToKelvin(fahrenheitToCelsius(fahrenheit))); }

    public static double kelvinToFahrenheit(double kelvin) { return celsiusToFahrenheit(kelvinToCelsius(kelvin)); }


}
