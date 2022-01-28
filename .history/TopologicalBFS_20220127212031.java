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
            for(Node neighbor : node.getNeighors()){
                indegrees.put(neighbor, indegree.get(neighbor)-1);
                if(indegree.get(neighbor)==0){
                    queue.offer(neighbor);
                }
            }
        }
        if(topoOrder.size() != nodes.size()){
            return 没有topological;
        }
        return topoOrder;
    }

    Map<Node,Integer> getIndegrees(List<Node> nodes){
        Map<Node, Integer> counter = new HashMap<>();
        for(Node node : nodes){
            counter.put(node,0);
        }
    }
}