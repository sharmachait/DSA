class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String i:strs){
            char[] c=i.toCharArray();
            Arrays.sort(c);
            String key=Arrays.toString(c);
            List<String> ana=map.getOrDefault(key,new ArrayList<>());
            ana.add(i);
            map.put(key,ana);
        }
        return new ArrayList<>(map.values());
    }
}
