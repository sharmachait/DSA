class Solution {
    List<List<Integer>> ans;
    int a[];
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        a=nums;
        backtrack(new ArrayList<>(),0);
        return ans;
    }
    public void backtrack(List<Integer> subans,int i){
        if(i>=a.length){
            ans.add(subans);
            return;
        }
        else{
            subans.add(a[i]);
            backtrack(new ArrayList<>(subans),i+1);
            subans.remove(subans.size()-1);
            backtrack(new ArrayList<>(subans),i+1);
        }
    }
}
