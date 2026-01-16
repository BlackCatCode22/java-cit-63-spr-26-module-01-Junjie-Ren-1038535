import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Please enter a whole Number: ");
        int yr = cin.nextInt();
        System.out.println("Please enter an imaginary creature: ");
        String animal = cin.next();
        System.out.println("Please enter an action: ");
        String action = cin.next();
        System.out.println("Please enter a food: ");
        String food = cin.next();
        System.out.println("Please enter an object: ");
        String obj = cin.next();
        System.out.println(yr + " million years ago, when " + animal + "s are still a common creature that lives"
            + " on this planet.\n" + animal + "s used to " + action + " in order to seek food that they rely on"
            + " to survive.\nThe crucial food, " + food + ", contains one crucial nutrient that the "
            + animal + " needs: \nthe 23rd amino acid that couldn't be found elsewhere.\nEver since a"
            + " meteor made up of " + obj + " fell on this planet,caused a massive extinction event,\nand disrupted the ecosystem and the food chain, "
            + food + " and the 23rd amino acid went extinct and " + animal + "s soon followed after.\n"
        );
    }
}