package Grammar;

public class ObjectClassTest {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }

        if (v1 == v2){
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }

        v2 = v1;

        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }

        /**
         * 가장 중요한 포인트는 ==는 주소값이 같은지 아닌지 비교하는 것이고,
         * equals()연산도 내부적으로 주소값을 비교하지만 String클래스에서는 equals()를 재정의해 내용을 비교하게 되어있다.
         */
        String text1 = "sample";
        String text2 = text1;
        String text3 = new String("sample");
        String text4 = new String("sample");

        System.out.println(text1 == text2);            //true
        System.out.println(text1.equals(text2));    //true
        System.out.println(text3 == text4);            //false
        System.out.println(text3.equals(text4));    //true
    } // main
}
class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}