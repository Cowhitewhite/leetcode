package leetcode.editor.cn;

/**
 * @author ChenHao
 * @version 1.0
 * @date 2020/11/2
 * @description 找出数据中不重复的数
 */
public class FindSingleNumber {

    //相同数异或：2 ^ 2 = 0
    //单个数字异或0：2 ^ 0 = 2
    //满足交换律：交换律：a ^ b ^ c = a ^ c ^ b
    public static void main(String[] args) {
        int result = 0;
        int[] nums = {2,2,3,3,5,7,7};
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        System.out.println(result);
    }
}
