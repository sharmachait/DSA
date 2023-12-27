public class Solution {
  //brute force
    public int[] nextGreater(int[] A) {
        for(int i=0;i<A.length;i++){
            int f=0;
            for(int j=i+1;j<A.length;j++){
                if(A[j]>A[i]){
                    f=1;
                    A[i]=A[j];
                    break;
                }
            }
            if(f==0)A[i]=-1;
        }
        A[A.length-1]=-1;
        return A;
    }

  //stack

  public int[] nextGreater(int[] A) {
        Stack<Integer> st=new Stack<>();
        st.push(A[A.length-1]);
        for(int i=A.length-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=A[i]){
               st.pop();
            }
            if(st.isEmpty()){
                st.push(A[i]);
                A[i]=-1;
            }
            else{
                int t=st.peek();
                st.push(A[i]);
                A[i]=t;
            }
        }
        A[A.length-1]=-1;
        return A;
    }
}
