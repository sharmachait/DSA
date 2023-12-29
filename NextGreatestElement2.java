//circular array
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            st.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums[i]) st.pop();
            if(st.isEmpty()) {
                st.push(nums[i]);
                nums[i]=-1;
            }
            else{
                int t=st.peek();
                st.push(nums[i]);
                nums[i]=t;
            }
        }
        return nums;
    }
}
