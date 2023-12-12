package scope;

public class Scope2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;
        int sumFor = 0;

        while (i <= endNum){
            sum += i;
            System.out.println(""+ i + sum);
            i++;
        }

        for (int j = 1; j <= endNum; j++) {
            sum += j;
            System.out.println(""+ j + sum);
        }
    }
}
