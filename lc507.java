public class lc507 {
    public static void main(String args[]){
        int num = 28,sum=0,i;
        for (i=1; i<=num/2; i++){
            
            
            if (num%i==0){
             sum=sum+i;
                
            }
    }
    if(sum==num){
        System.out.println("True");
    }
    else {
        System.out.print("False");
        }
    }
}