class Solution {
    public int[][] insert(int[][] I, int[] ni) {
        int i=0;
        int n=I.length;
        List<int[]> l=new ArrayList<>();
        while(i<n && I[i][1]<ni[0])
            l.add(I[i++]);
        while(i<n && I[i][0]<=ni[1]){
            ni[0]=Math.min(ni[0],I[i][0]);
            ni[1]=Math.max(ni[1],I[i][1]);
            i++;
        }
        l.add(ni);
        while(i<n)
            l.add(I[i++]);
        int ans[][]=new int[l.size()][2];
        i=0;
        for(i=0;i<l.size();i++){
            System.out.println(l.get(i)[0]+" "+l.get(i)[1]);
            ans[i]=l.get(i);
        }
        return ans;
    }
}
