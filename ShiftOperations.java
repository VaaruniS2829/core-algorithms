public class ShiftOperations {
    public static void main(String[] args) {
        int a = 5;  // 0101

        System.out.println("a = " + a);
        System.out.println("a << 1 = " + (a << 1));   // Left shift (multiply by 2)
        System.out.println("a >> 1 = " + (a >> 1));   // Right shift (divide by 2)
        System.out.println("a >>> 1 = " + (a >>> 1)); // Unsigned right shift
    }
}
