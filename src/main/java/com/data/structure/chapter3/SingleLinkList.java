package com.data.structure.chapter3;

import java.util.NoSuchElementException;

/**
 * 自定义一个单链表类, 这个链表包含结点的相关信息
 *
 * @ClassName: SingleLinkList
 * @Description: 自定义一个链表类
 * @Author: lin
 * @Date: 2020/5/29 16:37
 * History:
 * @<version> 1.0
 */
public class SingleLinkList<T> {
    /**
     * 头指针
     */
    private ListNode head;

    /**
     * 尾结点
     */
    private ListNode tail;

    /**
     * 链表长度
     */
    private  int size;

    public SingleLinkList(){
        //初始化,头结点
        head = new ListNode();
        tail = null;
    }

    /**
     * 链表的长度
     * @return
     */
    public int getLength(){
        return  size;
    }

    /**
     * 是否含有元素
     * @return
     */
    public  boolean isEmpty(){
        return  size == 0;
    }

    /**
     * 清空链表
     */
    public void  clear(){
        head = null;
        tail = null;
        size = 0;
    }






    /**
     *  添加到链表的最前面(头插法)
     * 向链表中添加结点,也就是将这个数据添加到一个新的结点上去
     * @param value
     */
    public void addFirst(T value){
        //初始化要加入的结点,并将数据加入到该结点
        ListNode newNode = new ListNode(value);
        //当前结点是头结点
        ListNode currentFirst = head;
        //
        newNode.setNext(currentFirst);
        head = newNode;
        size ++;
    }

    /**
     * 尾插法
     * @param element
     */
    public void  addLast(T element){
        ListNode newNode = new ListNode(element);
        ListNode tail = head;
        //从头开始找,当某个结点的下个结点为null时,那么就是尾结点
        //也可能 头结点和尾结点 都是null.
        while (tail.getNext() != null){
            tail =  tail.getNext();
        }
       tail.setNext(newNode);
       size ++ ;
    }

    /**
     * 删除第一个元素
     * @return
     */
    public T removeFirst(){
        if(this.isEmpty()){
            throw  new NoSuchElementException();
        }
        //如果链表没有数据,那么就抛出异常
        ListNode<T> first = head.getNext();
        head.setNext(first.getNext());
        return  first.getData();
    }

    /**
     * 查看链表是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(T element){
        if(size == 0){
            return  false;
        }

        ListNode current = head;
        return  false;
    }



    /**
     * 遍历链表
     * @param head
     */
    public  void traverse(ListNode head){

    }





}
