package leetcode.editor.cn.subject;

import java.util.Arrays;

/**
 * @Classname Sort
 * @Description 排序
 * @Date 2020/6/5 10:05
 * @Created by ChenHao
 */
public class Sort {
    public static void main(String[] args) {
        int[] att = {-5,-1,1,5,0,-77,34,32,100,7777};
        System.out.println(Arrays.toString(insert(att)));
    }

    /**
     * 冒泡排序
     */
    private static int[] bubble(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {//外层控制需要比较多少趟
            for (int j = 0; j < nums.length - 1 - i; j++) { //内层控制每次需要排序多少次
                if (nums[j] > nums[j+1]){//交换位置
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    /**
     * 插入排序
     */
    private static int[] insert(int[] nums){

        for (int i = 1; i < nums.length; i++) {
            int insertVal = nums[i];
            int index = i - 1;
            while (index >= 0 && insertVal < nums[index]){
                nums[index+1] = nums[index];
                index--;
            }
            nums[index+1] = insertVal;
        }
        return nums;
    }
}
