
//1. write a program which will take a string as input and will convert it into primitive Datatypes

package Javaprojects;

public class StringToDttypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    // create string variables as interger
			    String str1 = "23";
			    String str2 = "4566";
			    
			    // create string variables as double
			    String str3 = "23";
			    String str4 = "456.6";
			    
			    // create string variables
			    String str5 = "true";
			    String str6 = "false";

			    // convert string to boolean
			    // using parseBoolean()
			    boolean b1 = Boolean.parseBoolean(str5);
			    boolean b2 = Boolean.parseBoolean(str6);


			    // convert string to double
			    // using parseDouble()
			    double num3 = Double.parseDouble(str3);
			    double num4 = Double.parseDouble(str4);

			    // convert string to int
			    // using parseInt()
			    int num1 = Integer.parseInt(str1);
			    int num2 = Integer.parseInt(str2);
			    

			    // print int values
			    System.out.println(num1);    // 23
			    System.out.println(num2);    // 4566
			    
			    
			    // print double values
			    System.out.println(num3);    // 23.0
			    System.out.println(num4);    // 456.6
			    
			    // print boolean values
			    System.out.println(b1);    // true
			    System.out.println(b2);    // false

			  }
			

	}


