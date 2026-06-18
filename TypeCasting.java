public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Casting: int to double: " + doubleValue);

        // Explicit Casting (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Casting: double to int: " + anotherIntValue);
    }
}
