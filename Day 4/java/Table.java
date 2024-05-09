import java.util.Scanner;
public class Table{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	int num = 9;

	for(int count = 1; count <= num; count++){
		for(int j = 0; j <= num; j++){
			System.out.println("Enter a letter that's either X || O :" + count);
			String userInput = scanner.nextLine();	
		}

	}
	
	if (userInput.equalsIgnoreCase("x")) {
                       System.out.print("O") ;
                    } else{ System.out.print("X");
                }
	

		boolean valid = userinput == X || userinput == 0;
		if(valid){
			System.out.println("Enter a letter that's either X || O :" + count);
			String userInput = scanner.nextLine();
	
		
		System.out.print("");	
		
	
}
}
}