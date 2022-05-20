public class Day6CountTotalSetBit {
    public static void main(String[] args) {
        countTotalSetBit(1000000000);
    }

    public static void countTotalSetBit(int a) {
        System.out.println("Count Total set Bit");
        int count = 0;
        for (int i = 1; i <= a; i++) {
            System.out.println("Integer : " + i);
            count += countSetBit(i);
        }
        System.out.println("Total count :" + count);
        System.out.println("Total count modulo :" + count % 1000000007);
    }

    public static int countSetBit(int a) {
        int count = 0;
        while (a >= 1) {
            System.out.println("in while a :" + a);
            if (a % 2 != 0) {
                count++;
            }
            a /= 2;
        }
        System.out.println(count);
        return count;
    }
}
