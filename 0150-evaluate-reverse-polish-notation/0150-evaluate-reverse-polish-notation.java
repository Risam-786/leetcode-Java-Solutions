class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s1=new Stack<>();
        int a, b, res=0;
        String o1, o2, r="";
        if(tokens.length==0){
            return 0;
        }

        for(String s:tokens){
            if(!s1.empty() && (s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))){
                o1=s1.pop();
                o2=s1.pop();
                b=Integer.parseInt(o1);
                a=Integer.parseInt(o2);

                if(s.equals("+")){
                    res=a+b;
                }

                else if(s.equals("-")){
                    res=a-b;
                }
                
                else if(s.equals("/")){
                    if(b==0){
                        return -1;
                    }
                    else{
                        res=a/b;
                    }
                }

                else{
                    res=a*b;
                }

                r=String.valueOf(res);
                s1.push(r);
            }

            else{
                s1.push(s);
            }
        }

        return Integer.parseInt(s1.pop());
    }
}