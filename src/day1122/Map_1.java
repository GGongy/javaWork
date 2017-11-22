package day1122;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "apple");
        map.put("2", "orange");
        map.put("3", "cherry");
        for (int i = 1; i < 4; i++){
            System.out.println("第 " + i + " 个元素为：" + map.get("" + i + ""));
        }
    }
}
