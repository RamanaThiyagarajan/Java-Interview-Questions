
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program is the given number is even or odd number
		int a =11;
		if(a%2==0) {
			System.out.println(a + " is the Even Number");
		}else {
			System.out.println(a + " is the Odd Number");
		}
		
		//Program to print the even numbers from 1 to 100
		
	    for(int i=1; i<=100; i++) {
	    	if(i%2==0) {
	    		System.out.print(i + " ");
	    	}
	    }
	    
	  //Program to print the odd numbers from 1 to 100
	    
	    for(int i=1; i<=100; i++) {
	    	if(i%2==1) {
	    		System.out.print(i + " ");
	    	}
	    }
	    
	  //Program to print the count even numbers from 1 to 100
	    int count = 0;
	    for(int i=1; i<=100; i++) {
	    	if(i%2==0) {
	    		count = count +1;
	    	}
	    }
	    
	    System.out.println(count);
	    
	    //Program to print the sum of even numbers from 1 to 100
	    int sum = 0;
	    for(int i=1; i<=500; i++) {
	    	if(i%2==0) {
	    		sum = sum + i;
	    	}
	    }
	    System.out.println(sum);
	    
	}

}
