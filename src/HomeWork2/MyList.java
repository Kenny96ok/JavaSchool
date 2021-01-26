package HomeWork2;

import java.util.Iterator;

public class MyList<T> implements Iterable<T>
{
    private T[] array;
    private int count;

    public MyList()
    {
        this.count = 0;
    }

    public void add(T item)
    {
        if(count==0) {
            array= (T[]) new Object[]{item};
        }
        else
        {
            T[] temp=(T[]) new Object[count+1];
            for(int i=0;i<count;i++)
            {
                temp[i]=array[i];
            }
            temp[count]=item;
            array=temp;
        }
        count++;
    }
    @Override
    public Iterator<T> iterator()
    {
        Iterator<T> iterator = new Iterator<T>()
        {
            int currentIndex = count-1;

            @Override
            public boolean hasNext()
            {
                if(currentIndex==-1)
                    return false;
                else
                    return true;
            }

            @Override
            public T next()
            {
                return array[currentIndex--];
            }
        };
        return iterator;
    }
}
