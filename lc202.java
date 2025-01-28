public class lc202 
{
    static int square(int num)
        {
            int temp=0;
            while (num>0)
        {
            int n = num%10;
            int n2 = n*n;
            temp += n2;
            num=num/10;
        }
        return temp;
        } 
    static boolean check(int n)
    {
        while(n>2)
        {
            n /=10;
        }       
        return n !=2;

    }
    public static void main(String args[])
    {
        int n =19;
        int result = n;
        while(result != 1 && check(n))
        {
            result =0;
            
            while(n>0)
            {
                int rem = n % 10;
                n /= 10;
                result += rem * rem ;
            }
            n = result;
            System.out.println(result);
        }
        System.out.println(result==1);

       
    }
    
}
