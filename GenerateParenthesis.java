class generateParenthesis {
  //Leetcode 22
    List<String> ans;
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        backtrack("",n,n);
        return ans;
    }
    public void backtrack(String s,int o, int c){
        if(o==0 && c==0)ans.add(s);
        if(o!=0){
            s+="(";
            backtrack(s,o-1,c);
            s=s.substring(0,s.length()-1);
        } 
        if(c>o) {
            s+=")";
            backtrack(s,o,c-1);
            s=s.substring(0,s.length()-1);
        }
    }
}
