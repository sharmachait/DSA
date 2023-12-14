public class Solution {
    public static long getInversions(long arr[], int n) {
        a=arr;
        ans=0;
        divide(0,a.length-1);
        return ans;
    }
    static long a[];
    static int ans;
    public static void divide(int i,int j){
        if(i>=j)return;
        int m=i+(j-i)/2;
        divide(i,m);
        divide(m+1,j);
        conquer(i,m,j);
    }
    public static void conquer(int i,int m,int j){
        long t[]=new long[j-i+1];
        int tp=0;
        int l=i;
        int r=m+1;
        while(l<=m && r<=j){
            if(a[l]<a[r]){
                t[tp++]=a[l++];
            }
            else{
                ans+=m+1-(l);
                t[tp++]=a[r++];
            }
        }
        while(l<=m) t[tp++]=a[l++];
        while(r<=j) t[tp++]=a[r++];
        
        for(int c=0;c<t.length;c++){
            a[i++]=t[c];
        }
    }
}
