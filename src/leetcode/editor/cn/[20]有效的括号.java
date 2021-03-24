package leetcode.editor.cn;//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution6{
    public static void main(String[] args) {
        String brackets = "{}[]";
        System.out.println(isValid2(brackets));
    }
    public static boolean isValid(String s) {

        if (s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char the = s.charAt(i);
            if (the == '{' || the == '[' || the == '('){ //记录左括号，有就往栈里边添加
                stack.push(the);
            }else {
                if (stack.empty()){
                    return false;
                }
                char pre = stack.peek(); //最后插入的值为什么，需要与当前的值做匹配
                if ((pre == '{' && the == '}') || (pre == '[' && the == ']') || (pre == '(' && the == ')')){
                    stack.pop(); //去除最后插入的那个值
                }else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ('(' == c || '[' == c || '{' == c){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char pop = stack.pop();
                if (c == ')' && pop != '('){
                    return false;
                }
                if (c == ']' && pop != '['){
                    return false;
                }
                if (c == '}' && pop != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
