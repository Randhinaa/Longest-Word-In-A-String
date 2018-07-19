import java.util.ArrayList;

public class LongestWordInAText {

	public static void main(String[] args) {
		String s = "Randhinaa Susai Adaikalam Xavier Prince";
		LongestWordInAText word = new LongestWordInAText();
		ArrayList<String> out = word.longWord(s);
		if (out != null) {
			for(int i =0; i< out.size()-1; i++){
					System.out.println("Longest word :" + out.get(i));
			}
			System.out.println("Length of the longest word: " + out.get(out.size()-1));
		}
		else
			System.out.println("Input string is empty");
	}

	public ArrayList<String> longWord(String s) {
		if (s == null || s.trim().length() == 0 ) {
			return null;
		}
		Integer max_length = 0, count = 0;
		String[] word = s.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");
		ArrayList<String> max_word = new ArrayList<String>();
		for (int i = 0; i < word.length; i++) {
			count = word[i].length();
			if (count >= max_length) {
				max_length = count;
			}
		}
		for (int i = 0; i < word.length; i++) {
			if(word[i].length() ==  max_length)
				max_word.add(word[i]);
		}

		max_word.add(max_length.toString());
		return max_word;
	}
}
