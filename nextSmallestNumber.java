class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        st.push(prices[prices.length-1]);
        for(int i=prices.length-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()>prices[i]) st.pop();
            if(st.isEmpty()){
                st.push(prices[i]);
            }
            else{
                int t=st.peek();
                st.push(prices[i]);
                prices[i]-=t;
            }
        }
        return prices;
    }
}
// leetcode 1475
