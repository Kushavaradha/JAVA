import java.util.*;
class staff
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc= new Scanner(System.in);
            int c=0,d=0;
System.out.print("Total users: ");
            int a= sc.nextInt();
System.out.print("Staff users: ");
            int b= sc.nextInt();
            if(a<0||b<0)
            {
System.out.println("Enter a valid no.of.users");
            }
            else
            {
                c=b/3;
                d=a-b-c;
System.out.println("Student users:" +d);
            }
        }
catch(Exception e)
        {
System.out.println("Enter the correct no.of.users");
        }
    }
}
