
public class minimum_number_single_dimension_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[] = {6,9,5,4,1,8};
		int min = m[0];
		for(int i=0; i<m.length; i++) {
			if(m[i]<min) {
				min=m[i];
			}
		}
		
		System.out.println(min);
		
	}

}
