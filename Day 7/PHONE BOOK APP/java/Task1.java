import java.util.Scanner;
public class Task1Atmachine{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System. in);

	System.out.print("Enter your First Name:  ");
	String prompt = scanner.nextLine();
	
	System.out.print("Enter your Last Name:  ");
	String prompt2 = scanner.nextLine();

	System.out.print("Insert Pin");
	int pin = scanner.nextInt();



	}

	public static int pin(int number){
	// creating a pin with asterik without throwing exceptions
		for(int i = 1; i < 1000; i++){
			try { 
				pin = obj.nextInt();
				if(pin <= 9999 && pin >= 1000){
				}
				else{
				System.out.println("pin must be 4 digits");
				pin();

				}

				break;

				

		
			}




		while(in.has NextInt()) {
			int n = pin.nextInt();
			if (n > 0){
				System.out.print("Input must be 4 digits");
			}
	System.out.print(prompt);

		}
	System.out.println()
		}

	public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accountNumber = scanner.nextInt(); 
 
        System.out.print("Enter Account type: ");  
        accountType = scnner.nextInt();  

        System.out.print("Enter Name: ");  
        String name = scnner.nextLine();  

        System.out.print("Enter Balance: ");  
        int balance = scanner.nextLong();  

    	}  

	  //method to deposit money  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
    //method to withdraw money  
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    //method to search an account number  
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  


	}

	}











}