package recursion;
public class occur {
    public static int firstoccur(int[] arr,int i,int k)
    {
        if(i>=arr.length)
        return -1;
        if(arr[i]==k)
        return i;
        return firstoccur(arr,i+1,k);
    }
    public static int lastoccur(int[] arr, int i,int k)
    {
        if(i<0)
        return -1;
        if(arr[i]==k)
        return i;
        return lastoccur(arr,i-1,k);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,3,6};
        int i=0;
        System.out.println("First occurence of 3 = "+firstoccur(arr,i,3));
        System.out.println("Last occurence of 3 ="+lastoccur(arr,arr.length-1,3));
    }
}

