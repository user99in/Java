 package Com.app;

import java.util.*;


public class ThirdActivity
{

	public static void main(String args[])
		{
 		  
			int num =10;
			int zero =0;
			int one = 0;

		while(num > 0){
		
			if(num % 2 == 0)
			{
				zero++;
			}
			else{

				one++;
			      }	
			num =  num   >> 1;
			
		}
		System.out.println("One : "+ one + "  \nZero : " +zero);

	}

}