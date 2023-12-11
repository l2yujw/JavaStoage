package collections;

import java.util.*;

public class HastSetTest {
    public static void main(String[] args) {
        Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4"};
        // wraper 클래스 new Integer 등은 성능상의 이유로 deprecated 되었다
        // Integer.valueOf(123) 방식이 권장됌

        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);

        /*
            HashSet에 순서를 유지하고자 한다면 LinkedHashSet을 사용해야함
         */
        Set set2 = new HashSet();

        for (int i = 0; set2.size() < 6; i++) {
            int num = (int) (Math.random()*45) + 1;
            set2.add(Integer.valueOf(num));
        }

        List list = new LinkedList(set2);
        Collections.sort(list);
        System.out.println(list);
    }
}
