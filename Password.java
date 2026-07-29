import java.util.*;
public class Password {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password");
        String password=sc.nextLine();
        boolean uppercase=false;
        boolean lowercase=false;
        boolean digit=false;
        boolean specialChar=false;
        if(password.length()>=8){
            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);
                if(Character.isUpperCase(ch)){
                    uppercase=true;
                }
                else if(Character.isLowerCase(ch)){
                    lowercase=true;
                }
                else if(Character.isDigit(ch)){
                    digit=true;
                }
                else{
                    specialChar=true;
                }
            }
            if(uppercase && lowercase && digit && specialChar){
                System.out.println("Valid password");
            }
            else{
                System.out.println("Invalid password");
            }
        }
        else{
            System.out.println("Invalid password");
        }
    }
}
