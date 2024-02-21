public class DataTypeConversionDemo 
{
    public static void main(String[] args) 
    {
        byte byteVar = 10;
        short shortVar = byteVar;       
        int intVar = shortVar;          
        long longVar = intVar;         
        float floatVar = longVar;       
        double doubleVar = floatVar;    
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
    }
}