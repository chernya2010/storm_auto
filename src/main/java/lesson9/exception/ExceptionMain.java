package main.java.lesson9.exception;

import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) throws Exception {
        MyException myException = new MyException();
        myException.println("Ошибка из метода println");
        myException.nullPointer();
        myException.f();
        myException.wrapException(new MyException("Ошибка из метода wrapException"));
        myException.unwrapException(new MyException());
        myException.generateArrayOutOfBoundsException(1);

    }
}
