import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        int n[]={2,11,15,7};
        int target=9;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n.length;i++){
            int complement=target-n[i];
            if(map.containsKey(complement)){
                System.out.println("Indices: "+map.get(complement)+" and "+i);
                return;
            }
            map.put(n[i],i);
        }
        System.out.println("No two sum solution found.");
    }
}
