public class arr12{
    public static void main(String[] args) {
        String [] str= {"C","A","B"};
        System.out.println();
        for (int i = 0; i < str.length-1; i++) {
          for(int j=0;j<str.length-1-i; i++)  {
           if((int)str[j].charAt(index:0)>(int)str[j+1].charAt(index:0))
            {
                String temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
          }
        }
        }
}

