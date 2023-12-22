class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        int i=0;
        int j=0;
        List<int[]> ans=new ArrayList<>();
        while(i<a.length && j<b.length){
            int[] c=new int[2];
            c[0]=Math.max(a[i][0],b[j][0]);
            c[1]=Math.min(a[i][1],b[j][1]);
            if(c[1]>=c[0])
                ans.add(c);
            if(c[1]==a[i][1]) i++;
            else j++;
        }
        System.out.println(ans.size());
        for(int[] x:ans){
            System.out.println(x[0]+ " " + x[1]);
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}
