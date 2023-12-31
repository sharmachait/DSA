class Solution {
    public int maximalSquare(char[][] a) {
        int dp[][]=new int[a.length+1][a[0].length+1];
        for(int i=0;i<=a.length;i++) dp[i][0]=0;
        for(int i=0;i<=a[0].length;i++) dp[0][i]=0;

        int max=0;
        for(int i=1;i<=a.length;i++){
            for(int j=1;j<=a[0].length;j++){
                if(a[i-1][j-1]=='1'){
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}
