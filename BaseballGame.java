import java.util.Stack;

class BaseballGame {

	public int calPoints(String [] operations) {
		Stack<Integer> stack = new Stack<Integer>();
		for (String str : operations) {
			switch (str) {
				case "+":
					Integer firstPop = stack.pop();
					Integer result = firstPop + stack.peek();
					stack.push(firstPop);
					stack.push(result);
					//System.out.println("+");
					break;
				case "D":
					stack.push(stack.peek() * 2);
					//System.out.println("D");
					break;
				case "C":
					stack.pop();
					//System.out.println("C");
					break;
				default:
					//System.out.println("number " + str);
					stack.push(Integer.valueOf(str));
			}
		}

		int result = 0;
		while (!stack.empty()) {
			result += stack.pop();
		}

		return result;
	}
}
