public class underflow 
{
    public static void main(String[] args) 
    {
        int minInt = Integer.MIN_VALUE;
        int underflowedValue = minInt - 1;
    
        System.out.println("Min Int Value: " + minInt);
        System.out.println("Underflowed Value: " + underflowedValue);
    }
}