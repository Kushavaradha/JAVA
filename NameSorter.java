import java.util.Scanner;
public class perfect {
    public static void main(String[] args){
        int a,b=0,i;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number to be checked: ");
        a = sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                b=b+i;
            }
        }
        if(b==a)
        {
            System.out.println("Is perfect number");
        }
        else
        {
            System.out.println("Not a perfect number");
        }
    }
}