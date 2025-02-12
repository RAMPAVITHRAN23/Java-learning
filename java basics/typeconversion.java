public class typeconversion {
    public static void main(String[] args) {
        byte b = 10;
        int i = b; // Automatic type conversion

        float f = 5.65f;
        int a = (int)f; // Explicit type conversion
        System.out.println(a);

        //type conversion 
        // byte -> short -> int -> long -> float -> double
        byte e=10;
        byte d=40;
        int result = e*d;
        System.out.println(result);
    }
}