class Solution {
    public void rotate(int[][] arr) {
        int r = arr.length;
             for (int i=0; i<r;i++){
                for (int j=0; j<r;j++){
                    if (i>j){
                        int temp = arr[j][i];
                        arr[j][i]=arr[i][j];
                        arr[i][j]=temp;
                }       
            }
        }

        
        for(int i=0;i<r; i++){
            int a = 0;
            int z = r-1; 
            while (a<z){
                int temp =arr[i][z];
                arr[i][z]= arr[i][a];
                arr[i][a]=temp;
                a++;
                z--;
            }
           

        }

    }       
}
