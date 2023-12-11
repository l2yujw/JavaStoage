package grammar;

public class NewExtends {
    public static void main(String[] args) {
        Parent p = new Child();
        Child  c = new Child();

        System.out.println("p.x = " + p.x);
        p.method(); // 자식의 method() 동작은 자식의 자원들을 이용함 (전략패턴 생각하면 이해하기 편함)
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    @Override
    void method() {
        System.out.println("x=" + x);
        System.out.println("super.x=" + super.x);
        System.out.println("this.x="  + this.x);
    }
}