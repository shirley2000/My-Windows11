package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("!!");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(4);
        llist.add(5);
        llist.add(6);
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        String str = hashMap.get(1);
        //1.7:数组+链表
        //1.8：数组+红黑树
        //数组扩容：HashMap中的元素个数超过数组大小(数组长度)*loadFactor(负载因子)时
        //红黑树化条件：链表长度超过8+数组长度>64
        //dos攻击：构造大量hash值一样的数据，导致查询时间过长
        //红黑树用来避免dos攻击
        //退化成链表：扩容后长度<=6/remove前root、root.left、root.right、root.left.left有一个为null
    }
}
