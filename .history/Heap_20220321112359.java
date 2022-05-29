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
    public void push(int index, int val){
        minheap.add(new ValueIndexPair(val, index));
    }
    private void lazyDeletion(){
        while(minheap.size()!=0 && deleteSet.contains(minheap.peek().index)){
            ValueIndexPair pair = minheap.poll();
            deleteSet.remove(pair.index);
        }
    }
    public ValueIndexPair top(){
        lazyDeletion();
        return minheap.peek();
    }
}
