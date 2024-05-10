import java.util.Scanner;
public class FireDrill2{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	
	int total = 0;
	int average = 0;
	int input = 10;

		for(int i = 1; i <= input; i++){
	
		System.out.print("Enter Scores: ");
		int scores = scanner.nextInt();
		total += scores;

		}

		System.out.print(total/input);

	}



}