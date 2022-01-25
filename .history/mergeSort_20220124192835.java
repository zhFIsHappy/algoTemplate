public class mergeSort{
    public void sortIntegers(int[] A){
        if(A==null || A.length ==0) return;
        int[] temp = new int[A.length];
        mergeSort(A,0,A.length-1,temp);
    }
    private void mergeSort(int[] A, int start, int end, int[] temp){
        if(start >= end){
            return ;
        }
        mergeSort(A,start,(start+end)/2,temp);
    }
}