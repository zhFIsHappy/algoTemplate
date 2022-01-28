public class TopologicalBFS {
    List<Node> topologicalSort(List<Node> nodes){
        Map<Node,Integer> indegrees = getIndegrees(nodes);
        Queue <Node> queue = new ArrayDeque<Node>();
        for(Node node : nodes){
            if(indegrees.get(node)==0){
                queue.offer(node);
            }
        }
        List<Node> topoOrder = new ArrayList<>();
        while(!queue.isEmpty()){
            Node node = queue.poll();
            topoOrder.add(node);
            for(Node neighbor : node.get)
        }
    }
}
