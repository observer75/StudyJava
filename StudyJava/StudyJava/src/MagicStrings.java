public class MagicStrings {
	public MagicStrings() {
		// TODO Auto-generated constructor stub
	}
// Return word length 
	public int getWordLength(String words, int spaceLocation){
		int nextSpaceIndex=0;
		for(int y = spaceLocation; y < words.length(); y++) {
			if (words.charAt(y) == ' ') {		
				nextSpaceIndex = y;
			}
			else {
				nextSpaceIndex = words.length()-1;
			}
		}
		return words.substring(spaceLocation, nextSpaceIndex).length();
	}
//Return place of the world in sentence
	public int getPlaceOfWord(String words, int targetWordNumber) {
		int numberOfWords = 0;
		if (targetWordNumber==1){
			return 0;
		}
		for (int y = 0; y < words.length(); y++) {
			if (words.charAt(y) == ' ') {
				numberOfWords++;
			}
			if (numberOfWords == targetWordNumber) {
				return y+1;
			}
		}

		return numberOfWords + 1;
	}
}
