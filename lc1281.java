public class lc1281 {
    public static void main (String args[]){
        int n =191;
        int a,m=1,s=0;
        while (n>0){
            a=n%10;
            s=s+a;
            m=m*a;
            n=n/10; 
        }
        m=m-s;
        System.out.print(m);
    }
    
}
