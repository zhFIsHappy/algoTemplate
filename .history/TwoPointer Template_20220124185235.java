public void partition(int[] A, int start, int end){
    if(start >= end){
        return;
    }
    int left = start;
    int right = end;
    int pivot = A[(start+end)/2];
    while(left<= right){
        while(left<= right&& A[left]<pivot){
            left++;
        }
        while(left<=right&&A[right]>pivot){
            right--;
        }
        if(left<= right){
            int temp = A[left]
        }
    }
}