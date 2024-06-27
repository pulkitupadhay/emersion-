import java.util.Scanner;

public class Reverse_Integer {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(reverse(x));
        sc.close();
    }
    public static int reverse(int x) {
        int sum=0;
         while(x!=0){
             int rem=x%10;
              if((sum>2147483647/10||sum<-2147483648/10)){
                 return 0;
             }
             sum=(sum*10)+rem;
             x/=10;
         }
         return sum;
     }
}