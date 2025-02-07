class Solution {
    public int calculate(String s) {
        Stack<Integer> s1=new Stack<>();
        char operator='+';
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            char current=s.charAt(i);
            if(current>='0'&&current<='9')
            num=num*10+(current-'0');
            if(i==s.length()-1||current=='+'||current=='-'||current=='*'||current=='/')
            {
                switch(operator)
                {
                    case '+':s1.push(num);break;
                    case '-':s1.push(-num);break;
                    case '/':s1.push(s1.pop()/num);break;
                    case '*':s1.push(s1.pop()*num);break;
                }
                operator=current;
                num=0;
            }
        }
        int val=0;
        while(!s1.isEmpty())
        {
            val=val+s1.pop();
        }
        return val;
       
    }
}