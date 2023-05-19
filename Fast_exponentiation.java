public class Fast_exponentiation {
    public static void fastExpo(int base,int pow){
        int ans=1;
        while(pow>0){
            if((pow & 1)!=0){  //Check LSB for 1
                ans=ans*base;
            }
            base=base*base;
            pow=pow>>1;
        }
        System.out.println("Answer is   :"+ans);
    }

    public static void main(String args[]){
        fastExpo(3, 5);
    }
}
