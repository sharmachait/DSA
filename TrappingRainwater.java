class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int l[]=new int[n];
        int r[]=new int[n];
        int water[]=new int[n];
        int max=h[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,h[i]);
            l[i]=max;
        }
        max=h[n-1];
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,h[i]);
            r[i]=max;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(l[i]>h[i] && r[i]>h[i]){
                water[i]=Math.min(r[i],l[i])-h[i];
                ans+=water[i];
            }
        }
        return ans;
    }
}
