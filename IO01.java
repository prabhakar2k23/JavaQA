public class IO01 {
    public static void main(String[] args) {
        String a = "hello";
        String b = new String("hello");

        System.out.println(a == b);       // Line 1
        System.out.println(a.equals(b));  // Line 2
    }
}
