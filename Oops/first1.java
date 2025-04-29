package Object;


class hello {
    String firstName="Anushri";
    String lastName="Nema";
    void fullName(){
     System.out.println(firstName+" " +lastName+ " ");
    } 
}
public class first1 {
    public static void main(String[] args) {
        hello m1 = new hello();
        m1.fullName();
    }
}
