public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld HelloW = new HelloWorld();
		HelloW.helloPrint();
		MagicStrings MyString = new MagicStrings(); 
		
		String s = "hello world wert dlfd";
		int wordIndex = MyString.getWordLength(s,3);
				//getPlaceOfWord(s,3);
		int wordLength = MyString.getPlaceOfWord(s,wordIndex);
		System.out.println("Index of word: " + wordIndex);
		System.out.println("Length of word: " + wordLength);
	}
}
