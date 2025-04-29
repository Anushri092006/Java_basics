

public class sec {
   public static void main(String[]args){
    try{
    int a=args.length;
    System.out.println("a="+a);
    int b=10/a;
    int c[]={5};
    c[10]=100;

    } 
    catch (ArithmeticException e){
      System.out.println("divide by zero");  
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("IndexOutOfBounds");
    }
   }
}
