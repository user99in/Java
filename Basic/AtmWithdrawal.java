package Com.app;

import java.util.Scanner;

public class AtmWithdrawal {

    public static void main(String[] args)
	 {

        		Scanner scan = new Scanner(System.in);
        		int balance = 5000;
       		 System.out.println("Your current balance is: " + balance);

    		 System.out.print("Do you want to withdraw money? (Yes / No): ");
        		String choice = scan.nextLine();

        		if (choice.equalsIgnoreCase("Yes")) {

            		System.out.print("Enter withdrawal amount: ");
            		int withdrawal = scan.nextInt();

            		if (withdrawal <= balance && withdrawal > 0) {
               		 balance = balance - withdrawal;
                		System.out.println("Withdrawal Successful!");
                		System.out.println("Remaining balance: " + balance);
            		} else {
              			  System.out.println("Insufficient balance or invalid amount!");
          		}

        		} else {
            			System.out.println("Thank you! Visit again.");
        		}

        			scan.close();
    		}
}
