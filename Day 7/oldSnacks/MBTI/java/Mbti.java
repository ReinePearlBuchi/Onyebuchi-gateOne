public class Mbti{
	public static void main(String[] args){


	}
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int countA1 = 0;
	private static int countB1 = 0;
	private static int countA2= 0;
	private static int countB2 = 0;
	private static int countA3 = 0;
	private static int countB3 = 0;
	private static int countA4= 0;
	private static int countB4 = 0;

	private static void questionnaire(){
		for(int i = 1; i <= 20; i ++){
			String userInput = scanner.nextLine();
			switch(i){
				case 1 ->
				
			}
		}
	
	}
	

	private static void questionnaireResult(){
		if(countA1 > countB1){
			System.out.print("E");	
		}
		else{
			System.out.print("I");
		}

		if(countA2 > countB2){
			System.out.print("S");	
		
		else{
			System.out.print("N");
		}
		if(countA3 > countB3){
			System.out.print("T");	
		}
		else{
			System.out.print("F");
		}
		if(countA4 > countB4){
			System.out.print("J");	
		}
		else{
			System.out.print("P");
		}


	}
		
}
	
	
