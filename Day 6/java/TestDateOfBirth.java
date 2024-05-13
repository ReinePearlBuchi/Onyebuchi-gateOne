import java.util.*;
	public class TestDateOfBirth{

	String dateOfBirth = "06-09-1995";
	String dateOfBirth = "26-02-2024";


	@Test
	public void testAge(){
		int calculateAge = Task1.SearchAge(dateOfBirth);
		int expected = 30;
		int expected = 2;
		assertEquals(expected, calculateAge);


	}

	}