public class FirstOccurancOfString {
    public static void main(String[] args){
        String str="thiruveryeasythiru";
        String search="thiru";
        if(!(str.contains(search))){
            System.out.println("String not found");
        }
        for(int i=0;i<str.length();i++){
            if(str.substring(i,i+search.length()).equals(search)){
                System.out.println("First occurrence of the string is at index: "+i);
                break;
            }
        }

    }
}
