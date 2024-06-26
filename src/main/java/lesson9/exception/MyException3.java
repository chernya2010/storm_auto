package main.java.lesson9.exception;

public class MyException3 extends Exception {
    public void myException3(){
        try {
            String str = null;
            str.length();
        } catch (NullPointerException ex){
            System.out.println("Исключение из метода myException3");
        }
    }
}
