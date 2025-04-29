public class arr9 {
    public static void main(String[] args) {
        int a=123;
        int sum=0;
        while(a>0){
            int ld=a%10;
            sum=sum+ld;
            a=a/10;
        }
//System.out.println(a);
        System.out.println(sum);
    }
}
