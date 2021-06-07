package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Converted Value is " + calcFeetFeetAndInchesToCentimeters(100) + " cm.");

    }

    public static double calcFeetFeetAndInchesToCentimeters(double feet, double inches){
        if((feet >= 0) && (inches >= 0 && inches <= 12)){
            double convertedInches = inches * 2.54;
            double convertedFeet = feet * 12 * 2.54;
            return convertedFeet + convertedInches;
        } else{
            return -1;
        }
    }


    public static double calcFeetFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) inches / 12;
            double newInches = (int) inches % 12;
            return calcFeetFeetAndInchesToCentimeters(feet, newInches);
        } else {
            return -1;
        }
    }

}
