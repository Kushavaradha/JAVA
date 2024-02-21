import java.util.Arrays;
import java.util.Scanner;

public class EqualizeArrays 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the first array:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) 
        {
            array1[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) 
        {
            array2[i] = scanner.nextInt();
        }
        if (array1.length != array2.length) 
        {
            int minLength = Math.min(array1.length, array2.length);
            array1 = Arrays.copyOf(array1, minLength);
            array2 = Arrays.copyOf(array2, minLength);
            System.out.println("Arrays have been equalized in length.");
        } 
        else 
        {
            System.out.println("Arrays are already of equal length.");
        }
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        
        scanner.close();
    }
}