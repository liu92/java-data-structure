package com.data.structure.chapter2;

import java.sql.SQLOutput;
import java.util.*;

/**
 * 两个集合 操作
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
        int[] lb ={2,6,3};
//        Integer[] union = union(la, lb);
//        for (int i = 0; i <union.length ; i++) {
//            System.out.println(union[i]);
//        }



        //求交集1
//        List<Integer> intersection = intersection(la, lb);
//        intersection.forEach(System.out::println);


//        //求交集2
//        int[] intersection2 = intersection2(la, lb);
//        for (int i = 0; i < intersection2.length; i++) {
//            System.out.println(intersection2[i]);
//        }

        //求交集3
        int[] ints3 = intersection3(la, lb);
        for (int i = 0; i < ints3.length; i++) {
            System.out.println(ints3[i]);
        }
    }

    /**
     * 第一、合并两个集合
     * @return
     */
    private static Integer[] union(int[] la, int []lb){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < la.length; i++) {
            set.add(la[i]);
        }

        for (int j = 0; j < lb.length; j++) {
            set.add(lb[j]);
        }

        Integer [] p = {};
        return  set.toArray(p);
    }


    /**
     * 第一、合并两个集合2 这个方法有问题
     * @return
     */
    private static int[] union2(int[] la, int []lb){
        int mark = 0;
//        for (int i = 0; i <lb.length ; i++) {
//            la = getElem(la, lb[i]);
//        }

        for (int i = 0, j=0; i <lb.length && j<la.length; ) {
            if(lb[i] == la[j]){
                 if(mark!=lb[i]){
                   mark = lb[i];
                 }
                i++;
                j++;
            }else if(lb[i] != la[j]){
                 if(lb[i] != mark){
                     la = arrayLengthen(la);
                     // 这行代码有问题，这个不能去比对是否已经存在的元素
                     la[la.length - 1] = lb[i];
                     i++;
                 }
            }

        }
       return la;
    }


    /**
     * 第二、两个集合求交集
     * @return
     */
    private static  List<Integer> intersection(int[] a, int[] b){
       //先排序,然后求交集
       Arrays.sort(a);
       Arrays.sort(b);
       //将相同元素放到新的集合中去
       List<Integer> result = new ArrayList<>();
       // 标记位置
       int mark = 0;
        for (int i = 0, j=0; i <a.length && j<b.length;) {
            // 判断是否相等
             if(a[i] == b[j]){
                 //因为已经排过序了,所以只需验证前一个与当前是否相同即可
                 if(result.size() == 0 || a[i]!=mark){
                     result.add(a[i]);
                     mark= a[i];
                 }
                 i++;
                 j++;
             }else if(a[i]<b[j]){
                 //如果小于 那么就在集合a中往下找一个元素进行比较
                 i++;
             }else {
                 //如果大于 那么就在集合b中往下找一个元素进行比较
                 j++;
             }
        }

        return  result;

    }



    /**
     * 第二、两个集合求交集2 ,双集合 空间换时间
     * @return
     */
    private static  int[] intersection2(int[] a, int[] b){
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        //先将a的数据放到sets里面
        for (int i = 0; i <a.length ; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i <b.length ; i++) {
            if(set.contains(b[i])){
                result.add(b[i]);
            }
        }

        int [] arr =new int[result.size()];
        Object[] objects = result.toArray();
        for (int i = 0; i < objects.length; i++) {
                    arr[i] = (Integer) objects[i];
        }
        return  arr;
    }



    /**
     * 第二、两个集合求交集3, 先排序在查找
     * @return
     */
    private static  int[] intersection3(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        Arrays.sort(a);
        //先将a的数据放到sets里面
        for (int i = 0; i <=b.length-1; i++) {
            int top =0 ;
            int bottom  = a.length-1;
            while (top <= bottom ){
                //第一次是取的 bottom的中间
                int mid = top + (bottom - top)/2;
                if(a[mid] == b[i]){
                    set.add(a[mid]);
                    break;
                }
                if(a[mid] < b[i]){
                    top = mid+1;
                }else {
                    bottom = mid -1;
                }
            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            result[i] = num;
            i++;
        }
        return  result;
    }



    /**
     * 查找数组lb中的元素是否在la中
     * @param a
     * @param b
     * @return
     */
    private static int[] getElem(int [] a, int b){
        //记录位置
        int mark = 0;
        for (int i = 0; i <a.length ; i++) {
            //如果lb数组中元素在la数组中没有，那么就将元素添加到la中去。
            //要判断La中是否已经加入了元素b,如加入了就不再加入到La中去
//            if(a[a.length-1] != b ) {
//                if (a[i] != b && a[a.length-1]!=mark) {
//                    //这里有问题
//                    a = arrayLengthen(a);
//                    a[a.length - 1] = b;
//                    mark = a[a.length-1];
//                }
//            }
        }
        return a;
    }




    private static int[] arrayLengthen(int[] str){
        //获取数组得长度:
        int len = str.length;
        //新建一个数组，长度为原有数组长度上面再增加1个
        int[] tempArray = new int[len+1];
        //将原来数组中的所有元素，复制到新建的数组中，使用循环完成。（很重要）
        for(int i = 0;i < str.length;i++){
            tempArray[i] = str[i];
        }
        //将数组返回
        return tempArray;
    }
}
