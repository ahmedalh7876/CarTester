/*
 * Author: Ahmed A.
 * Last Edit: March 5th, 2020.
 * This program is a simple demonstration of what a class can do in Java, it generates cars and properties then displays them.
 */

package cartester;

import java.util.Scanner;

/**
 *
 * @author ahalh7876
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Import scanner to allow user input through the console.
        Scanner input = new Scanner(System.in);

        System.err.println("INPUT DATA FOR CAR 1 BELOW:");
        System.out.println("What's the make of the car?");
        String make = input.next();
        System.out.println("What's the model of the car?");
        String model = input.next();
        System.out.println("What's the colour of the car?");
        String colour = input.next();
        System.out.println("What's the price ($) of the car?");
        int price = input.nextInt();
        System.out.println("What year was the car released?");
        int year = input.nextInt();
        System.out.println("Does the car have heated seats? If yes, type \"True\", otherwise \"False\".");
        boolean hs = input.nextBoolean();
        Car car1 = new Car(make, model, colour, year, price, hs);

        System.err.println("INPUT DATA FOR CAR 2 BELOW:");
        System.out.println("What's the make of the car?");
        make = input.next();
        System.out.println("What's the model of the car?");
        model = input.next();
        System.out.println("What year was the car released?");
        year = input.nextInt();
        Car car2 = new Car(make, model, year);
        
        Car car3 = new Car();

        //Print the details of each dog
        System.out.println(car1.toString());
        System.out.println("--------------------------");

        System.out.println(car2.toString());
        System.out.println("--------------------------");

        //toString is called by default, no need to write it!
        System.out.println(car3);
        System.out.println("--------------------------");

        //dog1 barks friendly, dog2 barks angry
        car1.honkFriendly();
        car2.honkAngry();
    }

}
