package com.data.structure.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: ListA
 * @Description:
 * @Author: lin
 * @Date: 2020/5/11 16:08
 * History:
 * @<version> 1.0
 */
public class TestLinear {
    public static void main(String[] args) {
        int[] la = {7,5,3,11};
        int[]  lb ={2,6,3};
        int[] union = union(la, lb);
        for (int i = 0; i <union.length ; i++) {
            System.out.println(union[i]);
        }
    }

    /**
     * 合并两个集合
     */
    private static int[] union(int[] la, int []lb){

        for (int i = 0; i < lb.length; i++) {
             la = getElem(la, lb[i]);
        }
        return  la;
    }



    private static int[] getElem(int [] a, int b){
        int[] c = arrayLengthen(a);
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=b){
                c[a.length-1] = b;
            }
        }
        return c;
    }

    public static int[] arrayLengthen(int[] str){
        //获取数组得长度：
        int len = str.length;
        //新建一个数组，长度为原有数组长度上面再增加5个
        int[] tempArray = new int[len];
        //将原来数组中的所有元素，复制到新建的数组中，使用循环完成。（很重要）
        for(int i = 0;i < str.length;i++){
            tempArray[i] = str[i];
        }
        //将数组返回
        return tempArray;
    }
}
