import java.util.ArrayList;

public class unique_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int unique[] = { 5, 4, 3, 4, 5 };

		for (int i = 0; i < unique.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < unique.length; j++) {
				if (i != j && unique[i] == unique[j]) {
					isUnique = false;
					break;
				}

			}
			if (isUnique) {
				System.out.println(unique[i] + " is the Unique number in the Array");
			}
		}

		//Unique Number in the Array using ArrayList
		ArrayList<Integer> a = new ArrayList<Integer>();
		int uniqueList[] = { 5, 4, 2, 4, 5 };

		for (int i = 0; i < uniqueList.length; i++) {
			int k = 0;
			if (!a.contains(uniqueList[i])) {
				a.add(uniqueList[i]);
				k++;
				for (int j = i + 1; j < uniqueList.length; j++) {
					if (uniqueList[i] == uniqueList[j]) {
						k++;
					}
				}
			}
			if (k == 1) {
				System.out.println(uniqueList[i] + " is the Unique number in the ArrayList");
			}
		}
	}

}
