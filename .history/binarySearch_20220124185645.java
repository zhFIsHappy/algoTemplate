public class binarySearch{

    int binarySearch(int[] numb, int target){
    if(numb.length == 0||numb==null){
        return -1;
    }
    int start = 0;
    int end = numb.length-1;
    while (start+1<end){
        int mid = start+(end-start)/2;
        if (numb[mid]==target){
            return mid;
        }else if(numb[mid]<target){
            start = mid;
        }else{
            end = mid;
        }
    }
    if(numb[start]== target){
        return start;
    }
    if (numb[end]== target){
        return end;
    }
    return -1;
}
}
