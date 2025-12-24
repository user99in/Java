//Variable :: A variable is a named container that stores data in memory which can be used and modified during program execution.

// Data type :: Java has two categories of data types: 1.Primitive DataType      2. Refreance DataTpye
package Com.app;

public class Datatype
{
	public static void main(String args[])
		{
			//Variable 
			int age =18;	// age is a variable
			System.out.println("Age is a Variable :: "+age);

			//IntergerType
			byte b = 127;           		// 8-bit, range: -128 to 127
			short s = 3200;       		// 16-bit, range: -32,768 to 32,767
			int i = 10000;		 // 32-bit, range: -2^31 to 2^31-1
			double d = 999999l;		 // 64-bit, range: -2^63 to 2^63-1
	
			System.out.println("This is Interger type - byte :: "+b+ ", short :: "+s+ " , int  :: "+i+ " , double :: " +d);
		
			//Floating-point Type
			float f = 3.14f;		// 32-bit, single precision
			double df = 3.1245;		// 64-bit, double precision
			
			System.out.println("Floating -point Type");

			//Character Type
			char c = 'A'; 		//16-bit, Unicode character
			System.out.println("This is a Character Type :: " +c);

			//Boolean Type
			boolean isTrue = true;  	// true or false
			System.out.println("This is a Boolean Type :: " +isTrue);

		
		}

}
