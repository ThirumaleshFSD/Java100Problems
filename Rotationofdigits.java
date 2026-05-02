public class Rotationofdigits {
    public static void main(String[] args){
        int c=0;
        int n=10;
        boolean isValid=true;
        boolean isRotated=false;
        for(int i=1;i<n;i++){
            int num=i;
            while(num>0){
                int digit=num%10;
                if(digit==0 || digit==1 || digit==6 || digit==8 || digit==9){
                    if(digit==6){
                        isRotated=true;
                    }
                    if(digit==9){
                        isRotated=true;
                    }
                }else{
                    isValid=false;
                    break;
                }
                num=num/10;
            }
            if(isValid && isRotated){
                c++;
            }

        }
        System.out.println(c);
    }
}
