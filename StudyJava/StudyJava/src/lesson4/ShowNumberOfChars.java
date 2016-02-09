/**
 * 
 */
package lesson4;

/**
 * @author Саша
 *
 */
public class ShowNumberOfChars {

	/**
	 * @param args
	 */
	public static int getNumberOfChars(String myString) {
		int numberOfChars = 0;
		int wordCount =0;
		int StringLenght = myString.length(); // Getting length of the string

		for (int y = 0; y < StringLenght; y++) {

			if (myString.charAt(y) != ' ' && (myString.charAt(y) != '_')) {
				// System.out.println("Without Space or underscore: " + y);
				numberOfChars++;
				// System.out.println("Number of chars: "+ numberOfChars);
			} else if (numberOfChars != 0) {
				wordCount++;
				System.out.println("Number of chars in " + wordCount + " word: " + numberOfChars);
				numberOfChars = 0;
			}
		}
		
		if (numberOfChars != 0) {
			wordCount++;
			System.out.println("Number of chars in " + wordCount + " word: " + numberOfChars);
		}
		return numberOfChars;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String MyString = "_ wg t _7 & hfhfhfg     hhh ___ rtrtrtr  ___--___"; // Example
		getNumberOfChars(MyString);
		// System.out.println("String length: " + StringLenght);
	}
}
