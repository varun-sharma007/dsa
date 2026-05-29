package recursion;

public class power {
    public static int p(int x,int n)
    {
        if(n==1)
        return x;
        return x* p(x,n-1);
    }
    public static int p_opt(int x,int n)
    {
        if(n==1)
        return x;
        int pow=p_opt(x,n/2);
        if(n%2!=0)
        return x*pow*pow;
        return pow*pow;
    }
    public static void main(String args[])
    {
        int x=2;
        int n=10;
        System.out.println(p(x,n));
        System.out.println(p_opt(x,n));
    }
}
