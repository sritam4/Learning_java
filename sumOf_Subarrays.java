public class sumOf_Subarrays {
    public static void main(String args[])
    {
        int arr[]={12,-4,16,-18,20,22};

        getsum(arr);

    }

    public static void getsum(int arr[]) //this function will give the maximum and minimum sum of the subarray;
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int curr=0;

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];               // this array will help in calculation of sum of subarrays
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                curr= i==0? prefix[j] : prefix[j]- prefix[i-1];  //calculating sum of a subarray using prefix array
                System.out.println(curr);
                if(max<curr)
                    max=curr;
                if(min>curr)
                    min=curr;
            }
        }
        System.out.println("Maximum sum is :"+max);
        System.out.println("Minimum sum is :"+min);
    }
    
} //time complecity for this algorithm is O(n^2) which is less than brutal algo using three for loop whose time complecity is O(n^3).
