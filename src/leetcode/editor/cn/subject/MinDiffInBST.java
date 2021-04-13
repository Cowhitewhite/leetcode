package leetcode.editor.cn.subject;

import leetcode.editor.cn.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenHao
 * @version 1.0
 * @date 2021/4/13
 */
public class MinDiffInBST {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(new TreeNode(1),2,new TreeNode(3));
        TreeNode right = new TreeNode(null,6,null);
        TreeNode treeNode = new TreeNode(left,4,right);
        List<Integer> list = new ArrayList();
        listTreeNodeIn(treeNode,list);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            res = Math.min(res,(list.get(i) - list.get(i-1)));
        }
        System.out.println(res);
    }

    private static void listTreeNodeIn(TreeNode node, List list){
        if (node != null){
            listTreeNodeIn(node.left,list);
            list.add(node.data);
            listTreeNodeIn(node.right,list);
        }
    }
}
