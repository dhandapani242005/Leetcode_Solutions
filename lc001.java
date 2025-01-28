import java.util.Arrays;
public class lc001 {
    public static void main(String args[]){
        int [] arr = {1,2,3,4,6,7,8};
        int num = 6;
        for (int i=0; i<arr.length; i++){
            for (int j=1; j<arr.length; j++){
                if(arr[i]+arr[j]==num){
                    int[] result = {j , i };
                    System.out.print(Arrays.toString(result));
                    // System.out.print(i);
                }
                break;
            }
            
        }
    }
    
}
