import java.util.Scanner;
public class NumberOfPrime {
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int c=0;
        int num=2;
        while(c<n){
            boolean isPrime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
                c++;
            }
            num++;
        }
    }
}
