public class SumOfNnumbers {
    public static void main(String[] args) {
        int n=11;
        int sum=getSum(n);
        System.out.println("The sum of first "+n+" natural numbers is: "+sum);
        
    }
    static int getSum(int n){
        if(n==0)
            return n;
        return n+getSum(n-1);
    }
}
