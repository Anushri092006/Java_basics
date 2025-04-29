import java.util.Scanner;

public class arr3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=in.nextInt();
        int []arr=new int [n];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        System.out.println("Now the elements are:");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
