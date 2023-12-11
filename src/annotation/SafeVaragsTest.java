package annotation;

import java.util.Arrays;

class MyArrayList<T> {
    T[] arr;

    @SafeVarargs
    @SuppressWarnings("varargs")
    MyArrayList(T... arr) {
        this.arr = arr;
    }

    // 보통 두 애너테이션을 같이 씀
    // SafeVarags는 unchecked 경고를 억제할 수 있지만 varargs 경고는 억제할 수 없기 때문
    @SafeVarargs
	@SuppressWarnings("varargs")
    public static <T> MyArrayList<T> asList(T... a) {
        return new MyArrayList<>(a);
    }

    public String toString() {
        return Arrays.toString(arr);
    }
}

public class SafeVaragsTest {
    public static void main(String args[]) {
        MyArrayList<String> list = MyArrayList.asList("1","2","3");

        System.out.println(list);
    }
}
