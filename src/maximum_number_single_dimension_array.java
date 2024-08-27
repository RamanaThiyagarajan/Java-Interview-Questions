
public class maximum_number_single_dimension_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[] = {6,9,5,4,1,8};
		int max = m[0];
		for(int i=0; i<m.length; i++) {
			if(m[i]>max) {
				max=m[i];
			}
		}
		
		System.out.println(max);

	}

}
