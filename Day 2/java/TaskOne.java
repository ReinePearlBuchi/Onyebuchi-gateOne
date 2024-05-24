public class TaskOne{
	public static void main(String[] args){


	int []numbers = {20,33,43,55,27,81,90,37,88,12};
	
		PrintVertically(numbers);

	}

	public static void PrintVertically(int[]num){
		int num = 0;
		for(int i = 0; i <= num.length; i++){
		System.out.print(num.length);
	
		}

	}

	//public static int[] PrintHorizontally(int[]num){

	//	for(int i = 0; i <= num.length; i++){
		System.out.print(num);
	//
//		}


	//}


}

public class Functions{
	
	public static void main(String[] args){
	int[] scores = {5,6,9,13,66,97,34,76,40,28};

	//printVertically(scores);
	printHorizontally(scores);
	
	}

	// Vertical	
	public static void printVertically(int[] numbers){
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);			
		}	
	}

	// horizontal
	public static void printHorizontally(int[] numbers){
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + ", ");			
		}
	
	}

	


}		