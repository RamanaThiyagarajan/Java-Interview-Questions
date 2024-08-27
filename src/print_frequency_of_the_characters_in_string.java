
public class print_frequency_of_the_characters_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java";

		s.toLowerCase();
		
		int[] charCount = new int[256];
		
		for(char c: s.toCharArray()) {
			charCount[c]++;
		}
		
		for(int i=0; i<charCount.length; i++) {
			if(charCount[i]>0) {
				System.out.println((char)i + ":" + charCount[i]);
			}
		}
	}

}
