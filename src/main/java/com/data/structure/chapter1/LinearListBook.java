package com.data.structure.chapter1;

/**
 * @ClassName: LinearListBook
 * @Description: 定义线性表
 * @Author: lin
 * @Date: 2020/5/9 14:15
 * History:
 * @<version> 1.0
 */
public class LinearListBook {
    private int size = 100;
    /**
     * 定义线性表 Book数组，
     * 这个数组是用来存储图书信息的
     * 每一步书都要存储书好，书名，书的价格
     */
    private Book[] element = new Book[size] ;

    /**
     * 线性表的长度
     */
    private int length;
}
