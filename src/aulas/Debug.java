package aulas;

public class Debug {
    int width = 20;
    int length = 40;
    int ratio = length / width;

    public void main(String[] args) {
        System.out.println("       1");
        System.out.println("     2 3");
        System.out.println("   4 5 6");
        System.out.println("7 8 9 10");
        System.out.println("20 / 40 (Width / Length) = " + ratio);

        int[] numbers = {1, 2, 3, 4, 5};
        int lastNumber = numbers[4];
        System.out.println("The value of the last element is: " + lastNumber);
    }
}
