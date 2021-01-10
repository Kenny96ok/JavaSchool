package HomeWork1;

import java.io.Console;

public class Main {

    public static void printMas(int mas[])
    {
        for (int elem:mas) {
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public static void bubbleSorter(int mas[])
    {
        for (int out = mas.length- 1; out >= 1; out--)
        {
            for (int in = 0; in < out; in++)
            {
                if(mas[in] > mas[in + 1]) {
                    int temp = mas[in];
                    mas[in] = mas[in + 1];
                    mas[in + 1] = temp;
                }
            }
        }
    }
    public static int binSearch(int mas[], int k)
    {
        int i = -1;
        if (mas != null) {
            int low = 0, high = mas.length, mid;
            while (low < high) {
                mid = (low + high) >>> 1;
                if (k == mas[mid]) {
                    i = mid;
                    break;
                } else {
                    if (k < mas[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] mas={2,5,4,3,1};
        printMas(mas);
        bubbleSorter(mas);
        printMas(mas);
        System.out.println("Искомый элемент под индексом " + binSearch(mas,5));


    }
}
