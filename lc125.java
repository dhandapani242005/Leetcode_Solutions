public class lc125 {
    public static void main(String args[]){
        String s = "12344321"; 
        s=s.toLowerCase(); 
        int count =1;  
        int n = s.length(); 
        for (int i=0; i<n ; i++){ 
            for (int j=n-1; j>0; j--){ 
                if(s.charAt(i)==s.charAt(j)){ 
                    count ++; 
                } 
                
            } 
        }        
        if(count==n){ 
            System.out.print("True"); 
        }
        else{
            System.out.print("False");
        }
            
    }
        
}
    

