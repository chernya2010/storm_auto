package main.java.lesson8.robot;

public class RobotSony implements IRobot{
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public RobotSony(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }

    @Override
    public String toString() {
        return "RobotSony{" + "Цена робота: " + getPrice() + "}";
    }
}
