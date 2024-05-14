import java.time.LocalDateTime;
import java.util.Scanner;
	public class MenstrualApp{
		public static void main(String[] args){


		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome to Red Robot Calendar! \n What is your Name? ");
		String userinput = scanner.nextLine();

		System.out.print("Hi!" + userinput );

		String prompt = """
		\nDescribe how you are feeling today
		"1" -> Bright and Cheery
		"2" -> Grumpy and jumpy
		"3" -> In sifia pain
		""";
	
		Switch (prompt) {
		case 1 :
		System.out.print( "Bright and Cheery");
		break ;
		case 2 :
		System.out.print( "Grumpy and jumpy");
		break ;
		case 3 :
		System.out.print( "In sifia pain");
		break ;
		default :
		System.out.print( "Invalid Input");
		}

		System.out.println("Saving" + ">".repeat(20));
			System.out.println("Saved Successfully");
		
		
		System.out.println("Saving" + ">".repeat(20));
			System.out.println("Saved Successfully");






		}
		

		
			}

		}



	
	