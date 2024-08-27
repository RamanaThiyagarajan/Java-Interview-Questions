
public class longest_consecutive_number_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s[] = {1,3,4,5,6,4,2,5,6,7,8,9};
		int max=0;
		int count=0;
		for(int i=0; i<s.length-1; i++) {
			if(s[i+1]==s[i]+1) {
				count++;
			}else {
				count = 0;
				}
			max = Math.max(max, count+1);
		}
		System.out.println(max);
	}

}
