import java.util.Scanner;
public class CharDetails {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("enter a character");
        char c = cin.nextLine().charAt(0);
        int uval = (int) c;
        if(uval >= 97){
            if(uval <= 122){
                System.out.println("The char " + c + " is a Lower Case character, its Unicode is " + uval);
            }
        } else if (uval>= 65) {
            if (uval <= 90) {
                System.out.println("The char " + c + " is a Upper case character, its Unicode is " + uval);
            }
        } else if (uval >= 48 && uval<58) {
            System.out.println("The char " + c + " is a number, its Unicode is " + uval);
        }
    }
}// Thanks to Gemini to explain to me that we are able to use char.at right after a method call
// https://www.w3schools.com/java/java_conditions.asp