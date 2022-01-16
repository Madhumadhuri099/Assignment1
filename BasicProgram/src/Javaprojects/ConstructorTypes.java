
// 5.write a program to demonstrate the uses of constructor and its types

package Javaprojects;

//No Arguments constructor
class NoArgument_Constructors{
	
	public String name;
	
	public NoArgument_Constructors()
	{
		name="Ambaldhage Madhuri";
	}
}
//Parameterized Constructor

class ParameterizedConstructor
{
	public String name;
	
	public  ParameterizedConstructor(String name)
	{
		this.name=name;
		
	}
}

public class ConstructorTypes {
	
public static void main(String[] args) {
		
		NoArgument_Constructors ut=new NoArgument_Constructors();
		System.out.println("No Arguments constructor : my name is "+ut.name);
		
		ParameterizedConstructor pc=new ParameterizedConstructor("This is Madhuri");
		System.out.println("ParameterizedConstructor : "+pc.name);

	}

}
