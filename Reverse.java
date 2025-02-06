import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String:  ");
    
    String reverseStr = sc.nextLine();
    System.out.println("Reversed String is: " + ReverseString(reverseStr));
    sc.close();
    }
    
    public static String ReverseString(String newString) {
        StringBuilder sb = new StringBuilder(newString);
        return sb.reverse().toString(); 
    }
}