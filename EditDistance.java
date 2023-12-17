class Solution {
    Integer dp[][];
    public int minDistance(String word1, String word2) {
        if(word1.length()==0)return word2.length();
        if(word2.length()==0)return word1.length();
        dp=new Integer[word1.length()+1][word2.length()+1];
        return backtrack(word1,word2,word1.length(),word2.length());
    }
    public int backtrack(String a, String b, int i, int j){
        if(dp[i][j]!=null)return dp[i][j];
        if(i==0 && j==0)return 0;
        if(i==0)return j;
        if(j==0)return i;
        if(a.charAt(i-1)==b.charAt(j-1)){
            dp[i][j]=0+backtrack(a,b,i-1,j-1);
            return dp[i][j];
        }
        else{
            int replace=1+backtrack(a,b,i-1,j-1);
            int delete=1+backtrack(a,b,i-1,j);
            int insert=1+backtrack(a,b,i,j-1);
            int min=Math.min(replace,delete);
            min=Math.min(min,insert);
            dp[i][j]=min;
            return min;
        }
    }
}
