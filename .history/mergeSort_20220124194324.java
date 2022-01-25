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
        mergeSort(A, (start+end)/2+1, end, temp);
        merge(A,start,end,temp);
    }
    private void merge(int[] A, int start, int end, int[] temp){
        int middle = (start +end)/2;
        int leftIndex = start;
        int rightindex = middle+1;
        int index = start;
        while(leftIndex <= middle&& rightIndex <= end){
            if(A[leftIndex] < A[rightIndex])
        }
    }
}