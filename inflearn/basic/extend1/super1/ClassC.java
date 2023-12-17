package extend1.super1;

public class ClassC extends ClassB{

    public ClassC(int a) {
        super(10); //기본 생성자의 경우에만 생략 가능
        System.out.println("ClassC 생성자 a= " + a);
    }
}
