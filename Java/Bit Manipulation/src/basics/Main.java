package basics;

public class Main {

	/**
	 * @param args
	 */
	/**
	 * 
	 * @param num - integer in which we will return the ith bit
	 * @param i - position of the bit of num to return
	 * @return 0 if ith bit of num is 0, else 1
	 */
	public boolean getBit(int num,int i)
	{
		return ((num & (1 << i)) != 0);
	}
	
	/**
	 * 
	 * @param num - integer in which we will set the ith bit to 1
	 * @param i - position of the bit of num to be set to 1
	 * @return new number where ith bit of num is set to 1
	 */
	public int setBit(int num, int i)
	{
		return num | (1<<i);
	}
	
	/**
	 * 
	 * @param num - integer in which we will set the ith bit to 0
	 * @param i - position of the bit of the num to be set to 0
	 * @return new number where the ith bit of num is set to 0
	 */
	public int clearBit(int num, int i)
	{
		int mask = ~(1 << i);
		return num & mask;
	}
	
	/**
	 * 
	 * @param num - integer in which we wish to set all bits from MSB to i (inclusive) to 0
	 * @param i - position of the bit until which we want all bits to be 0
	 * @return new number where the MSB to i bits in num have been set to 0
	 */
	public int clearBitsMSBThroughi(int num, int i)
	{
		int mask = (1<<i) - 1;
		return num & mask;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		System.out.println(main.clearBit(6, 1));

	}

}
