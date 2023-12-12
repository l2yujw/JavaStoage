package loop;

public class For {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; ; ){
            sum += i;
            if (sum > 10){
                System.out.println(sum);
                break;
            }
            i++;
        }
    }
}
