public class Calculator {
    private int total = 0;

    public void sum(int num) {
        total += num;
    }

    public void subtract(int num) {
        total -= num;
    }

    public void multiply(int num) {
        total *= num;
    }

    public void divide(int num) {
        if (num != 0) {
            total /= num;
        }
    }

    public int getTotal() {
        return total;
    }
}
