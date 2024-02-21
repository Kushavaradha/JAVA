public class DataTypeConversionDemo2 {
    public static void main(String[] args) {
        double doubleVar = 123.456;
        float floatVar = (float) doubleVar;
        long longVar = (long) floatVar;
        int intVar = (int) longVar; 
        short shortVar = (short) intVar;
        byte byteVar = (byte) shortVar;
        System.out.println("Double: " + doubleVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Long: " + longVar);
        System.out.println("Int: " + intVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Byte: " + byteVar);
    }
}