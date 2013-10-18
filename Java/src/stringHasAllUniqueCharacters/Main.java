package stringHasAllUniqueCharacters;

public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		String inputString = "This may not have unique characters.";
		CheckForUniqueCharacters checkforUniqueCharacters = new CheckForUniqueCharacters(inputString);
		checkforUniqueCharacters.createHashMap();
		checkforUniqueCharacters.testForUniqueness();
		
	}

}
