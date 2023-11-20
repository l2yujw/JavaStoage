package Collections;

import java.util.*;
import static java.util.Collections.*;

public class CollectionsTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        addAll(list, 1,2,3,4,5);
        System.out.println("addAll"+list);

        rotate(list, 2); // 오른쪽 두칸 순환 이동
        System.out.println("rotate"+list);

        swap(list, 0 ,2); // 첫번째 세번째를 교환
        System.out.println("swap"+list);

        shuffle(list); // 저장된 위치 임의로 변경
        System.out.println("shuffle"+list);

        sort(list);
        System.out.println("sort"+list);

        sort(list, reverseOrder());
        System.out.println("sort reverOrder"+list);

        int idx = binarySearch(list, 3);
        System.out.println("binarySearch"+idx);

        System.out.println("max=" + max(list));
        System.out.println("min=" + min(list));
        System.out.println("maxReverse=" + max(list, reverseOrder()));

        fill(list, 9);
        System.out.println(list);

        replaceAll(list, 9, 1);
        System.out.println(list);
    }
}
