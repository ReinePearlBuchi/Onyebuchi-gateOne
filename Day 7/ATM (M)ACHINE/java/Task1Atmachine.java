import java.util.Scanner;
	public class Task1Atmachine{
		private static int balance ;
		private static int amountDeposit;

		public static void main(String[] args){
		

		Scanner scanner = new Scanner(System. in);

		display();
		System.out.println("Choose an option ");
		int option = scanner.nextInt();

		switch(option){
		case 0: 
		scanner.nextLine();

		System.out.print("Enter your First Name:  ");
		String firstName = scanner.nextLine();
	
		System.out.print("Enter your Last Name:  ");
		String lastName = scanner.nextLine();

		System.out.println("Insert Pin: ");
		int pinInsert = scanner.nextInt();

		System.out.println("Your Account has been Succssfully Created! \n Your Name is " + firstName + " " +lastName );
		System.out.println("Saving" + ">".repeat(20));
		break;
		
			




		case 1:
		System.out.println("Would you like to close Your Account?  yes/no");
		String closeAccount = scanner.nextLine();

	
		System.out.println("What are your reasons why? ");
		String reasonForClosure = scanner.nextLine();


		System.out.print("Account Closed! Successfully!");
		System.out.println("Saving" + ">".repeat(20));
		break;


		case 2:
			
			System.out.print("Would you like to deposit  ");
			String question = scanner.nextLine();

			System.out.print("How much would you like to deposit?  Enter Amount:  ");
			int amountDeposit = scanner.nextInt();
			deposit(amountDeposit);

			System.out.print("Savings or Current account");
			String typeOfAccount = scanner.nextLine();

			System.out.println("Transaction Successful");
			System.out.println("Saving" + ">".repeat(20));

		break;


		case 3:
			System.out.println("How much would you like to withdraw?  Enter Amount:");
			int amountToWithdraw = scanner.nextInt();
			withdraw(amountToWithdraw);


			System.out.println("Transaction Successful");
			System.out.println("Saving" + ">".repeat(20));

		break;


		case 4:
			System.out.print("The balance of your account is"  + amountDeposit  );


		break;

		case 5:
			System.out.print("Would you like to change Your pin? ");
		int changePin = scanner.nextInt();
	
		break;

		default:
			System.out.print("invalid input exiting now!!!");
			return;


		}
		

		}

		public static void createId(){
		System.out.print("Creating your ID for your Account===>  ");
		}

		public static void display(){
			String Options= """
				Press
		0-> Open Account
		1 -> Close Account
		2 -> Deposit Account
		3 -> Withdraw Money
		4 -> Check Account Balance
		5 -> Change pin
		""";
		System.out.print(Options);

		}	

		public static int deposit(int num1){
			int amount = 0;
			 balance = 0;

			 return balance + amount;
			

		}

		public static int withdraw(int num1){
			int amount = 0;
			int withdraw = 0;
			

			return balance + withdraw;
		}

		
		public static int balance(int num1){
			int amount = 0;
			 balance = 0;
			return balance;

		}
	
}