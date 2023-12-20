class Solution {
    public int eraseOverlapIntervals(int[][] a) {
        int ans=0;
        List<int[]> l=new ArrayList<>();
        for(int i[]:a) l.add(i);
        Collections.sort(l,(b,c)->Integer.compare(b[0],c[0]));
        int i=1;
        while(i<l.size()){
            int curr[]=l.get(i);
            int prev[]=l.get(i-1);
            if(curr[0]<prev[1]){
                //overlapping
                ans++;

                //greedy if else
                if(curr[1]>prev[1]){
                    l.remove(curr);
                }
                else if(prev[1]>curr[1]){
                    l.remove(prev);
                }
                else{
                    if(prev[0]<curr[0]) l.remove(prev);
                    else l.remove(curr);
                }
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
