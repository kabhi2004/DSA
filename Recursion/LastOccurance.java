import java.util.Scanner;
public class LastOccurance {
    static int first=-1;
    static int last=-1;
    public static void Occurance(int idx,String str){
        if(idx==str.length()){
            System.out.println(first+" "+last);
            System.out.println(str.length());
            return;
        }
        if(str.charAt(idx)=='a')
        {
            if(first==-1)
            {
                first=idx;
                last=idx;
            }
            else
            {
                last=idx;
            }

        }
        Occurance(++idx, str);  
   }
   public static void main(String args[])
   {
    int idx=0;
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    Occurance(idx, str);
    sc.close();
   }
    
}
