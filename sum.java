package recurs;
class sum
{
    public static int s(int n)
    {
        if(n==1)
        return 1;
        return n+s(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(s(n));
    }
}