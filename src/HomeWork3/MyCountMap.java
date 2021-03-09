package HomeWork3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyCountMap<T> implements CountMap<T> {
    Map<T, Integer> data;

    public MyCountMap() {
        data = new HashMap<>(0);
    }

    public MyCountMap(int size) {
        data = new HashMap<>(size);
    }

    @Override
    public void add(T key) {
        if(data.containsKey(key))
        {
            data.put(key,data.get(key)+1);
        }
        else
        {
            data.put(key,1);
        }
    }

    @Override
    public int getCount(T key) {
        return data.containsKey(key)?data.get(key):-1;
    }

    @Override
    public int remove(T key) {
        if(data.containsKey(key))
        {
            int count=data.get(key);
            data.remove(key);
            return count;
        }
        else
            return 0;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        Map<T, Integer> temp=source.toMap();
        temp.forEach((T t,Integer count) ->{
            data.put(t, count);
        });
    }

    @Override
    public Map<T, Integer> toMap() {
        return new HashMap<T, Integer>(data);
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        destination.putAll(data);
    }
}
