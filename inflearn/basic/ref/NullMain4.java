package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value" + bigData.data.value);

        //null값에 .을 찍었다고 생각하면 문제를 쉽게 찾을 수 있다.
    }
}
