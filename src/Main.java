import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome.");

        // used to personalize user fortune based on input
        String name;
        String pastaType;
        String pastaMeal;
        String spaghettiMeal;

        name = getUserInput("Enter your name: ");
        pastaType = getUserInput("Enter your favorite pasta: " );
        pastaMeal = getUserInput("Enter a meal with pasta: ");
        spaghettiMeal = getUserInput("Enter a meal with spaghetti: ");

        System.out.println("Spaghetti Statistics");
        System.out.println("Name: " + name);
        System.out.println("Pasta type: " + pastaType);
        System.out.println("Pasta meal: "  + pastaMeal);
        System.out.println("Spaghetti meal: " + spaghettiMeal +"\n");

        String[] fortunes;
        fortunes = new String[10];
        // create the 10 fortunes to choose from when returning the user's fortune
        fortunes[0] = "Based on the " + pastaType + " and " + pastaMeal + ", you will have great luck tomorrow.";
        fortunes[1] = "Based on the " + pastaType + " and " + spaghettiMeal + ", you will go skiing tomorrow.";
        fortunes[2] = "Based on the " + pastaType + " and " + pastaMeal + ", you will soon watch a bad movie.";
        fortunes[3] = "Based on the " + pastaType + " and " + spaghettiMeal + ", you will encounter a bird.";
        fortunes[4] = "Based on the " + pastaType + " and " + pastaMeal + ", you will find treasure.";
        fortunes[5] = "Based on the " + pastaType + " and " + pastaMeal + ", you will soon encounter lots of " + spaghettiMeal + ".";
        fortunes[6] = "Based on the " + pastaType + " and " + spaghettiMeal + ", you will play a board game soon.";
        fortunes[7] = "Based on the " + pastaType + " and " + pastaMeal + ", rain will soon fall from the sky.";
        fortunes[8] = "Based on the " + pastaType + " and " + spaghettiMeal + ", Amazon will have a sale on "  + pastaType + ".";
        fortunes[9] = "Based on the " + pastaType + " and " + spaghettiMeal + ", you will find great happiness and " + pastaMeal + ".";

        readUserFortune(fortunes);

        // Copyright (C) Matthew Toomey 2020
    }

    public static String getUserInput(String prompt)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println(prompt);
        String output = userInput.nextLine();

        return output;
    }

    public static void readUserFortune(String[] fortunesArray)
    {
        Random randomFortune = new Random();
        int fortuneChoice = randomFortune.nextInt(10);

        System.out.println(fortunesArray[fortuneChoice]);

        System.out.println("Have a nice day.");
    }
}
