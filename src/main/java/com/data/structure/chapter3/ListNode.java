package com.data.structure.chapter3;

/**
 * 首先定义结点
 * @ClassName: ListNode
 * @Description: 2.5线性表的链式表示和实现2----单链表
 * @Author: lin
 * @Date: 2020/5/29 14:54
 * History:
 * @<version> 1.0
 */
public class ListNode<T> {

    /**
     * 元素类型
     */
   private  T data;
    /**
     * 指向下一个结点
     */
    private ListNode next;


     ListNode() {
    }

    public  ListNode(T data){
        this.data = data;
    }

    ListNode(T data,ListNode next){
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
