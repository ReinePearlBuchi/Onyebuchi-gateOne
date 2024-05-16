import java.time.LocalDate;
import java.util.Scanner;
	public class MenstrualApp{

		private static Scanner scanner = new Scanner(System.in);

		
		public static void main(String[] args){
		
		System.out.print("Welcome to Red Robot Calendar!");

		
		System.out.print("when was your last cycle (YYYY-MM-DD) ? ");
		String lastCycleInput = scanner.nextLine();
		LocalDate lastCycleDate = LocalDate.parse(lastCycleInput);

		System.out.print("What is the average length of your period:  ");
		int averageLengthOfPeriod = scanner.nextInt();

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

	}
	
		public static LocalDate calculateNextCycle(LocalDate lastCycleDate, int averageLengthOfPeriod){
			return lastCycleDate.plusDays(averageLengthOfPeriod);

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



	
	