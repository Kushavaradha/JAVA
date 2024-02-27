import java.util.Scanner;
public class numpattern1 {
    public static void main(String[] args){
        int a,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row: ");
        a = sc.nextInt();
        int k = 1;

        for(i=1;i<=a;i++){
            for(j=1;j<=i;j++){
                System.out.print(k*k+" ");
                k++;
            }
            System.out.println();
        }
    }
}