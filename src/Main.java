import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to SpaghettiSim.");
        String nm;
        int a;
        String p;
        String spaghetti;
        String spaghetti2;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name:");
        nm = s.nextLine();
        System.out.println("Enter a number:");
        a = Integer.parseInt(s.nextLine());
        System.out.println("Enter a pasta:");
        p = s.nextLine();
        System.out.println("Enter a spaghetti dish:");
        spaghetti = s.nextLine();
        System.out.println("Enter another spaghetti dish:");
        spaghetti2 = s.nextLine();

        System.out.println("Thank you.");
        System.out.println("Name: " + nm);
        System.out.println("Number: " + a);
        System.out.println("Pasta type: " + p);
        System.out.println("First spaghetti dish: "  + spaghetti);
        System.out.println("Second spaghetti dish: " + spaghetti2);

        Random r = new Random();
        String[] spaghettiScopes;
        spaghettiScopes = new String[10];
        spaghettiScopes[0] = "Based on the " + p + " and " + spaghetti + ", you will have great luck tomorrow.";
        spaghettiScopes[1] = "Based on the " + p + " and " + spaghetti + ", you will go skiing tomorrow.";
        spaghettiScopes[2] = "Based on the " + p + " and " + spaghetti + ", you will soon watch a bad movie.";
        spaghettiScopes[3] = "Based on the " + p + " and " + spaghetti + ", you will encounter a bird.";
        spaghettiScopes[4] = "Based on the " + p + " and " + spaghetti + ", you will find treasure.";
        spaghettiScopes[5] = "Based on the " + p + " and " + spaghetti + ", you will soon encounter lots of " + spaghetti2 + ".";
        spaghettiScopes[6] = "Based on the " + p + " and " + spaghetti + ", you will play a board game soon.";
        spaghettiScopes[7] = "Based on the " + p + " and " + spaghetti + ", rain will soon fall from the sky.";
        spaghettiScopes[8] = "Based on the " + p + " and " + spaghetti + ", Amazon will have a sale on "  + p + ".";
        spaghettiScopes[9] = "Based on the " + p + " and " + spaghetti + ", you will find great happiness and " + spaghetti + ".";

        int mySP = r.nextInt(10);
        System.out.println(spaghettiScopes[mySP]);
        System.out.println("Thank you for using spaghettiSim.");

    }
}
