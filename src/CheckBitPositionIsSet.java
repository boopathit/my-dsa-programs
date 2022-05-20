//Check if i th bit of a number is set bit or not
public class CheckBitPositionIsSet {
    public static void main(String[] args) {
        int i = 9, numberToCheck = 22;
        System.out.println("value : " + Integer.toBinaryString(numberToCheck));
        System.out.println("shift : " + Integer.toBinaryString((1 << i)));
        System.out.println("AND   : " + Integer.toBinaryString(numberToCheck & (1 << i)));
        System.out.println("Set bit : " + ((numberToCheck & (1 << i)) > 0));
    }
}
