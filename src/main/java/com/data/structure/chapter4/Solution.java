package com.data.structure.chapter4;


import com.data.structure.chapter3.ListNode;

/**
 * @ClassName: Solution
 * @Description:
 * @Author: lin
 * @Date: 2020/10/10 11:10
 * History:
 * @<version> 1.0
 */
public class Solution {

    private static ListNode2 head = new ListNode2();

    public static void main(String[] args) {
        System.out.println("-------------插入数据----------");

        addData(4);
        addData(5);
        addData(7);
        addData(2);
        addData(6);
        addData(1);
        traverse(head);

        System.out.println("-------------插入排序----------");
        insertionSortList(head);
        traverse(head);

    }


    public static void addData(int value) {

        //初始化要加入的节点
        ListNode2 newNode = new ListNode2(value);

        //临时节点(head我已经初始化了)
        ListNode2 temp = head;


        // 找到尾节点
        while (temp.next != null) {
            temp = temp.next;
        }

        // 已经包括了头节点.next为null的情况了～
        temp.next = newNode;

    }

    /**
     *5、 遍历链表
     * @param head 头节点
     */
    public static void traverse(ListNode2 head){
        //从头节点开始
        ListNode2 temp = head.next;

        while (temp != null){
                System.out.println("遍历链表数据：" + temp.val);
            temp = temp.next;
        }
    }




    public static ListNode2 insertionSortList(ListNode2 head) {
        if(head == null){ return null;}
        ListNode2 dummyNode = new ListNode2(0);
        ListNode2 pre = dummyNode;
        ListNode2 cur = head;
        while(cur!=null){
            //提前将cur的下一个节点保存起来，因为后面需要将cur节点进行删除→插入
            ListNode2 tmp = cur.next;
            while(pre.next!= null&&pre.next.val<cur.val){
                pre=pre.next;
            }
            //因为cur.val的大小介于pre.val和pre.next.val之间
            //将cur插入到pre和pre.next之间，注意①和②之间的顺序
            //注意此处是不会形成死循环的：由于dummy是新开辟的链表，此处是将cur节点移到了dummyNode所在的新链表中
            cur.next = pre.next;//①
            pre.next = cur;//②
            pre = dummyNode;
            cur = tmp;
        }
        return dummyNode.next;

    }

    public static class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val,  ListNode2  next) { this.val = val; this.next = next; }
  }
}
