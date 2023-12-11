package grammar;

/**
 *  여러분들이 만약 오픈 소스코드를 만들었다고 가정하자.
 *  그 오픈소스가 엄청 유명해져서 전 세계 사람들이 다 사용하고 있는데, 인터페이스에 새로운 메소드를 만들어야 하는 상황이 발생했다.
 *  자칫 잘못하면 내가 만든 오픈소스를 사용한 사람들은 전부 오류가 발생하고 수정을 해야 하는 일이 발생할 수도 있다.
 *  이럴 때 사용하는 것이 바로 default 메소드이다.
 */


/*
    Modifier     Class   Package Subclass    World
    public       Y       Y       Y           Y
    protected    Y       Y       Y           N
    no modified  Y       Y       N           N
    private      Y       N       N           N
 */
interface MyInterface {
    default void printHello() {
        System.out.println("Hello World");
    }
}

class MyClass implements MyInterface {}

public class DefaultMethodTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.printHello(); //실행결과 Hello World 출력
    }
}
