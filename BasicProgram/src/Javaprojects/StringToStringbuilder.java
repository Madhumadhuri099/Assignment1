
//9. write a program to create strings and display the conversion of  
//string to stringbuilder and stringbuffer 

package Javaprojects;

public class StringToStringbuilder {
	public static void main(String args[]) {
		 // taking input string
        String str = "My";
 
        // Converting String object to StringBuffer object
        // by creating object of StringBuffer class
        StringBuffer sbr = new StringBuffer(str);
 
       
        // Converting String object to StringBuilder object
        StringBuilder sbl = new StringBuilder(str);
 
        // Adding it to string using append() method
        sbl.append("Projects");
        sbr.append("Projects");
 
        // Print and display the above appended string
        System.out.println(sbl);
        System.out.println(sbr);

}
}