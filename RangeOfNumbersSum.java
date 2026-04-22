
public class RangeOfNumbersSum {
    public static void main(String[] args) {
        int start = 5; // Starting number of the range
        int end = 10;  // Ending number of the range
        int sum = getSum(0, start, end);
        System.out.println("The sum of numbers from " + start + " to " + end + " is: " + sum);
        
    }
    static int getSum(int sum,int s,int e){
        if(s>e)
            return sum;
        return s+getSum(sum,s+1,e);
    }
}
