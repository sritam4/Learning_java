public class PairsInArray {
    public static void pairs(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+") ");
                count++;
            }
            System.out.println();
        }
        //there is another formula to find total no of pairs
        // i.e Tp=n(n-1)/2;   "from Arithmatic Progration"
        System.out.println("total no of pairs are :"+count);
    }

    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};

        pairs(arr);
    }
    
}
