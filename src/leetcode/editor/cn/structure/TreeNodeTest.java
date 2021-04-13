package leetcode.editor.cn.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenHao
 * @version 1.0
 * @date 2021/3/31
 */
public class TreeNodeTest {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(new TreeNode(1),2,new TreeNode(new TreeNode(3),4,null));
        TreeNode right = new TreeNode(null,7,new TreeNode(9));
        TreeNode treeNode = new TreeNode(left,6,right);
        listTreeNodeIn(treeNode);
    }

    //中序遍历 常用的
    private static void listTreeNodeIn(TreeNode treeNode){
        if (treeNode != null){
            listTreeNodeIn(treeNode.left);
            System.out.println(treeNode.data);
            listTreeNodeIn(treeNode.right);
        }
    }

    //先序遍历
    private static void listTreeNode(TreeNode treeNode){
        List list = new ArrayList();
        if (treeNode != null){
            list.add(treeNode.data);
            listTreeNode(treeNode.left);
            listTreeNode(treeNode.right);
        }
        System.out.println(list);
    }



    //中序遍历
    private static void listTreeNodeAfter(TreeNode treeNode){
        List list = new ArrayList();
        if (treeNode != null){
            listTreeNodeAfter(treeNode.left);
            listTreeNodeAfter(treeNode.right);
            list.add(treeNode.data);;
        }
        System.out.println(list);
    }
}
