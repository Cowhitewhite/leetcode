package leetcode.editor.cn;

import java.util.LinkedList;

/**
 * @author ChenHao
 * @version 1.0
 * @date 2021/3/17
 */
public class NodeAdd {

    public static void main(String[] args) {
        //头结点
        ListNode root = new ListNode(0);
        // 子节点1
        ListNode node1 = new ListNode(1);
        // 子节点2
        ListNode node2 = new ListNode(2);
        // 子节点3
        ListNode node3 = new ListNode(3);
        root.next = node1;
        node1.next = node2;
        node2.next = node3;
//        forNode2(root);
        System.out.println(getNumber(root,2).val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);

        return l1;
    }

    // 循环链表1
    private static void forNode(ListNode node){
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    // 循环链表2
    private static void forNode2(ListNode node){
        if (node == null){
            return;
        }
        System.out.println(node.val);
        forNode(node.next);
    }

    // 查找链表的元素
    private static ListNode getNumber(ListNode node,int index){
        int count = 0; //行走的步数
        while (node != null && count <= index - 1){
            node = node.next;
            count ++;
        }
        return node;
    }
}
