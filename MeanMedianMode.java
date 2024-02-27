import java.util.*;

public class MeanMedianMode {
    
    public static double calculateMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    
    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            return (double) (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            return (double) arr[n/2];
        }
    }
    
    public static List<Integer> calculateMode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }
        
        return modes;
    }
    
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        
        double mean = calculateMean(arr);
        double median = calculateMedian(arr);
        List<Integer> modes = calculateMode(arr);
        
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode(s): " + modes);
    }
}
