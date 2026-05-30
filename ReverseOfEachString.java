public class ReverseOfEachString {
    public static void main(String[] args){
        String str="Java is Easy";
        String[] words=str.split(" ");
        String ans="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }
            ans+=rev+" ";
        }
        System.out.println(ans);
    }
}
