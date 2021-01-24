package HomeWork2;

import java.util.Comparator;

class Word {
    public String word;
    public Word(String word)
    {
        this.word=word;
    }
}
class WordLengthComparator implements Comparator<Word>
{
    public int compare(Word first,Word second)
    {
        if(first.word.length()>second.word.length())
            return 1;
        else if (first.word.length()<second.word.length())
            return -1;
        else {
            //Слова с одинаковой длиной по просту игнорировались
            if(first.word==second.word)
                return 0;
            else
                return first.word.compareTo(second.word);
        }
    }
}

class WordComparator implements Comparator<Word>
{
    public int compare(Word first,Word second)
    {
        return first.word.compareTo(second.word);
    }
}
