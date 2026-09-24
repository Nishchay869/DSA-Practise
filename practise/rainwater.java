package practise;

public class rainwater {
    public static int rainwater(int height[]){
        //left max
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }
        int rightmax[]= new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(rightmax[i],leftmax[i]);
            trappedWater+=(waterlevel-height[i]);
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.print(rainwater(height));
    }
}
