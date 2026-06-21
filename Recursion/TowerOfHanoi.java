import java.util.Scanner;

public class TowerOfHanoi{

    public static void toh(int n, char src, char help, char des)
    {
        if(n==1)
        {
            System.out.println("Transfer disk "+n+" from "+src+" to "+des);
            return;
        }
        toh(n-1,src,des,help);
        System.out.println("Transfer disk "+n+" from "+src+" to "+des);
        toh(n-1,help,src,des);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,'S','H','D');
    }
}