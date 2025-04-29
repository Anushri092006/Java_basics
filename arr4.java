import java.util.Scanner;

public class arr4 {
    public static void main(String[] args) {
        
    
     Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=in.nextInt();
        int []arr=new int [n];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i<=n-1;i++){
        sum=sum+arr[i];
    }
        System.out.println(sum+" ");
        
}
}