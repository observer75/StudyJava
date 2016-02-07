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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String MyString = "_ Th_ dfkjgn flk___ dfvdf is is_an example    string  hjhgj ___ kgjhdkfgjdk "; //Example String
		int StringLenght = MyString.length(); //Getting length of the string
		System.out.println("String lenght: " + StringLenght);
		int numberOfChars = 0;
		
		for (int y = 0; y < StringLenght; y++) {
			
			if (MyString.charAt(y) != ' ' && (MyString.charAt(y) != '_')) {
				//System.out.println("Without Space or underscore: " + y);
				numberOfChars++;
				//System.out.println("Number of chars: "+ numberOfChars);
			} else if (numberOfChars != 0){
				System.out.println("Number of chars: "+ numberOfChars);
				numberOfChars = 0;
			}			
		}
	}
}
