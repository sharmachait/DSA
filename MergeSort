class MergeSort{
    int[] arr;
    public MergeSort(int[] a){
        arr=a;
    }
    public void sort() {
        divide(0, arr.length - 1);
    }
    private void divide(int i, int j) {
        if(i>=j)return;
        int m=i+(j-i)/2;
        divide(i,m);
        divide(m+1,j);
        conquer(i,m,j);
    }
    private void conquer(int i, int m, int j) {
        int temp[]=new int[j-i+1];
        int tp=0,l=i,r=m+1;
        while(l<=m && r<=j){
            if(arr[l]<=arr[r])temp[tp++]=arr[l++];
            else temp[tp++]=arr[r++];
        }
        while(l<=m) temp[tp++]=arr[l++];
        while(r<=j) temp[tp++]=arr[r++];
        for(int c=0;c<temp.length;c++){
            arr[i++]=temp[c];
        }
    }
}
