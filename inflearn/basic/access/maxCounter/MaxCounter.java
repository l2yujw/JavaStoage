package access.maxCounter;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (isMax(count)) {
            count += 1;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
            getCount();
        }
    }

    private boolean isMax(int count) {
        return max > count;
    }

    public int getCount() {
        return count;
    }
}
