package main.java.lesson9.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsHw1 {

    public static void ex1(String s){
        /*Вывести на экран в одну строку два первых блока по 4 цифры.*/
        Pattern pattern1 = Pattern.compile("\\d{4}");
        Matcher matcher1 = pattern1.matcher(s);
        while (matcher1.find()){
            System.out.print(s.substring(matcher1.start(), matcher1.end()));
        }
        System.out.println();
    }

    public static void ex2(String s){
        /*Вывести на экран номер документа, но
        блоки из трех букв заменить на ***
        (каждая буква заменятся на *).*/
        System.out.println(s.replaceAll("\\b.{3}\\b", "***"));
    }

    public static void ex3(String s){
        /*Вывести на экран только одни буквы из номера
    документа в формате yyy/yyy/y/y в нижнем регистре.*/
        String extract = s.replaceAll("[^a-zA-Z]+", "/");
        System.out.println(extract.toLowerCase());
    }

    public static void ex4(String s){
        /*Вывести на экран буквы из номера документа в
    формате "Letters:yyy/yyy/y/y" в верхнем регистре
    (реализовать с помощью класса StringBuilder).*/
        StringBuilder str = new StringBuilder();
        String extract = s.replaceAll("[^a-zA-Z]+", "/");
        str.append(extract);
        System.out.println("Letters:" + extract.toUpperCase());
    }

    public static void ex5(String s){
        /*Проверить содержит ли номер документа
    последовательность abc и вывести сообщение содержит
    или нет(причем, abc и ABC считается одинаковой
    последовательностью).*/
        Pattern pattern2 = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(s);
        if (matcher2.find()){
            System.out.println("Строка содержит abc");
        } else {
            System.out.println("Строка не содержит abc");
        }
    }

    public static void ex6(String s){
        /*Проверить начинается ли номер документа
    с последовательности 555.*/
        boolean start = s.startsWith("555");
        if (start){
            System.out.println("Строка начинается с 555");
        } else {
            System.out.println("Строка не начинается с 555");
        }
    }

    public static void ex7(String s){
        /*Проверить заканчивается ли номер документа
    на последовательность 1a2b.*/
        boolean end = s.endsWith("1a2b");
        if (end){
            System.out.println("Строка заканчивается на 1a2b");
        } else {
            System.out.println("Строка не заканчивается на 1a2b");
        }
    }
}
