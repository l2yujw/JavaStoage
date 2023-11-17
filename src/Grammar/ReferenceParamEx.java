package Grammar;

class ReData {int x;}

public class ReferenceParamEx {
    public static void main(String[] args) {
        ReData d = new ReData();
        d.x = 10;
        System.out.println(d.x);

        System.out.println("changed");
        change(d);
        System.out.println(d.x);
    }

    static  void change(ReData d){
        d.x = 1000;
        System.out.println(d.x);
    }
}
