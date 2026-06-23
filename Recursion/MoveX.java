import java.util.Scanner;

public class MoveX{
    public static void Move(int idx,int count,String str,String newStr)
    {
        if(idx==str.length())
        {
            while(count-->0)
            {
                newStr=newStr+'x';
            }
            System.out.println(newStr);
            return;
        }
        if(str.charAt(idx)!='x')
        {
           newStr=newStr+str.charAt(idx);
        }
        else{
            count++;
        }
        Move(idx+1,count,str,newStr);
        
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int idx=0,count=0;
    String str=sc.nextLine();
    String newStr=new String("");
    Move(idx,count,str,newStr);
    System.out.println(newStr);
    }
}