import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = {"2", "1", "+", "3", "*"};
		System.out.print( Solution.evalRPN(tokens));
	}
	
	public static class Solution {
	    public static int evalRPN(String[] tokens) {
	    	Stack<Integer> numbers = new Stack<Integer>();
	    	for (int i = 0; i < tokens.length; i++) {
				String tmpS = tokens[i];
				
				try {
					Integer integer = Integer.valueOf(tmpS);
					numbers.push(integer);
				} catch(NumberFormatException ne) {
					if (numbers.size() >= 2) {
						Integer i2 = numbers.pop();
						Integer i1 = numbers.pop();
						Integer result = operate(i1, i2, tmpS);
						
						numbers.push(result);
					}
				}
			}
	    	if (numbers.size()==1) {
				return numbers.pop();
			}
			return 0;
	    }
	    
	    public static Integer operate(Integer i1, Integer i2, String operator) {
	    	switch (operator) {
			case "+":
				return i1 + i2;
			
				case "-":
					return i1 - i2;
					
					case "*":
						return i1 * i2;
						
						case "/":
							return i1 / i2;

			default:
				return 0;
			}
	    }
	}
}
