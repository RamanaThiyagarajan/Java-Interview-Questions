
public class second_largest_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sl[]= {2,4,8,4,10};
		int temp;
		for(int i=0; i<sl.length; i++) {
		  for(int j=i+1; j<sl.length; j++) {
			  if(sl[i]>sl[j]) {
				  
				  temp= sl[i];
				  sl[i]= sl[j];
				  sl[j] = temp;
			  }
		  }
		}
		for(int i=sl.length-2; i>=0; i--) {
			if(sl[i]!=sl[sl.length-1]) {
				System.out.println(sl[i] + " is the second largest number");
				break;
			}
		}

	}

}
