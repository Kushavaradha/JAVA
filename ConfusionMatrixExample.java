import java.util.Scanner;

public class ConfusionMatrixExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the confusion matrix values:");

        System.out.print("True Positive (TP): ");
        int truePositive = scanner.nextInt();

        System.out.print("True Negative (TN): ");
        int trueNegative = scanner.nextInt();

        System.out.print("False Positive (FP): ");
        int falsePositive = scanner.nextInt();

        System.out.print("False Negative (FN): ");
        int falseNegative = scanner.nextInt();

        double precision = calculatePrecision(truePositive, falsePositive);
        double recall = calculateRecall(truePositive, falseNegative);
        double f1Score = calculateF1Score(precision, recall);
        System.out.println("\nMetrics:");
        System.out.println("True Positive (TP): " + truePositive);
        System.out.println("True Negative (TN): " + trueNegative);
        System.out.println("False Positive (FP): " + falsePositive);
        System.out.println("False Negative (FN): " + falseNegative);
        System.out.println("Precision: " + precision);
        System.out.println("Recall: " + recall);
        System.out.println("F1 Score: " + f1Score);
        scanner.close();
    }
    private static double calculatePrecision(int truePositive, int falsePositive) 
    {
        return (double) truePositive / (truePositive + falsePositive);
    }
    private static double calculateRecall(int truePositive, int falseNegative) 
    {
        return (double) truePositive / (truePositive + falseNegative);
    }

   
    private static double calculateF1Score(double precision, double recall) 
    {
        return 2 * (precision * recall) / (precision + recall);
    }
}