class Solution {
    Map<Character,String> map;
    List<String> ans;
    public List<String> letterCombinations(String digits) {
        if(digits.equals(""))return new ArrayList<>();
        map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        ans=new ArrayList<>();

        backtrack(0,"",digits);
        return ans;
    }
    public void backtrack(int i,String subans,String d){
        if(i>=d.length()){
            ans.add(subans);
            return;
        }
        String options=map.getOrDefault(d.charAt(i),"");
        System.out.println(options);
        if(options.equals(""))return;
        for(char c:options.toCharArray()){
            subans+=c;
            backtrack(i+1,subans,d);
            subans=subans.substring(0,subans.length()-1);
        }
    }

}
