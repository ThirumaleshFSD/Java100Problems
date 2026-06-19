//1732 of LeetCode
public class HigestAltitude {
    public static void main(String[] args){
        int gain[]={-5,1,5,0,-7};
        int highest=0;
        int current=0;
        for(int i=0;i<gain.length;i++){
            current+=gain[i];
            if(current>highest){
                highest=current;
            }
        }        System.out.println("Highest Altitude: "+highest);
    }
}
