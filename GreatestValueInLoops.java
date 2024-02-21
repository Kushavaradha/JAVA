public class GreatestValueInLoops 
{
    public static void main(String[] args) 
    {
        int[] loop1 = {10, 15, 8, 20, 12};
        int[] loop2 = {25, 18, 22, 30, 28};

        int maxInLoop1 = findMax(loop1);
        int maxInLoop2 = findMax(loop2);

        if (maxInLoop1 > maxInLoop2) 
        {
            System.out.println("Loop 1 contains the greatest value: " + maxInLoop1);
        } else if (maxInLoop2 > maxInLoop1) 
        {
            System.out.println("Loop 2 contains the greatest value: " + maxInLoop2);
        } 
        else 
        {
            System.out.println("Both loops contain the same greatest value: " + maxInLoop1);
        }
    }
    private static int findMax(int[] loop) 
    {
        int max = loop[0];
        for (int i = 1; i < loop.length; i++) 
        {
            if (loop[i] > max) 
            {
                max = loop[i]
            }
        }
        return max;
    }
}