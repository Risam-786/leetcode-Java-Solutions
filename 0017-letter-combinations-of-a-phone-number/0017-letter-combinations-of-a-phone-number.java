class Solution {
    public static void solve(String digits,List<String> result,HashMap<Character,String> dial,String str,int index){
if(digits.length()==str.length()){
result.add(str);
return;
}
else{
String pair=dial.get(digits.charAt(index));
for(int i=0;i<=pair.length()-1;i++){
solve(digits,result,dial,str+pair.charAt(i),index+1);
}
}
}
public List<String> letterCombinations(String digits) {
HashMap<Character,String> dial=new HashMap<>();
dial.put('2',"abc");
dial.put('3',"def");
dial.put('4',"ghi");
dial.put('5',"jkl");
dial.put('6',"mno");
dial.put('7',"pqrs");
dial.put('8',"tuv");
dial.put('9',"wxyz");
List<String> result=new ArrayList<>();
if(digits.length()==0)
return result;
String str="";
solve(digits,result,dial,str,0);
return result;
}

}