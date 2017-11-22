package day1122;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        String a = "A", b = "B", c = "C";
        List<String> list = new LinkedList<>();
        list.add(a);
        list.add(b);
        Iterator<String> filst = list.iterator();
        System.out.println("修改前元素：");
        while (filst.hasNext()) {
            System.out.println(filst.next() + " ");
        }
        list.set(1, "z");
        list.add(2, "d");
        Iterator<String> last = list.iterator();
        System.out.println("修改后的元素：");
        while (last.hasNext()) {
            System.out.println(last.next() + " ");
        }
    }
}
