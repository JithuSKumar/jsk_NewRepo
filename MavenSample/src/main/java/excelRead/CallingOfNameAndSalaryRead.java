package excelRead;

import java.io.IOException;


public class CallingOfNameAndSalaryRead 
{
	

	public static void main(String[] args) throws IOException 
	{
		String nameString = NameAndSalaryRead.getStringData(2, 0);
		System.out.println("Name in 2,0 posistion is "+ nameString);
		
		String salaryString = NameAndSalaryRead.getIntegerData(2, 1);
		System.out.println("Salary in 2,1 posistion is "+ salaryString);
	}

}
