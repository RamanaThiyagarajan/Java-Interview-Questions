
public class count_numberof_capital_letters_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Ramana Automation Engineer";
		int counter =0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
