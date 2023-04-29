public class BinarySearch_1 {
    public static void main(String args[])
    {
        int arr[]={1,4,5,7,14};
        int key=7;
        Search S1=new Search(arr,key);
        System.out.println("Key is found at index "+S1.binsearch());
    }
}
class Search{
    int arr[];
    int key;

    Search(int arr[],int key){
        this.arr=arr;
        this.key=key;
    }

    public int binsearch(){
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;

        while(left<=right)
        {
            if(arr[mid]==key){
                return mid;
                
            }
            else if(key<arr[mid]){
                right=mid-1;
                mid=(left+right)/2;
            }
            else{
                left=mid+1;
                mid=(left+right)/2;
            }
        }
        return -1;
    }

}


