//leetcode 85
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row[][]=new int[matrix.length][matrix[0].length];
        int max=-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0){
                    if(matrix[i][j]=='0')row[i][j]=0;
                    else row[i][j]=1;
                }
                else{
                    if(matrix[i][j]=='0')row[i][j]=0;
                    else{
                        row[i][j]=row[i-1][j]+1;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            max=Math.max(max,MAH(row[i]));
        }
        return max;
    }
    public int MAH(int a[]){
        if(a.length==1)return a[0];
        int nsl[]=new int[a.length];
        int nsr[]=new int[a.length];
        for(int i=0;i<a.length;i++) nsl[i]=a[i];
        for(int i=0;i<a.length;i++) nsr[i]=a[i];
        NSR(nsr);
        NSL(nsl);
        int max=-1;
        for(int i=0;i<a.length;i++){
            int width=nsr[i]-nsl[i]-1;
            a[i]=a[i]*width;
            max=Math.max(max,a[i]);
        }
        System.out.println("max area for row "+max);
        return max;
    }
    public void NSL(int a[]){
        Stack<int[]> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && st.peek()[0]>=a[i]) st.pop();
            if(st.isEmpty()){
                st.push(new int[]{a[i],i});
                a[i]=-1;
            }
            else{
                int t[]=st.peek();
                st.push(new int[]{a[i],i});
                a[i]=t[1];
            }
        }
    }
    public void NSR(int a[]){
        Stack<int[]> st=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()[0]>=a[i]) st.pop();
            if(st.isEmpty()){
                st.push(new int[]{a[i],i});
                a[i]=a.length;
            }
            else{
                int[] t=st.peek();
                st.push(new int[]{a[i],i});
                a[i]=t[1];
            }
        }
    }
}
