
public class print_number_without_using_forloop {

	public static void printNum(int num) {
		
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNum(1);
	}

}
