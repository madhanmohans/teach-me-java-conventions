package powerpackage;

public class PowerFinder {
    public static int pow(int base, int exponent) {
        int power = 1;
        for (int i = 0; i < exponent; i++) {
            power *= base;
        }
        return power;
    }
}
