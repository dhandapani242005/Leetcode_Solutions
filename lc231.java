public class lc231 {
    public static void main(String args[]){
        int n = 2;
        double num =n;
        while (num >1){
        num = num/2;
        System.out.print(num+"  ");
        }
        if (num==1.0){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }


    }
    
}
