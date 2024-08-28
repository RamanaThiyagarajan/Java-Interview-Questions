
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program to find the given string is palindrome or not.
		
		String original = "madam";
		String reversed = new StringBuilder(original).reverse().toString();
		
		if(original.equals(reversed)) {
			System.out.println(original + " is a palindrome");
		}else {
			System.out.println(original + " is not a palindrome");
		}
		
		//program to find the given Integer is palindrome or not.
		
		int number = 121; // Example integer
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

	}

}
