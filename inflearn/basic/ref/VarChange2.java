package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("DataA: " + dataA);
        System.out.println("DataB: " + dataB);
        System.out.println();
        System.out.println("DataA.value = " + dataA.value);
        System.out.println("DataB.value = " + dataB.value);

        dataA.value = 20;
        System.out.println();
        System.out.println("변경 dataA.value = 20");
        System.out.println("DataA.value = " + dataA.value);
        System.out.println("DataB.value = " + dataB.value);

        dataB.value = 30;
        System.out.println();
        System.out.println("변경 dataB.value = 30");
        System.out.println("DataA.value = " + dataA.value);
        System.out.println("DataB.value = " + dataB.value);
    }
}
