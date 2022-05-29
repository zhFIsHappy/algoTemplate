public class Heap {
    int val, index;
    public ValueIndexPair(int val, int index){
        this.val = val;
        this.index = index;
    }
}
class Heap{
    private Queue< ValueIndexPair> minheap;
    private Set<Integer> deleteSet;
    public heap(){
        minheap = new PriorityQueue<ValueIndexPair>((p1,p2)->(p1.val-p2.val));
        deleteSet = new HashSet<Integer>();
    }
    public void 
}
