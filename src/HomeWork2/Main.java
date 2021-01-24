package HomeWork2;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //Имеется список парка машин Car(String model, String type).
        // Необходимо разбить его на списки сгруппированные по type.
        /*List<Car> list = new ArrayList<Car>();
        FileReader reader = new FileReader(".//src//HomeWork2//file.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            list.add(new Car(scanner.next(), scanner.next()));
        }
        reader.close();

        HashMap<String, List<String>> map = new HashMap();
        for (Car car : list) {
            List<String> temp = map.get(car.getType());
            if (temp == null) {
                temp = new ArrayList<>(1);
            }
            temp.add(car.getModel());
            map.put(car.getType(), temp);
        }
        for (String type : map.keySet()) {
            System.out.print(type + ": ");
            for (String model : map.get(type)) {
                System.out.print(model + " ");
            }
            System.out.println();
        }*/

        //Задание 1: Подсчитайте количество различных слов в файле.
        /*HashSet<String> words = new HashSet<String>();
        FileReader reader = new FileReader(".//src//HomeWork2//file.txt");
        Scanner scanner = new Scanner(reader);
        int count=0;
        while (scanner.hasNext()) {
            words.add(scanner.next());
            count++;
        }
        System.out.println("Слов в файле: "+count+", а различных: "+words.size());
        reader.close();*/
        //Задание 2: Выведите на экран список различных слов файла, отсортированный по возрастанию их длины
        // (компаратор сначала по длине слова, потом по тексту).
        Comparator<Word> wordLengthComparator = new WordLengthComparator();
        Comparator<Word> wordComparator = new WordComparator();
        TreeSet<Word> wordsSortByLength=new TreeSet<>(wordLengthComparator);
        TreeSet<Word> sortedWords = new TreeSet<>(wordComparator);
        FileReader reader = new FileReader(".//src//HomeWork2//file.txt");
        Scanner scanner = new Scanner(reader);
        String temp;
        while (scanner.hasNext())
        {
            temp=scanner.next();
            wordsSortByLength.add(new Word(temp));
            sortedWords.add(new Word(temp));
        }
        for (Word word:wordsSortByLength)
        {
            System.out.print(word.word + " ");
        }
        System.out.println();
        for (Word word:sortedWords)
        {
            System.out.print(word.word + " ");
        }
        System.out.println();
    }
}
