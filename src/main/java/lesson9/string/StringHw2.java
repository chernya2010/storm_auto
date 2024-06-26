package main.java.lesson9.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StringHw2 {
    /*Дана строка произвольной длины с произвольными словами.*/
    static String s = "Проснувшись однажды утром после беспокойного сна, Грегор Замза обнаружил, что он у себя в постели превратился в страшное насекомое.";
    /*Найти самое короткое слово в строке и вывести его на экран.
    Если таких слов несколько, то вывести последнее из них.*/
    public static void shrtestWord(String s){
        String[] splitedString = s.split(" ");
        String shortest = Stream.of(splitedString).min(Comparator.comparing(String::length)).get();
        System.out.println(shortest);
    }

    /*Найти самое длинное слово в строке и вывести его на экран.
    Если таких слов несколько, то вывести последнее из них.*/
    public static void longestWord(String s){
        String[] splitedString = s.split(" ");
        String longest = Stream.of(splitedString).max(Comparator.comparing(String::length)).get();
        System.out.println(longest);
    }
}
