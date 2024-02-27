import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {
    
    public static List<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result.add(arr1[i]);
                i++;
            } else {
                result.add(arr2[j]);
                j++;
            }
        }
        
        while (i < arr1.length) {
            result.add(arr1[i]);
            i++;
        }
        
        while (j < arr2.length) {
            result.add(arr2[j]);
            j++;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        
        List<Integer> mergedArray = mergeSortedArrays(arr1, arr2);
        
        System.out.println("Merged sorted array:");
        System.out.println(mergedArray);
    }
}
