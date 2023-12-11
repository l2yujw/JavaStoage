package generics;

import java.util.*;

class FruitSu	{
    String name;
    int weight;

    FruitSu(String name, int weight) {
        this.name   = name;
        this.weight = weight;
    }

    public String toString() { return name+"("+weight+")";}

}

class AppleSu extends FruitSu {
    AppleSu(String name, int weight) {
        super(name, weight);
    }
}

class GrapeSu extends FruitSu {
    GrapeSu(String name, int weight) {
        super(name, weight);
    }
}

class AppleCompSu implements Comparator<AppleSu> {
    public int compare(AppleSu t1, AppleSu t2) {
        return t2.weight - t1.weight;
    }
}

class GrapeCompSu implements Comparator<GrapeSu> {
    public int compare(GrapeSu t1, GrapeSu t2) {
        return t2.weight - t1.weight;
    }
}

class FruitCompSu implements Comparator<FruitSu> {
    public int compare(FruitSu t1, FruitSu t2) {
        return t1.weight - t2.weight;
    }
}
public class GenericsSuper {
    public static void main(String[] args) {
        FruitBoxSu<AppleSu> appleBox = new FruitBoxSu<AppleSu>();
        FruitBoxSu<GrapeSu> grapeBox = new FruitBoxSu<GrapeSu>();

        appleBox.add(new AppleSu("GreenApple", 300));
        appleBox.add(new AppleSu("GreenApple", 100));
        appleBox.add(new AppleSu("GreenApple", 200));

        grapeBox.add(new GrapeSu("GreenGrape", 400));
        grapeBox.add(new GrapeSu("GreenGrape", 300));
        grapeBox.add(new GrapeSu("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new AppleCompSu());
        Collections.sort(grapeBox.getList(), new GrapeCompSu());
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();
        Collections.sort(appleBox.getList(), new FruitCompSu());
        Collections.sort(grapeBox.getList(), new FruitCompSu());
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }  // main
}
class FruitBoxSu<T extends FruitSu> extends BoxSu<T> {}

class BoxSu<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() { return list; }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}