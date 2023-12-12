package loop;

/*
    조건식을 확인한다. 참이면 코드 블럭을 실행하고, 거짓이면 while문을 벗어난다.
    조건식이 참이면 코드 블럭을 실행한다. 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다.(무한 반복)
 */
public class While {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3){
            count += 1;
            System.out.println(count);
        }
    }
}
