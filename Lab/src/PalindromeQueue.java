import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class PalindromeQueue {
	public static void main(String[] args) 
	{

    	System.out.print("Enter any string:");
        Scanner sc=new Scanner(System.in);
        String string = sc.nextLine();
        Queue queue = new LinkedList();

        for (int i = string.length()-1; i >=0; i--) 
        {
            queue.add(string.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) 
        {
            reverseString = reverseString+queue.remove();
        }
        if (string.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }

}
