public class lc263 {
    @SuppressWarnings("unused")
    public static void main(String args[]){
        int n=1;
        int i=2;
        if (n==1){
            System.out.print(true);
        }
        for(i = 2; i<n/2; i+=1){
            if(n/i==1){
                if(i==2 || i==3 || i==5){
                    System.out.print(true);
                     
                }
            }
            else {
                System.out.print(false);
            }
            break;
            

        }
        
    }
    
}
