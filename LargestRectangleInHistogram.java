class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==1)return heights[0];
        int a[]=new int[heights.length];
        int b[]=new int[heights.length];
        for(int i=0;i<a.length;i++) a[i]=heights[i];
        for(int i=0;i<a.length;i++) b[i]=heights[i];
        NSL(a);
        NSR(b);
        int max=-1;
        for(int i=0;i<heights.length;i++){
            int width=(b[i]-a[i]-1);
            heights[i]=width*heights[i];
            max=Math.max(max,heights[i]);
        }
        return max;
    }
    public void NSL(int a[]){
        Stack<int[]> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && st.peek()[0]>=a[i])st.pop();
            if(st.isEmpty()) {
                st.push(new int[]{a[i],i});
                a[i]=-1;
            }else{
                int t[]=st.peek();
                st.push(new int[]{a[i],i});
                a[i]=t[1];
            }
        }
    }
    public void NSR(int a[]){
        Stack<int[]> st=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()[0]>=a[i])st.pop();
            if(st.isEmpty()){
                st.push(new int[]{a[i],i});
                a[i]=a.length;                
            }else{
                int t[]=st.peek();
                st.push(new int[]{a[i],i});
               a[i]=t[1];
            }
        }
    }
}
