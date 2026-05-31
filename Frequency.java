import java.util.*;
public class Frequency {
   public static void main(String[] args) {
        int n[]={1,2,2,3,3,3,4,4,4,4};
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for(int num : n){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    } 
}
