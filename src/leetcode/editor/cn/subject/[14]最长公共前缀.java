package leetcode.editor.cn.subject;//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution5 {

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {

        String index = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(index) != 0){
                index = index.substring(0,index.length() - 1);
                if (index.isEmpty()){
                    return "";
                }
            }
        }
        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
