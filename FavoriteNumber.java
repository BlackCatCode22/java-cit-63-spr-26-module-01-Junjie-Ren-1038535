import java.util.Scanner;
public class FavoriteNumber{
    public static void main(String[] args){
        System.out.println("What is your favorite Number?");
        Scanner cin = new Scanner(System.in);
        double Favnum = cin.nextDouble();
        System.out.println("Wow! Your Favorite Number Is: " + Favnum +"! Very Interesting!");
    } // https://www.w3schools.com/java/java_user_input.asp#gsc.tab=0
}