public class Duplicate
{
    public static void main(String args[])
    {
        int arr[]={1,3,4,2,6,8};
        System.out.println(check_duplicate(arr));
    }

    public static boolean check_duplicate(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return true;
                } 
            }
        }

        return false;
    }
}