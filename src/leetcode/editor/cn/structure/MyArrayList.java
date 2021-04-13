package leetcode.editor.cn.structure;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author ChenHao
 * @version 1.0
 * @date 2021/3/17
 */
public class MyArrayList {

    //头结点
    Node head = null;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //增
    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    //删除第index个结点
    public boolean removeNode(int index){
        if (index <1 || index > length()){
            return false;
        }
        if (index == 1){
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null){
            if (i == index){
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    //计算长度
    public int length(){
        int length = 0;
        Node tem = head;
        while (tem != null){
            length ++;
            tem = tem.next;
        }
        return length;
    }
}
