import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your Principal");
        int p = (int)cin.nextDouble() * 100;
        System.out.println(("Enter APR"));
        int apr = (int)cin.nextDouble() * 100;
        System.out.println("Enter how long you will save (whole years)");
        int yr = cin.nextInt();
        double rmoney = (p * (1 + (apr/10000.00)) * yr)/100.00;
        System.out.println("After " + yr + " years with an interest rate of " + apr/100 + "% Apr, you will have $" + rmoney + " dollars.");
    }
}