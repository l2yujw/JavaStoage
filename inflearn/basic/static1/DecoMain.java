package static1;

public class DecoMain {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil.deco(s);
        //인스턴스를 생성하는게 의미가 없을 때는 바로 불러다 쓸 수 있게 하면 됌

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
