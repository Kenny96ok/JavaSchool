package HomeWork3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static<T> List<? super T> newArrayList() {
        return new ArrayList<T>();
    }

    public static<T> int indexOf(List<? extends T> source, T obj) {
        return source.indexOf(obj);
    }

    public static<T> List<T> limit(List<? extends T> source, int limit) {
        List<T> list = new ArrayList(limit);
        for(int i = 0;i < limit; i++)
        {
            list.add(source.get(i));
        }
        return list;
    }

    public static<T> void add(List<? super T> source, T obj) {
        source.add(obj);
    }

    public static<T> void removeAll(List<? super T> source, List <? extends T> removeElems) {
        source.removeAll(removeElems);
    }

    public static<T> boolean containsAll(List<? extends T> source, List<? extends T> containsElems) {
        return source.containsAll(containsElems);
    }

    public static<T> boolean containsAny(List<? extends T> source, List<? extends T> containsElems) {
        for(int i = 0;i < containsElems.size(); i++) {
            if(source.contains(containsElems.get(i)))
                return true;
        }
        return false;
    }

    public static<T> List<T> range(List<? extends T> source, T min, T max, Comparator<T> comparator) {
        List<T> list= new ArrayList<>();
        list.addAll(source);
        list.sort(comparator);
        for(int i=0;i<list.size();i++) {
            if(comparator.compare(list.get(i), min)<0 || comparator.compare(list.get(i), max)>0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}

