public class Binary_serarch {
    public static int search(int key,int arr[])
    {
        int mid, start=0,end=arr.length-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return -1;
    }

    public static void main(String args[])
    {
        int arr[]={2,4,8,10,14,16,18,20};
        int key=9494;
        int pos=search( key,arr);
        if (pos==-1)
            System.out.println(key+" Not found in the array");
        else    
            System.out.println(key+" Found at index "+pos);

    }
}
