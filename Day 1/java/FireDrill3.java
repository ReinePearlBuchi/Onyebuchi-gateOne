import java.util.Scanner;
public class FireDrill3{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	
	int total = 0;
	int input = 10;
	int average = total/input;

		for(int i = 1; i <= input; i++){
	
		System.out.print("Enter Scores: ");
		int scores = scanner.nextInt();
		total += scores;

		}

		System.out.println("The sum of the total score is "+ total );
		System.out.println("The average score is " + total/input );



	}



}