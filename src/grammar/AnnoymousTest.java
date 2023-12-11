package grammar;

interface Operate {
    int operate(int a, int b);
}

class Calculator {
    // 계산할 두 수를 저장하는 필드
    private final int a;
    private final int b;

    // 생성자
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 인터페이스 타입을 매개변수로 받는 메소드 (다형성)
    public int caculate(Operate op) {
        return op.operate(this.a, this.b); // 매개변수 객체의 메서드 실행하여 리턴
    }
}

public class AnnoymousTest {
    public static void main(String[] args) {
        // 계산할 두 수
        int num1 = 20;
        int num2 = 10;

        Calculator calculator = new Calculator(num1, num2);

        int result = calculator.caculate(new Operate() {
            public int operate(int a, int b) {
                return a + b;
            }
        });

        System.out.println(result); // 30


        int result2 = calculator.caculate(new Operate() {
            public int operate(int a, int b) {
                return a - b;
            }
        });

        System.out.println(result2); // 10
    }
}
