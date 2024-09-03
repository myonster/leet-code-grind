import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			switch (c) {

				case ')':
				case '}':
				case ']':{
					if (stack.empty()) {return false;}

					switch (c) {
						case ')':
							if (stack.pop() != '(') {return false;}
							break;
						case '}':
							if (stack.pop() != '{') {return false;}
							break;
						case ']':
							if (stack.pop() != '[') {return false;}
							break;
					}
					break;
					}
					
				case '(':
				case '{':
				case '[':{
					stack.push(c);
					break;
					}
			}
		} 

		return stack.empty();
	}
}
