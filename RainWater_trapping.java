
public class RainWater_trapping {
    public static void main(String args[]) {
        int height[]={4,2,0,6,3,2,5};
        Trapped_Water(height); 
    }

    public static void Trapped_Water(int height[])
    {
        //helper array to store tallest block in the left of the block
        int left_tallest[]=new int[height.length];
        left_tallest[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            left_tallest[i]=Math.max(left_tallest[i-1],height[i]);
        }
        
        //helper array to store tallest block in the right of the block
        int right_tallest[]=new int[height.length];
        right_tallest[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            right_tallest[i]=Math.max(height[i],right_tallest[i+1]);
        }

        int totalwater=0;
        int water=0;
         //calculate the total water
        for(int i=0;i<height.length;i++)
        {
            water=Math.min(left_tallest[i],right_tallest[i])-height[i];

            totalwater=totalwater+water;
        }
        System.out.println("Total water trapped ="+totalwater);
    }
    
}
