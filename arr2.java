
import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=in.nextInt();
        int []arr=new int [n];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        System.out.print("The elements are:");
        System.out.print(" ");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
