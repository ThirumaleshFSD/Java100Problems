
import java.util.*;

public class DuplicatesHash {
   public static void main(String[] args) {
       int a[]={1,0,2,1,3,2,4,5,3,2,0};
       Map<Integer,Integer> map=new  HashMap<>();
       for(int i=0;i<a.length;i++){
        map.put(a[i],map.getOrDefault(a[i],0)+1);
       }
   
       System.out.println(map);
       
   } 
}
