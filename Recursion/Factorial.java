import java.util.Scanner;

public class Factorial{

    public static int Fact(int n)
    {
        if(n==0)
            return 1;
        System.out.println(n-1);
        return n*Fact(n-1);



    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=Fact(n);
        System.out.println(ans);
        sc.close();
    }
}
//Mathematical Formula of finding the n natural no. is n(n+1)/2;