class Solution {
    int a[];
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        a=nums;
        ans=new HashSet<>();
        backtrack(new ArrayList<>(),0);
        return new ArrayList<>(ans);
    }
    Set<List<Integer>> ans;

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
