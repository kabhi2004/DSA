//Print x^n but the stack hight should be n
import java.util.Scanner;
public class PowerFunction {

    public static int CalcPower(int x,int n)
    {
        if(x==0)
        {
            return 0;
        }
        else if(n==0)
        {
            return 1;
        }
        int Power=x*CalcPower(x, n-1);
        return Power;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(CalcPower(x,n));

    }
    
}
