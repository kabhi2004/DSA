import java.util.Scanner;

public class ReverseStrings{
    public static void Reverse(int idx,String str){
        if(idx==0)
        {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        Reverse(idx-1, str);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Reverse(str.length()-1,str);
        sc.close();

    }

    
}