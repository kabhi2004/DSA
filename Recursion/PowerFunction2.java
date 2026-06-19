//Print x^n but the stack hight should be n
import java.util.Scanner;
public class PowerFunction2 {

    public static int CalcPower(int x,int n)
    {
        if(x==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        if(n%2==0)
        {
             return CalcPower(x, n/2)*CalcPower(x, n/2);
        }
        else{
            return CalcPower(x, n/2)*CalcPower(x, n/2)*x;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(CalcPower(x,n));

    }
    
}
