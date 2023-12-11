package grammar;

/**
 * 인터페이스 장점
 * 1. 개발시간을 단축
 * 2. 표준화 가능
 * 3. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있음
 * 4. 독립적인 프로그래밍이 가능
 */

public class InterfaceTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)	{
            System.out.println("f는 Unit클래스의 자손입니다.");
        }
        if (f instanceof Fightable) {
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        }
        if (f instanceof Movable) {
            System.out.println("f는 Movable인터페이스를 구현했습니다.");
        }
        if (f instanceof Attackable) {
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");
        }
        if (f instanceof Object) {
            System.out.println("f는 Object클래스의 자손입니다.");
        }
    }
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {  }
    public void attack(Unit u) {  }
}

class Unit {
    int currentHP;	// 유닛의 체력
    int x;			// 유닛의 위치(x좌표)
    int y;			// 유닛의 위치(y좌표)
}

interface Fightable extends Movable, Attackable { } // interface의 interface 추가는 implements하여 구현할 필요가 없으므로 extends를 하여 추가해준다.
interface Movable {	void move(int x, int y);	}
interface Attackable {	void attack(Unit u); }