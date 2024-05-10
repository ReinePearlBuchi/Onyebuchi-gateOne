import java.util.Scanner;
public class FireDrill5{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	int total = 0;
	
	

		for(int i = 1; i <= 10; i++){
		System.out.print("Enter Scores: ");
		int scores = scanner.nextInt();

		if(scores % 2 == 0){ 
		total += scores;
		
		}
		}
	System.out.print(total);
	

	}



}