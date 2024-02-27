import java.util.*;

class NPRIMENUMBERSAFTERNTHPRIMENUMBER {
    public static booleancheckInt(String n){
try{
            int x = Integer.parseInt(n);
            return true;
        }
catch(NumberFormatException e){
System.out.println("Enter a Valid Integer.");
            return false;
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

System.out.println("Enter N : ");
        String n = sc.nextLine();

        if(checkInt(n) == true){
            int num = Integer.parseInt(n);
if(num> 0){
                int arr[];
arr = new int[2*num];

                int count=0,c=0,k=2,l=0;
                while(l<2*num){
                    count = 0;
for(int j = 1;j<=k;j++){
if(k%j == 0){
                            count = count + 1;
                        }
                    }
if(count <= 2){
arr[l] = k;
                        l++;
                    }
                    k++;
                }

System.out.println("\nNthPrime : " + arr[num-1]);
System.out.println("N prime after " + arr[num-1] + " :");
for(int i = num;i<2*num;i++){
System.out.print(arr[i] + "\t");
                }
            }
else{
System.out.println("Enter a Positive Integer");
            }
        }

    }
}
