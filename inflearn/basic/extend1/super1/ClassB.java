package extend1.super1;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(); //기본 생성자 생략 가능, 자바가 자동으로 해줌
        System.out.println("ClassB 생성자 a= " + a);
    }
}
