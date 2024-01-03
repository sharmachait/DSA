class Solution {
    public int numberOfBeams(String[] bank) {
        if(bank.length==1)return 0;
        int prev=count(bank[0]);
        int curr=0;
        int ans=0;
        for(int i=1;i<bank.length;i++){
            curr=count(bank[i]);
            ans+=prev*curr;
            if(curr>0)prev=curr;
        }
        return ans;
    }
    public int count(String s){
        char c[]=s.toCharArray();
        int freq=0;
        for(char x:c){
            if(x=='1')freq++;
        }
        return freq;
    }
}
