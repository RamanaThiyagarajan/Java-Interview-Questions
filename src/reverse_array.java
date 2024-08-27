
public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char n[] = {'a','b','c','d'};
		 int left = 0;
		 int right = n.length-1;
		 
		 while(left<right) {
			 
			 char s = n[left];
			 n[left]=n[right];
			 n[right]= s;
			 
			 left = left+1;
			 right = right-1;
		 }
		 
		 for(int i=0; i<n.length; i++) {
			 System.out.println(n[i]);
		 }
	}

}
