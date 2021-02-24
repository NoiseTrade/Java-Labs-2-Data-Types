/*
Java Labs 2 - Data Types
David McClung
24/02/21

This is being used as revision and to do these little programs with my current knowledge
I have my old versions to compare but I am going to upload these to github publicly
So that I can look at them in future for myself and maybe receive feedback

 */
import java.util.Scanner;
public class dataTypes {
    public static void main(String[] args) {

        //1. Write a Java program to convert the temperature from Fahrenheit to Celsius degree.
        //I am going to swap these and convert Celcius to Fahrenheit
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter current temperature in degrees Celcius");

        //double is being used as the variable to allow for decimal places or floating point numbers
        double celcius = sc.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;

        System.out.println(celcius + "°C = " + fahrenheit + "°F" );


        //2. Write a Java program that reads a number in inches and converts it to meters.
        System.out.println("\nPlease enter a length in inches to convert to meters");

        double inches = sc.nextDouble();

        double meters = inches / 39.37;

        System.out.println(inches +" Inches = " + meters + " Meters");


        //3. Write a Java program to calculate Body Mass Index (BMI).

        System.out.println("This program will calculate your Body Mass Index (BMI)\nPlease input weight in pounds");

        double weight = sc.nextDouble();

        System.out.println("Please enter height in inches");

        double height = sc.nextDouble();

        double bmi = weight / (height * height) * 703;

        System.out.println("Your BMI = " + bmi);
        
    }
}
