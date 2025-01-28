public class lc191 {
    public static void main(String args[]) {
        int n=128;
        int a,count=0;
        while (n>0){
            a=n%2;
            if(a==1){
                count++; 
            }
            n=n/2;
        }
        System.out.println(count);
        
    }
}