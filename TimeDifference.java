import java.time.LocalDate;
import java.time.Period;
public class TimeDifference {
    //time.difference between given date to current date
	public static void main(String[] args) {
		LocalDate givenDate=LocalDate.parse("2020-08-31");
	LocalDate currentDate=LocalDate.now();
	System.out.println(Period.between(givenDate,currentDate).getYears());
	}
}

