package mainPackage;

public class GenerateStringPatterns {
	
	public static void generateAllPatterns(String s, int index)
	{
		while(index < s.length() && s.charAt(index) != '?')
		{
			index++;
		}
		if(index == s.length())
		{
			System.out.println(s);
			return;
		}
		StringBuilder s1 = new StringBuilder(s);
		s1.setCharAt(index, '0');
		generateAllPatterns(s1.toString(), index);
		s1.setCharAt(index, '1');
		generateAllPatterns(s1.toString(), index);

	}
	
	public static void generateAllPatterns(String s)
	{
		generateAllPatterns(s,0);
	}

}
