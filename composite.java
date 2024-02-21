import java.util.Scanner;
public class composite {
    public static void main(String[] args){
        int a,b=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to be checked: ");
        a = sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                b=b+1;
            }
        }
        if(b>1)
        {
            System.out.println("Is composite number");
        }
        else
        {
            System.out.println("Not a composite number");
        }
    }
}

