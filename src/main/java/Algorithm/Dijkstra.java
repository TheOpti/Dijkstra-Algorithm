
package Algorithm;

import Graph.Graph;
import Graph.GraphBuilder;
import Graph.Node;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author opti
 */
public class Dijkstra {
    
    public static void DijkstraAlgorithm() {
        Graph graph = GraphBuilder.createGraph();
        CostMatrix costMatrix = new CostMatrix(graph);
        
        Set<Node> queue = graph.getNodes();
        Set<Node> processed = new HashSet<Node>();
        
        /* main algorithm goes here */
        while (!queue.isEmpty()) {
            Node nextToProcess = costMatrix.getNearestNode(queue);
            costMatrix.update(nextToProcess);
            queue.remove(nextToProcess);
            processed.add(nextToProcess);
            
            
        }
        
        costMatrix.printCostMatrix();
    }
    
}
