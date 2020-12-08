package com.data.structure.chapter3;

/**
 * 自定义接口
 * @ClassName: CustomerListNodeService
 * @Description:
 * @Author: lin
 * @Date: 2020/5/29 15:19
 * @History:
 * @<version> 1.0
 */
public interface CustomerListNodeService {

    /**
     * 判断结点是否为空
     * @param listNode
     * @return
     */
    int listEmpty(ListNode listNode);





    /**
     * 向链表中添加结点
     * @param value
     */
     void addData(int value);


    /**
     * 遍历链表
     * @param head
     */
     void traverse(ListNode head);


    /**
     * 插入结点
     * @param head 头指针
     * @param index 要插入的位置
     * @param value 要插入的值
     */
     void insert(ListNode head, int index, int value);


    /**
     * 获取链表的长度
     * @param head
     * @return
     */
     int linkListLength(ListNode head);


    /**
     * 将线性表L中第index个数据元素删除, 要删除i结点 首先要找到第index-1个结点
     * @param head
     * @param index
     */
    void  deleteListNode(ListNode head, int index);

    /**
     * 对链表进行排序
     * @param head
     */
    void sortLinkList(ListNode head);


    /**
     * 找到链表中倒数第i个节点
     * @param head
     * @param i
     * @return
     */
    ListNode findNode(ListNode head, int i);

}
