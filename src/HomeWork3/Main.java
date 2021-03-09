package HomeWork3;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CountMap map = new MyCountMap(0);

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        System.out.println("Размер map: "+map.size());

        CountMap map2 = new MyCountMap();
        map2.addAll(map);
        System.out.println("Размер map2: "+map.size());
        Map<Integer,Integer> map3 = new HashMap<>();
        map.toMap(map3);
        System.out.println("Размер map3: "+map3.size());

        System.out.println("Count: " + map3.get(10) + " ключа 10.");
        /*
        int count = map.getCount(6); // 1
        int count = map.getCount(10); // 2
        int count = map.getCount(10); // 3*/
    }
}