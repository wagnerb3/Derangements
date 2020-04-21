package algo;

import java.util.ArrayList;

public class Derangement {
	
	public static void allDerangements(int[] order, ArrayList<Integer> result){
		if (result.size() == order.length) {
			System.out.println(result);
			return;
		}
		for (int num : order) {
			if (result.contains(num) || num == result.size()+1) {
				continue;
			}
			else {
				result.add(num);
				allDerangements(order, result);
				int size = result.size();
				result.remove(size-1);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,6,7,8,9,10};
		ArrayList<Integer> b = new ArrayList<>();
		allDerangements(a,b);
	}
	
}
