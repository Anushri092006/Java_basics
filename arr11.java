public class arr11 {                                                        
    public static void main(String[] args) {
        String str="racecarjhdgahaha";
        int count=0;
        int countcon=0;//https://github.com/Anushri092006/Java
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'|| str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                count++;
            }  
            else countcon++;
        }
        System.out.println(count+" are vowels");
        System.out.println(countcon+"  are the consunants");

    }
}
