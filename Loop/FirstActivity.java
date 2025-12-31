package loop.app;
import java.util.*;
public class FirstActivity
{
    public static void main(String args[])
 	{
   	     for (int i = 6; i >= 1; i--)   
        		  {
            		for(int j = 1; j <= 6-1; j++)
            		  {
                			System.out.print("  * ");
            		  }
            		for(int j = 1; j <= i; j++)
            		  {
                			System.out.print(" * ");
            		  }
            		System.out.println();
        		}		
	}
}
 