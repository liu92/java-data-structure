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
public class ListNode {

    /**
     * 元素类型
     */
   public int data;
    /**
     * 指向下一个结点
     */
    public ListNode next;


   ListNode() {
   }

   public  ListNode(Integer data){
        this.data = data;
    }

   ListNode(Integer data,ListNode next){
        this.data = data;
        this.next = next;
   }


}
