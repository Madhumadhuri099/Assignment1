
//4. write a program to demonstrate different methods and different return types

package Javaprojects;

public class DiffMethod {
	//static method without specific return type and with arguments
			public static void registration(String name,String email,long contact)
			 {
			 System.out.println("Name :"+name);
			 System.out.println("Email address:"+email);
			 System.out.println("Contact details: "+contact); 
			 }
			
		// method with return type
			public static String sname()
			 {
				 return "abcd";
			 }
			public static long phnofield()
			 {
			 return 1234567890;
			 }
			 public static char genderfield()
			 {
			 return 'M';
			 }
			 public static int empId()
			 {
				 return 12345678;
			 }
			//non-static method without specific return type and with arguments
			 public  void registration1(String name,String email,long contact)
			 {
			 System.out.println("Name :"+name);
			 System.out.println("Email address:"+email);
			 System.out.println("Contact details: "+contact); 
			 }
			//non-static method with return type
			public  String sname1()
			 {
				 return "abcd";
			 }
			public  long phnofield1()
			 {
			 return 1234567890;
			 }
			 public char genderfield1()
			 {
			 return 'M';
			 }
			 public  int empId1()
			 {
				 return 12345678;
			 }

}
