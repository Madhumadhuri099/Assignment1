
//12. write a program to search for the string given by the user from the array of strings

package Javaprojects;
import java.util.Scanner;

public class ArrayOfStrings {
public static void main(String[] args) {
		
		// search specific String 
				String str="Practice makes man perfect";
				String str1 = str.toLowerCase();
				Scanner sc =new Scanner(System.in);
				System.out.println("Search here");
				String word = sc.next();
				int index = str1.indexOf(word);
				if(index==-1)
				{
					System.out.println(word+" not Found");
				}
				else
				{
					System.out.println(word+" is Found at index of "+index);
				}

	}

}
