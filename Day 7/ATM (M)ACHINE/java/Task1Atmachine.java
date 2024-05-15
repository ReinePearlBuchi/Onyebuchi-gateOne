import java.util.Scanner;
	public class Task1Atmachine{
		public static void main(String[] args){

		Scanner scanner = new Scanner(System. in);


		display();
		System.out.print("Choose an option ");
		int option = scanner.nextInt();

		switch(options){
		case 0: 
		System.out.println("Enter your First Name:  ");
		String firstName = scanner.nextLine();
	
		System.out.println("Enter your Last Name:  ");
		String lastName = scanner.nextLine();

		System.out.println("Insert Pin: ");
		int pinInsert = scanner.nextInt();

		System.out.println("Your Account has been Succssfully Created! \n Your Name is " firstName + lastName );
		break;


		case 1:
		System.out.println("Would you like to close Your Account? ");
	
		System.out.println("What are your reasons why? ");


		System.out.println("");
		break;


		case 2:
		System.out.print("Would you like to deposit  ");

		System.out.print("How much would you like to deposit?  Enter Amount:  ");

		System.out.print("Savings or Current account");
		break;

		case 3:
		System.out.println("How much would you like to withdraw?  Enter Amount:");
		break;

		case 4:
		System.out.print("The balance of your account is");
		break;

		case 5:
		System.out.print("Would you like to change Your pin? ");	
		break;

		default:
			System.out.print("invalid input exiting now!!!");
			return;


		}
		

		}

	public static void createId(){
	System.out.print("Creating your ID for yourr Account===>  ");
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

	
}