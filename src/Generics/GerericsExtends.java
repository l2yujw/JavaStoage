package Generics;

import java.util.ArrayList;

class FruitEx		          { public String toString() { return "Fruit";}}
class AppleEx extends FruitEx { public String toString() { return "Apple";}}
class GrapeEx extends FruitEx { public String toString() { return "Grape";}}

class Juice {
    String name;

    Juice(String name)	     { this.name = name + "Juice"; }
    public String toString() { return name;		 }
}

class Juicer {
    static Juice makeJuice(FruitBoxEx<? extends FruitEx> box) {
        String tmp = "";

        for(FruitEx f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

public class GerericsExtends {
    public static void main(String[] args) {
        FruitBoxEx<FruitEx> fruitBox = new FruitBoxEx<FruitEx>();
        FruitBoxEx<AppleEx> appleBox = new FruitBoxEx<AppleEx>();

        fruitBox.add(new AppleEx());
        fruitBox.add(new GrapeEx());
        appleBox.add(new AppleEx());
        appleBox.add(new AppleEx());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }  // main
}

class FruitBoxEx<T extends FruitEx> extends BoxEx<T> {}

class BoxEx<T> {
    //class FruitBox<T extends Fruit> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);      }
    T get(int i)     { return list.get(i); }
    ArrayList<T> getList() { return list;  }
    int size()       { return list.size(); }
    public String toString() { return list.toString();}
}