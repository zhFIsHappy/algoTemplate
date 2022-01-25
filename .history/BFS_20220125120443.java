public class BFS {
    ReturnType bfs(Node startNode){
        // BFS 必须用queue!!!!!!
        Queue<Node> queue = new ArrayDeque<Node>();
        // HashMap 有两个作用 1.是记录一个点是否倍丢进队列了，避免重复访问
        // 另一个是记录startNode 到其他所有节点的最短距离
        // 如果只求连通性的话， 换成HashSet就可以
        // node 做 key 比较的是内存地址
        Map<Node, Integer> distance = new HashMap<>();
        queue.offer(startNode);
        distance.put(startNode,0);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node 是终点){
                break or return sth
            }
            for(Node neighbor : node.getNeighors()){
                if(distance.containsKey(neighbor)){
                    continue;
                }
                queue.offer(neighbor)
            }
        }
    }
}
