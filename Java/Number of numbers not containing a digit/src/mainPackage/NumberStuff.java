package mainPackage;

public class NumberStuff {

	
	public int N =123546;
	public int digitToCheck = 4;
	
	public int numberOfDigits(int n)
	{
		int numberOfDigits =0;
		while(n>0)
		{
			numberOfDigits++;
			n/=10;
		}
		return numberOfDigits;
	}
	
	public boolean simpleDigitCheck(int n)
	{
		while(n>0)
		{
			int i = n%10;
			if(i==digitToCheck)
			{
				return true;
			}
			else
			{
				n/=10;
			}
		}
		return false;
	}
	
	public int countNumbersThatDontHaveThisDigit(int n)
	{
		int counter =0;
		for(int i=0;i<n;i++)
		{
			if(simpleDigitCheck(i))
			{
				counter++;
			}
		}
		return counter;
	}

}
