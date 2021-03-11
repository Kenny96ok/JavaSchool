package HomeWork3;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //1
        /*CountMap map = new MyCountMap(0);

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

        System.out.println("Count: " + map3.get(10) + " ключа 10.");*/
        /*
        int count = map.getCount(6); // 1
        int count = map.getCount(10); // 2
        int count = map.getCount(10); // 3*/

        //2
        List<Integer> list = new ArrayList<>();
        for (int i=0;i < 10; i++)
            list.add(i+1);
        list.forEach(elem -> System.out.print(elem.toString()+" "));
        System.out.println();

        List<Integer> list2 = CollectionUtils.limit(list,5);
        list2.forEach(elem -> System.out.print(elem.toString()+" "));
        System.out.println();

        System.out.println(CollectionUtils.containsAll(list,list2));
        System.out.println(CollectionUtils.containsAny(list,list2));

        CollectionUtils.removeAll(list,list2);
        list.forEach(elem -> System.out.print(elem.toString()+" "));
        list=CollectionUtils.range(list,7,9,(Integer i,Integer i2)->{
            return i.compareTo(i2);
        });
        System.out.println();
        list.forEach(elem -> System.out.print(elem.toString()+" "));
        System.out.println();
    }
}