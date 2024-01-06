class Solution {
    List<int[]> l;
    int p[];
    Map<Integer,Integer> map;
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        l=new ArrayList<>();
        map=new HashMap<>();
        p=profit;
        for(int i=0;i<startTime.length;i++){
            l.add(new int[]{startTime[i],endTime[i],profit[i]});
        }
        Collections.sort(l,(a,b)->Integer.compare(a[0],b[0]));
        return backtrack(0);
    }
    public int backtrack(int i){
        if(i>=l.size())return 0;
        if(map.containsKey(i))return map.get(i);
        int take=l.get(i)[2];
        int j=l.get(i)[1];
        int ii=i;
        ii=binarySearch(l,j,ii);
        if(ii<l.size())
            take+=backtrack(ii);
        int nottake=backtrack(i+1);
        int ans=Math.max(take,nottake);
        map.put(i,ans);
        return ans;
    }
    public int binarySearch(List<int[]> l, int t, int start){
        int end=l.size();
        int mid=start+(end-start)/2;
        while(start<end){
            if(start==end)return start;
            mid=start+(end-start)/2;
            if(l.get(mid)[0]<t)start=mid+1;
            else end=mid;
        }
        return end;
    }
}
