
package Algorithm;

import Graph.Edge;
import Graph.Graph;
import Graph.Node;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author opti
 */
public class CostMatrix {
    
    private static final Integer MAX_INT_VALUE = Integer.MAX_VALUE;
    
    /* Node, Integer : smallest cost leading to given node */
    private Map<Node, Integer> smallestCosts;
    
    /* Node, Predecessor : predecessor on path to given node */
    private Map<Node, Node> predecessors;
    
    /* Graph */
    private Graph graph;
    
    public CostMatrix(Graph graph) {
        this.smallestCosts = new HashMap<>();
        this.predecessors = new HashMap<>();
        this.graph = graph;
        initializeMatrix();
    }
    
    public Map<Node, Integer> getSmallestCosts() {
        return this.smallestCosts;
    }
    
    public Map<Node, Node> getPredecessors() {
        return this.predecessors;
    }
    
    private void initializeMatrix() {
        for (Node node : graph.getNodes()) {
            smallestCosts.put(node, MAX_INT_VALUE);
            predecessors.put(node, null);
        }
        markAsStartingNode(graph.getNodes().iterator().next());
    }
    
    public void updateSmallestCost(Node toUpdate, Integer newCost) {
        if (this.smallestCosts.containsKey(toUpdate)) {
            this.smallestCosts.put(toUpdate, newCost);
        }
    }
    
    public void updatePredecessorOnPath(Node toUpdate, Node nextPrevious) {
        if (this.predecessors.containsKey(toUpdate)) {
            this.predecessors.put(toUpdate, nextPrevious);
        }
    }
    
    public void markAsStartingNode(Node node) {
        this.smallestCosts.put(node, 0);
        this.predecessors.put(node, null);
    }
    
    public Node getNearestNode(Set<Node> nodes) {
        Integer minCost = MAX_INT_VALUE;
        Node nextToProcess = null;
        for (Node node : nodes) {
            Integer cost = smallestCosts.get(node);
            if (cost < minCost) {
                nextToProcess = node;
                minCost = cost;
            }
        }
        return nextToProcess;
    }
    
    public void update(Node nextToProcess) {
        List<Edge> edges = nextToProcess.getEdges();
        for (Edge edge : edges) {
            Node direction = edge.getTo();
            Integer cost = edge.getCost();
            if (smallestCosts.get(nextToProcess) + cost < smallestCosts.get(direction)) {
                Integer newCost = smallestCosts.get(nextToProcess) + cost;
                updateSmallestCost(direction, newCost);
                updatePredecessorOnPath(direction, nextToProcess);
            }
        }
    }
    
    public void printCostMatrix() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Cost Matrix:\n");
        
        
        //TODO write matrix
        
    }
    
}
