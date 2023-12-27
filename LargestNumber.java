class Solution {
    class MyComparer implements Comparator<Integer>{
        @Override
        public int compare(Integer a,Integer b){
            int ai=a.intValue();
            int bi=b.intValue();
            String xy=ai+""+bi;
            String yx=bi+""+ai;
            return yx.compareTo(xy);
        }
    }
    public String largestNumber(int[] nums) {
        Integer []a=new Integer[nums.length];
        for(int i=0;i<nums.length;i++)a[i]=nums[i];
        Arrays.sort(a,new MyComparer());
        String s="";
        for(int x:a) s+=x;
        if(s.charAt(0)=='0')return "0";
        return s;
    }
}
