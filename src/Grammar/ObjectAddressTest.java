package Grammar;

class Tv {
    String color;
    boolean power;
    int channel;

    void power()   { power = !power; }
    void channelUp()   {  ++channel; }
    void channelDown() {  --channel; }
}

/*
    객체의 주소가 변경됌을 보여주는 예시
 */
public class ObjectAddressTest {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1 channel " + t1.channel);
        System.out.println("t2 channel " + t2.channel);

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1 channel 7로 변경");

        System.out.println("t1 channel " + t1.channel);
        System.out.println("t2 channel " + t2.channel);
    }
}
