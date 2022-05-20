//Given an integer array find XOR of all the numbers where i th bit is set bit.
public class XORofItems {
    public static String padStart(String s, int padSize) {
        if (s.length() == padSize) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < padSize - s.length()) {
            sb.append("0");
        }
        return sb + s;
    }

    public static void main(String[] args) {
        int i = 2;
        int input[] = {1, 5, 7, 8, 4, 9};
        int res = 0;
        for (int j = 0; j < input.length; j++) {
//            System.out.println("String : " + Integer.toBinaryString(input[j]));
//            System.out.println("Padded : " + padStart(Integer.toBinaryString(input[j]), 4));
//            System.out.println("Shift 1: " + padStart(Integer.toBinaryString((1 << i)), 4));
//            System.out.println("& value: " + padStart(Integer.toBinaryString(input[j] & (1 << i)), 4));
            if ((input[j] & (1 << i)) > 0) {
//                System.out.println("set bit : " + input[j] + " Binary : " + padStart(Integer.toBinaryString(input[j]), 4));
                res = res ^ input[j];
            }
        }
        System.out.println(Integer.toBinaryString(res));
    }
}
