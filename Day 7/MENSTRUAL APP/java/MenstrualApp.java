import java.time.LocalDate;
import java.util.Scanner;
	public class MenstrualApp{

		private static Scanner scanner = new Scanner(System.in);

		
		public static void main(String[] args){
		
		System.out.print("Welcome to Red Robot Calendar!");
		System.out.print("your menstrual period Tracker");
		System.out.println( ">".repeat(20));	
	
	
		
		System.out.print("when was your last cycle (YYYY-MM-DD) ");
		String lastCycleInput = scanner.nextLine();
		LocalDate lastCycleDate = LocalDate.parse(lastCycleInput);
		System.out.print("Your menstrual cycle starts on the first day of a new period and runs until the day before your next period,");
		System.out.println( ">".repeat(20));	
		
	


		System.out.print("What is the average length of your period:  ");
		int averageLengthOfPeriod = scanner.nextInt();
		System.out.print("The average menstrual cycle is 28 days long, but if yours is between 21 and 35 days long, then it’d be considered typical");
		System.out.println( ">".repeat(20));	
		


		LocalDate nextCycleDate = calculateNextCycle(lastCycleDate, averageLengthOfPeriod);
		LocalDate ovulationDate = calculateOvulationDate(lastCycleDate, averageLengthOfPeriod);
		LocalDate safePeriodStartDate = calculateSafePeriodStartDate( lastCycleDate);
		LocalDate  safePeriodEndDate = calculateSafePeriodEndDate(ovulationDate);
		
		System.out.println("");

		System.out.println("Your next period is expected around: " + nextCycleDate);

		System.out.println("");

		System.out.println("Your estimated ovulation date is: " + ovulationDate);

		System.out.println("");

		System.out.println("Your estimated safe period is from " + safePeriodStartDate +  " to " + safePeriodEndDate);
		System.out.println("Safe days calculator helps you to find out the safe days in your menstrual cycle, that you can have sexual intercourse without the fear of getting pregnant. It just requires you to remember the starting date of your last period, and your longest and shortest menstrual cycle.");

	}
	
		public static LocalDate calculateNextCycle(LocalDate lastCycleDate, int averageLengthOfPeriod){
			return lastCycleDate.plusDays(averageLengthOfPeriod + 28);

		}

		public static LocalDate calculateOvulationDate(LocalDate lastCycleDate, int averageLengthOfPeriod){
			return lastCycleDate.plusDays(averageLengthOfPeriod / 2);

		}

		public static LocalDate calculateSafePeriodStartDate(LocalDate lastCycleDate){
			return lastCycleDate.plusDays(7);

		}
		
		public static LocalDate calculateSafePeriodEndDate(LocalDate lastCycleDate){
			return lastCycleDate.minusDays(10);

		}

}



	
	