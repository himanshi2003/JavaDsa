public class gcdoreuclidianalgo {
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int oldvalofb = b;
            b = a % b;
            a = oldvalofb;
        }
        return a;
    }

    static int getLCM(int a, int b) {

        int gcd = getGCD(a, b);
        // gcd(18,12) = 6
        int prod = a * b;
        // product = 216
        int lcm = prod / gcd;
        return lcm;
    }

    public static void main(String[] args) {

        System.out.println("GCD = " + getGCD(18, 12));

        System.out.println("LCM = " + getLCM(18, 12));
    }
}
