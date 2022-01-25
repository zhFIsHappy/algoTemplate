public class mergeSort{
    public void sortIntegers(int[] A){
        if(A==null || A.length ==0) return;
        int[] temp = new int[A.length];
        mergeSort(A,0,A.length-1,temp);
    }
}