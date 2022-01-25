public class TwoPointerTemp4 {
    ArrayList<Integer> newList = new ArrayList<Integer>();
    int i =0, j =0;
    while(i<list1.size()&&j<list2.size()){
        if(list.get(i)<list2.get(j)){
            newList.add(list1.get(i));
            i++;
        }else{
            newList.add(list2.get());
            j++;
        }
    }
    //合并上下数到newList
    while(i<list1.size()){
        newList.add(list1.get(i));
        i++;
    }
    while(j<list2.size()){
        newList.add(list2.get(j));
        j++;
    }
    return newList;
}
