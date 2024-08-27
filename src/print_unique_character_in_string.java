
public class print_unique_character_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaaabbbcc";

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (result.indexOf(String.valueOf(c)) == -1) {
				result.append(c);
			}
		}
		System.out.println(result.toString());
	}

}
