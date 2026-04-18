package aulas;

public class Debug {
    int width = 0;
    int length = 40;
    int ratio = width / length;

    public void main(String[] args) {
        System.out.println("       1");
        System.out.println("     2 3");
        System.out.println("   4 5 6");
        System.out.println("7 8 9 10");
        System.out.println("0 / 40 (Width / Length) = " + ratio);

        int[] numbers = {1, 2, 3, 4, 5};
        int lastNumber = numbers[4];
        System.out.println("The value of the last element is: " + lastNumber);

        try {
            int ratio = length / width;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        }

        int steps = 10;
        for (int i = 1; i <= steps; i++) {
            System.out.println("Step #" + i);
        }
    }
}
