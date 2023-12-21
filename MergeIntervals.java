class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> l=new ArrayList<>();
        for(int[] a:intervals){
            l.add(a);
        }
        Collections.sort(l,(a,b)->Integer.compare(a[0],b[0]));
        int i=1;
        while(i<l.size()){
            System.out.println();
            int[] curr=l.get(i);
            int[] prev=l.get(i-1);
            
            //check for over lap
            if(curr[0]<=prev[1]){
                System.out.println(curr[0]+"curr end and prev start"+prev[1]);
                for(int j:prev)
                    System.out.print(j+" ");
                System.out.println();
                for(int j:curr)
                    System.out.print(j+" ");
                System.out.println();

                curr[0]=Math.min(curr[0],prev[0]);
                curr[1]=Math.max(curr[1],prev[1]);
                l.remove(prev);
            
            }else{
                i++;
            }
        }
        int[][] ans=new int[l.size()][2];
        for(i=0;i<l.size();i++)
            ans[i]=l.get(i);
        return ans;
    }
}
