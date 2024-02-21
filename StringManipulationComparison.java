import java.util.Scanner;

public class StringManipulationComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of iterations for string appending: ");
        int iterations = scanner.nextInt();


        long startTime = System.currentTimeMillis();


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("Iteration " + i + "\n");
        }
        String sbResult = sb.toString();


        long endTime = System.currentTimeMillis();
        long sbTime = endTime - startTime;


        startTime = System.currentTimeMillis();

        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append("Iteration " + i + "\n");
        }
        String sbufferResult = sbuffer.toString();

        endTime = System.currentTimeMillis();
        long sbufferTime = endTime - startTime;


        System.out.println("StringBuilder results:\n" + sbResult);
        System.out.println("StringBuilder time taken: " + sbTime + " milliseconds");
        System.out.println("StringBuffer results:\n" + sbufferResult);
        System.out.println("StringBuffer time taken: " + sbufferTime + " milliseconds");


        String conclusion = "For " + iterations + " iterations, StringBuilder performed " + (sbufferTime - sbTime) +
                " milliseconds faster than StringBuffer. Use StringBuilder for non-multithreaded scenarios for efficiency.";
        System.out.println(conclusion);
}
}