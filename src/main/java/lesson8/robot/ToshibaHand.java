package main.java.lesson8.robot;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Машет рука Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
