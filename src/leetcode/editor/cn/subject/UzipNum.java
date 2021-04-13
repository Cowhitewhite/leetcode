package leetcode.editor.cn.subject;
/*
HG[3|B[2|CA]]F -> HG[3|BCACA]F -> HGBCACABCACABCACAF
 */

import java.util.Collections;

/**
 * @Classname UzipNum
 * @Description TODO
 * @Date 2020/7/1 15:43
 * @Created by ChenHao
 */
public class UzipNum {
    public static void main(String[] args) {
        System.out.println(decode("HG[3|B[2|CA]]F"));
    }

    public static String decode(String words){
        while (words.contains("]")){
            int right = words.indexOf("]");
            int left = words.lastIndexOf("[",right);
            String temp = words.substring(left+1,right);
            String[] splitTemp = temp.split("\\|");
            words = words.replace("["+temp+"]",String.join("", Collections.nCopies(Integer.parseInt(splitTemp[0]),splitTemp[1])));
        }
        return words;
    }
}
