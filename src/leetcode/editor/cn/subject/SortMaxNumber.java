package leetcode.editor.cn.subject;

import java.util.Arrays;

/**
 * @author ChenHao
 * @version 1.0
 * @date 2021/4/12
 */
public class SortMaxNumber {

    public static void main(String[] args) {
        String[] nums = {"2","3","56","23","9","0"};
        Arrays.sort(nums, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        System.out.println(Arrays.toString(nums));
    }

}
