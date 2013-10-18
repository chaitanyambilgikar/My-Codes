package checkIfAnagrams;

import java.util.Arrays;

public class CheckBySorting {
	
	private String firstString;
	private String secondString;
	public String getFirstString() {
		return firstString;
	}
	public void setFirstString(String firstString) {
		this.firstString = firstString;
	}
	public String getSecondString() {
		return secondString;
	}
	public void setSecondString(String secondString) {
		this.secondString = secondString;
	}
	
	public CheckBySorting(String firstString, String secondString) {
		
		this.setFirstString(firstString);
		this.setSecondString(secondString);
	}
	
	public void checkbySorting()
	{
		char [] firstStringAsArray = this.getFirstString().toCharArray();
		char [] secondStringAsArray = this.getSecondString().toCharArray();
		Arrays.sort(firstStringAsArray);
		Arrays.sort(secondStringAsArray);
		this.setFirstString(new String(firstStringAsArray));
		this.setSecondString(new String(secondStringAsArray));
		if(this.getFirstString().equalsIgnoreCase(this.getSecondString()))
		{
			System.out.println("Both String are anagrams");
		}
		else
		{
			System.out.println("Both strings are not anagrams");
		}
	}
	

}
