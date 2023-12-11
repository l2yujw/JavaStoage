package grammar;

public class Initialization {

    // 클래스 초기화 블럭
    static {
        System.out.println("static { }");
    }

    // 인스턴스 초기화 블럭
    {
        System.out.println("{ }");
    }

    public Initialization() {
        System.out.println("생성자");
    }

    public static void main(String args[]) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        Initialization init = new Initialization();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        Initialization init2 = new Initialization();
    }

    /**
     * 멤버변수 (클래스변수와 인스턴스변수)와 배열의 초기화는 선택적 / 지역변수의 초기화는 필수
     *
     */
}
