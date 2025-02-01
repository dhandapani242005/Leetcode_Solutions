class Solution {
    public boolean judgeCircle(String moves) {
                int n = moves.length();
        int L=0,R=0,U=0,D=0;
        for (int i=0; i<n; i++){
            //System.out.println(moves.charAt(i));
            if(moves.charAt(i)=='L'){
                L++;
            }
            if(moves.charAt(i)=='R'){
                R++;
            }
            if(moves.charAt(i)=='U'){
                U++;
            }
            if(moves.charAt(i)=='D'){
                D++;
            }

        }
        if(L==R && U==D){
            return true;
        }

        return false;

    }
}