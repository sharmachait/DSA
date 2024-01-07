class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        Map<Long,Integer> g[]=new Map[nums.length];
        for(int i=0;i<nums.length;i++){
            g[i]=new HashMap<>();
        }
        for(int curr=0;curr<nums.length;curr++){
            for(int prev=0;prev<curr;prev++){
                long diff=(long)nums[curr]-(long)nums[prev];
                int res=0;
                if(g[prev].containsKey(diff)){
                    res=1+g[prev].get(diff);
                }
                else{
                    res=1;
                }
                int already_counted_sequences=g[curr].getOrDefault(diff,0);
                res=res+already_counted_sequences;
                g[curr].put(diff,res);
            }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(long j:g[i].keySet()){
                ans+=g[i].get(j);
            }
        }
        int n=nums.length;
        int ceil=(int)Math.ceil(n*(n-1)/2);
        ans-=ceil;
        return ans;
    }
}
