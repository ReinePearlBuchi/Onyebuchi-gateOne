import java.util.Scanner;
public class FireDrill{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	
	int total = 0;

		for(int i = 1; i <= 10; i++){
	
		System.out.print("Enter Scores: ");
		int scores = scanner.nextInt();
		total += scores;

		}
		System.out.print(total);
	}



}