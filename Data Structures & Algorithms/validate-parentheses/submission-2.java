class Solution {
   public boolean isValid(String s) {
    char[] symbol = s.toCharArray();
    if (symbol.length % 2 != 0) return false;

    Deque<Character> stack = new ArrayDeque<>();
    for (int i = 0; i < symbol.length; i++) {
        if      (symbol[i] == '(') stack.push(')');
        else if (symbol[i] == '{') stack.push('}');
        else if (symbol[i] == '[') stack.push(']');
        else {
            if (stack.isEmpty() || symbol[i] != stack.peek()) return false;
            stack.pop();
        }
    }
    return stack.isEmpty();
}
}
