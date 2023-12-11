package collections;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        //0x100
        Vector v = new Vector(5);	// 용량(capacity)이 5인 Vector를 생성한다.
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        //0x200
        v.trimToSize();	// 빈 공간을 없앤다.(용량과 크기가 같아진다.) 후에 가비지 컬렉터에의해 제거된다.
        System.out.println("=== After trimToSize() ===");
        print(v);

        //0x300
        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        //0x400
        v.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear();
        System.out.println("=== After clear() ===");
        print(v);
    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size :" + v.size());
        System.out.println("capacity :" + v.capacity());
    }
}
