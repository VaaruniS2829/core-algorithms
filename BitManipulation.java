public class BitManipulationExample {
    public static void main(String[] args) {
        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        // AND operator
        int andResult = a & b; // 0101 & 0011 = 0001
        System.out.println("a & b = " + andResult);

        // OR operator
        int orResult = a | b; // 0101 | 0011 = 0111
        System.out.println("a | b = " + orResult);

        // XOR operator
        int xorResult = a ^ b; // 0101 ^ 0011 = 0110
        System.out.println("a ^ b = " + xorResult);

        // NOT operator
        int notResult = ~a; // ~0101 = 1010 (in 32-bit: -6)
        System.out.println("~a = " + notResult);

        // Left shift
        int leftShift = a << 2; // 0101 << 2 = 010100 (20)
        System.out.println("a << 2 = " + leftShift);

        // Right shift
        int rightShift = a >> 1; // 0101 >> 1 = 0010 (2)
        System.out.println("a >> 1 = " + rightShift);

        // Unsigned right shift
        int unsignedRightShift = a >>> 1; // 0101 >>> 1 = 0010 (2)
        System.out.println("a >>> 1 = " + unsignedRightShift);
    }
}
