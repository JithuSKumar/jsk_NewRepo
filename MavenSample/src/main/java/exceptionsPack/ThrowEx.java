package exceptionsPack;

public class ThrowEx {

	public static void main(String[] args) 
	{
		int age =10;
		
		if(age >= 18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Not Eligible for Voting");
		}
	}

}
