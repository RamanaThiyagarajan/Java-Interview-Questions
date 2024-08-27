
public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using for Loop reversing a String
		String inputString = "Ramana Automation Engineer";
		String outputString="";
		
		for(int i= inputString.length()-1; i>=0; i--) {
			outputString = outputString + inputString.charAt(i);
		}
		
		System.out.println(outputString);
		
		//Using StringBuilder Reversing a String
		
		StringBuilder s = new StringBuilder(inputString);
		String reverseString = s.reverse().toString();
		System.out.println(reverseString);
	}

}
