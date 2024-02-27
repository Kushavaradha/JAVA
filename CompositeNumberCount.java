public class CompositeNumberCount {
    
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not composite
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true; // If a divisor is found, the number is composite
            }
        }
        return false; // If no divisor found, the number is not composite
    }
    
    public static int countCompositeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isComposite(num)) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        int compositeCount = countCompositeNumbers(arr);
        
        System.out.println("Number of composite numbers in the array: " + compositeCount);
    }
}
