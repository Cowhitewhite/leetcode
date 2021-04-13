package leetcode.editor.cn.structure;

/**
 * @author ChenHao
 * @version 1.0
 * @date 2021/3/31
 */
public class TreeNode<T> {

    public TreeNode left;
    public T data;
    public TreeNode<T> right;

    public TreeNode(TreeNode<T> left,T data,TreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode(T data) {
        this.data = data;
    }
}
