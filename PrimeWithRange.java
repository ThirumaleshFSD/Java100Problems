public class PrimeWithRange {
    public static void main(String[] args) {
        int start=10;
        int end=50;
        System.out.println("Prime numbers between "+start+" and "+end+" are:");
        for(int n=start;n<=end;n++){
            boolean isPrime=true;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime && n>1)
                System.out.print(n+" ");
        }
    }
}
