public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,1,2};
		System.out.println(Solution.removeDuplicates(A));
		
		int[] A2 = {1,1,1,2,2,2,3};
		System.out.println(Solution.removeDuplicates(A2));
	}

	public static class Solution {
		public static int removeDuplicates(int[] A) {
			int lastValue = 0;
			int length = 0;

			if (A.length == 0) {
				return 0;
			}
			for (int i = 0; i < A.length; i++) {
				if (i == 0) {
					lastValue = A[0];
					length++;
				} else {
					if (A[i] != lastValue) {
						A[length] = A[i];
						length++;
						lastValue = A[i];
					}
				}
			}
			
			return length;
		}
	}
}
