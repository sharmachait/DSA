class QuickSort<E>{
    E[] arr;
    public void swap(int from, int to){
        System.out.println(from);
        System.out.println(to);
        E t=arr[from];
        arr[from]=arr[to];
        arr[to]=t;
    }
    public E[] sort(E[] a){
        this.arr=a;
        quicksort(0,arr.length-1);
        return this.arr;
    }
    private void quicksort(int s, int e) {
        if(s>=e)return;
        E val=arr[e];
        int firstThingLargerThanPivot=0;

        for(int iterator=0;iterator<e;){
            if(((Comparable<E>)arr[iterator]).compareTo(val)>0){
                iterator++;
            }
            else{
                swap(firstThingLargerThanPivot,iterator);
                firstThingLargerThanPivot++;
                iterator++;
            }
        }
        swap(firstThingLargerThanPivot,e);
        quicksort(s,firstThingLargerThanPivot-1);
        quicksort(firstThingLargerThanPivot+1,e);
    }
}
