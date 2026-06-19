public class SumOfNatural {
    public static int  Sum(int n)
    {
        if(n==0)
          return 0;
        int ans=n+Sum(n-1);
    
        return ans;
    }
    public static void main(String args[])
    {
        int n=10;
        System.out.println(Sum(n));
    }
    
}
