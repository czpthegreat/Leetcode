public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Solution.reverseWords(" 1"));
	}

	public static class Solution {
		public static String reverseWords(String s) {
			String[] words = s.split(" ");
			
			String reverseString = "";
			for (int i = words.length - 1; i >= 0; i--) {
				if (words[i].length() == 0) {
					continue;
				}
				if (i != words.length - 1) {
					reverseString += " " + words[i];
				} else {
					reverseString += words[i];
				}
			}
			return reverseString;
		}
	}
}
