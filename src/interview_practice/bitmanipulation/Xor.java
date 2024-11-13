
import java.util.ArrayList;

public class Xor{

    public static int[] getMaximumXor(int[] ar, int maximumBit) {
        int k = (2 << maximumBit) - 1;
        int xorSum = 0;
        for(int i = 0; i < ar.length; i++){
            xorSum ^= ar[i];
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(int i = ar.length - 1; i >= 0; i--){
            
            int tempSum = xorSum;
            int tempK = k;
            int bits = 0;
            int num = 0;
            for(int j = 0; tempK != 0; j++){
                if((tempK & 1) != (tempSum & 1)){
                    num += (1 << j);
                }

                tempK >>= 1;
                tempSum >>= 1;
            }

            res.add(num);
            xorSum ^= ar[i];
        }

        int ans[] = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;

    }


    public static void main(String[] args){
        
        int[] ar = {0,1,2,2,5,7};
        int maximumBit = 3;
        int res[] = getMaximumXor(ar, maximumBit);
        for(int x : res){
            System.out.print(x+" ");
        }

    }

}