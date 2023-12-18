// https://www.interviewbit.com/problems/interview-questions/
public class Solution {
    public int bulbs(int[] A) {
        boolean f=true;
        int ans=0;
        for(int x:A){
            if(x==0 && f){
                ans++;
                f=!f;
            }
            else if(x==1 && !f){
                ans++;
                f=!f;
            }
        }
        return ans;
    }
}
