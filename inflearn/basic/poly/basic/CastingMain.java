package poly.basic;

public class CastingMain {

    public static void main(String[] args) {
        Parent poly = new Child();

        //일시적 다운캐스팅
        ((Child) poly).childMethod();
    }
}
