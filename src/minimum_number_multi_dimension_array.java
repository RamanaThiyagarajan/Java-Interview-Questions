
public class minimum_number_multi_dimension_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][] = {{7,2,4},{5,3,8}};
		int min = m[0][0];
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				if(m[i][j]<min) {
					min=m[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
