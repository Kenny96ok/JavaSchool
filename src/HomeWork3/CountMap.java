package HomeWork3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CountMap<T>
{
    void add(T obj);

    int getCount(T obj);

    //current count
    int remove(T obj);

    int size();

    void addAll(CountMap<T> source);

    Map<T,Integer> toMap();

    void toMap(Map<T, Integer> destination);

}

