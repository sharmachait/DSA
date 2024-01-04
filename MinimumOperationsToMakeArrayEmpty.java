class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans=0;
        for(int n:map.keySet()){
            if(map.get(n)==1)return -1;
            ans+=Math.ceil((double)map.get(n)/(double)3);
        }
        return ans;
    }
}
