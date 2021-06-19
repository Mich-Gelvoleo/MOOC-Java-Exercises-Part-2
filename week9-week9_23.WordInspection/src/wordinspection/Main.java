package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception{
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection inspect = new WordInspection(file);
        System.out.println("Word Count: " + inspect.wordCount());
        System.out.println("Words with Z: " + inspect.wordsContainingZ());
        System.out.println("Words ending with L: " + inspect.wordsEndingInL());
        System.out.println("Palindromes: " + inspect.palindromes());
        System.out.println("Words with all Vowels: " + inspect.wordsWhichContainAllVowels());

    }
}
