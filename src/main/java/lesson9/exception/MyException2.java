package main.java.lesson9.exception;

public class MyException2 extends Exception {
    public void myException2(){
        try {
            String str = null;
            str.length();
        } catch (NullPointerException ex){
            System.out.println("Исключение из метода myException2");
        }
    }
}
