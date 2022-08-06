import java.util.Stack;
import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args)
	{
		System.out.print("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String string = sc.nextLine();
        Stack stack = new Stack();
        
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        String reverseString = "";
        
        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }
        if (string.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

	}
}
