
//11.write a program to search for the given set of strings using regular expression

package Javaprojects;

public class SetOfStrings {

public static void main(String[] args) {
		
		// searching of specific String 
				String str="This is Madhuri";
				int index = str.indexOf("Madhuri");
				if(index==-1)
				{
					System.out.println("Madhuri");
				}
				else
				{
					System.out.println("Name is Found at index of "+index);
				}
			}


}
