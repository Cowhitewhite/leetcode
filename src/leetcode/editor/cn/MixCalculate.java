package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ChenHao
 * @version 1.0
 * @date 2021/3/24
 */
public class MixCalculate {


    private static final Map<Character,Integer> map = new HashMap<>();

    //设置优先级
    private static void init(){
        map.put('*',2);
        map.put('/',2);
        map.put('+',1);
        map.put('-',1);
        map.put('(',0);
    }
    /**
     * 中缀表达式如： ((15/(7-(1+1)))*3)-(2+(1+1))
     * 改写成后缀表达式：15711+-/3*211++- 可计算结果
     * 规则：
     * 1）如果遇到操作数，我们就直接将其输出。
     * 2）如果遇到操作符，则我们将其放入到栈中，遇到左括号时我们也将其放入栈中。
     * 3）如果遇到一个右括号，则将栈元素弹出，将弹出的操作符输出直到遇到左括号为止。注意，左括号只弹出并不输出。
     * 4）如果遇到任何其他的操作符，如（“+”， “*”，“（”）等，从栈中弹出元素直到遇到发现更低优先级的元素(或者栈为空)为止。
     * 弹出完这些元素后，才将遇到的操作符压入到栈中。有一点需要注意，只有在遇到" ) "的情况下我们才弹出" ( "，其他情况我们都不会弹出" ( "。
     * 5）如果我们读到了输入的末尾，则将栈中所有元素依次弹出。
     */

    public static void main(String[] args) {
        String str = "((15/(7-(1+1)))*3)-(2+(1+1))";
        init();
        String result = castSuffix(str);
        System.out.println(result);
        Stack<Character> stack = new Stack<>();
    }

    private static String castSuffix(String str){
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)){
                builder.append(c);
            }else {
                if (stack.isEmpty()){
                    stack.push(c);
                }else if (c == '('){
                    stack.push(c);
                }else if (c == ')'){
                    while (stack.peek() != '('){
                        builder.append(stack.pop());
                    }
                    // 弹出左括号
                    stack.pop();
                }else {
                    while (map.get(c) <= map.get(stack.peek())){
                        builder.append(stack.pop());
                        if (stack.isEmpty()){
                            break;
                        }
                    }
                    stack.push(c);
                }
            }
        }
        while (!stack.isEmpty()){
            builder.append(stack.pop());
        }
        return builder.toString();
    }
}
