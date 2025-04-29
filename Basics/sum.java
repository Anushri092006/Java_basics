public class sum {
    public static void main(String[] args) {
        int a=123;
        int result=0;
        while(a>0){
            int digit=a%10;
        
         result=result+digit;
         a=a/10;
        }
        System.out.println(result);
    }
}
