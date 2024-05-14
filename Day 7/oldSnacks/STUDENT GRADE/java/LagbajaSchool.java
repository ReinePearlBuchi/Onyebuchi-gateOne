import java.util.Scanner;
public class LagbajaSchool{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
		System.out.println("How many Student do you have: ");
		int numberOfStudent = scanner.nextInt();
	
		System.out.println("How many subject do you offer: ");
		int subjectOffered = scanner.nextInt();

		System.out.println("Saving" + ">".repeat(20) + "\nSaved Successfully"\n);
		
		int [][] scores = new int[numberOfStudent][subjectOffered];
	

		for(int i = 1; i < numberOfStudent; i++){
		for(int j = 1; j < numberOfStudent; j++){
		System.out.println("Entering score for Student" + i + 1 + ":" );
		System.out.print("Entering score for subject: " + j + ":");
		int subjectScore = scanner.nextInt();

			}

			System.out.println("Saving" + ">".repeat(20));
			System.out.println("Saved Successfully");
	



	
		
		}
		
		
		

		

	}




}