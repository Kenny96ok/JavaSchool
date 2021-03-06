package HomeWork2;

import java.io.IOException;

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
        /*Comparator<Word> wordLengthComparator = new WordLengthComparator();
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
        System.out.println();*/

        //Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
        /*HashMap<String, Integer> wordsAndTheirCounts = new HashMap<>();
        FileReader reader = new FileReader(".//src//HomeWork2//file.txt");
        Scanner scanner = new Scanner(reader);
        String temp;
        while (scanner.hasNext())
        {
            temp=scanner.next();
            if(wordsAndTheirCounts.containsKey(temp))
            {
                wordsAndTheirCounts.replace(temp, wordsAndTheirCounts.get(temp)+1);
            }
            else
            {
                wordsAndTheirCounts.put(temp,1);
            }
        }
        for (Map.Entry<String,Integer> word: wordsAndTheirCounts.entrySet()) {
            System.out.println(word.getKey() + " " + word.getValue());
        }*/

        //Задание 4: Выведите на экран все строки файла в обратном порядке.
        /*FileReader reader = new FileReader(".//src//HomeWork2//file.txt");
        Scanner scanner = new Scanner(reader);
        ArrayDeque<String> strings=new ArrayDeque<>();
        String temp;
        while (scanner.hasNext())
        {
            temp=scanner.nextLine();
            strings.addFirst(new StringBuffer(temp).reverse().toString());
        }
        reader.close();
        for(String string:strings)
        {
            System.out.println(string);
        }*/

        //Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.
        MyList<String> myList = new MyList<>();
        myList.add("First");
        myList.add("Second");
        myList.add("Third");
        myList.add("Fourth");
        myList.add("Five");
        for (String elem :myList) {
            System.out.print(elem +" ");
        }
    }
}
