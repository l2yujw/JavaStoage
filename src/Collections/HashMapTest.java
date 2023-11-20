package Collections;

import java.util.HashMap;
import java.util.Scanner;

//Hash는 10 12 20 22라고 했을때 1 과 2를 해시하여 분류 후 저장을 하여 빠른 검색을 할 수 있게 해줌
public class HashMapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");
        // 세번째 저장한 asdf는 이미 존재하기 때문에 기존의 값을 덮어씀

        Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id :");
            String id = s.nextLine().trim();

            System.out.print("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            } else {
                if(!(map.get(id)).equals(password)) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            }
        } // while
    } // main의 끝
}
