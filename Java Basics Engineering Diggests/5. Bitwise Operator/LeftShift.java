public class LeftShift {
    public static void main(String[] args) {

        int a = 12;
        int b = a << 1; // <----------

        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

    }
}
