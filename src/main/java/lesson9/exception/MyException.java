package main.java.lesson9.exception;

public class MyException extends Exception{

    MyException(String message){
        super(message);
    }

    public MyException() {
    }
    /*Создайте метод println(String s), который будет выбрасывать
    MyException с параметром s, а потом ловить это исключение и
    выводить параметр s. Выводите перенос строки в секции finally.*/
    public void println(String s) throws MyException {
        try {
            throw new MyException(s);
        } catch (MyException ex){
            System.out.println(s);
        } finally {
            System.out.println();
        }
    }
    /*Создайте метод nullPointer(), который будет создавать объект (любой),
    инициализировать его null, пытаться вызвать метод у этого объекта,
    ловить NullPointerException и выводить в catch блоке сообщение
    "NullPointerException thrown successfully".*/
    public void nullPointer(){
        try {
            String str = null;
            str.length();
        } catch (NullPointerException ex){
            System.out.println("NullPointerException thrown successfully");
        }
    }
    /*Создайте методы f() и g(), так чтобы f() вызывал метод g().
    В методе g() выбросите MyException, словите его в методе f(),
    и там же в catch блоке поделите 1 на 0. Проверьте,
    что при вызове этого метода вылетает ArithmeticException.*/
    public void g() throws MyException {
        throw new RuntimeException(new MyException("Ошибка из метода g()"));
    }
    public void f(){
        int a = 0;
        try {
            g();
        } catch (MyException ex) {
            int b = 10 / a;
        }
    }

    /*Создайте метод wrapException(Exception e),
    который будет возвращать RuntimeException,
    созданный с аргументом е в конструкторе.*/
    public void wrapException(Exception e){
        throw new RuntimeException(e);
    }

    /*Создайте метод unwrapException(Exception e),
     который будет выбрасывать сause исключения e.*/
    public void unwrapException(Exception e){
        try {
            ArithmeticException e2 = new ArithmeticException("ArithmeticException из метода unwrapException");
            e2.initCause(new NullPointerException("NullPointerException из метода unwrapException"));
            throw e2;
        } catch(ArithmeticException e2) {
            System.out.println(e2.getCause());
        }
    }

    /*Создайте метод generateArrayOutOfBoundsException(int i),
    который будет пытаться обратиться к i-му элементу массива
    и выбрасывать исключение, потому что такого элемента в
    массиве нет.*/
    public void generateArrayOutOfBoundsException(int i){
        int[] m = {i};
        try {
            m[10] = 999;
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Ошибка! Индекс за пределами массива\n" + exception);
        }
    }
    /*Создайте метод threesome(), который будет ловить MyException,
    MyException2 и MyException3 в одном catch блоке.*/
//    public void threesome() {
//        try {
//            String str = null;
//            str.length();
//        } catch (MyException | MyException2 | MyException3 ex){
//            System.out.println("Исключение из метода threesome()");
//            throw ex;
//        }
    }

