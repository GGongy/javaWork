package day1122;

import java.util.*;

public class Collection_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("apple");
        list.add("orange");
        list.add("cherry");
        Set<String> set = new HashSet<String>();
        set.addAll(list);
        Iterator<String> it = set.iterator();
        System.out.println("集合中的元素：");
        while (it.hasNext()) {
            System.out.println(it.next() + "\t");
        }
    }
}
