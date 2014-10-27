
package Graph;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author opti
 */
public class GraphBuilder {
    
    /**
     * 
     * Creates sample graph 
     */
    public static Graph createGraph() {
        Graph graph = new Graph();
        
        /*
            Graph from here:
            http://www.reviewmylife.co.uk/data/2008/0715/dijkstras-graph.gif
        */
        
        Set<Node> nodes = new HashSet<Node>();
        
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        
        nodeA.addNextPathWithCost(nodeC, 1);
        nodeC.addNextPathWithCost(nodeA, 1);
        nodeA.addNextPathWithCost(nodeD, 2);
        nodeD.addNextPathWithCost(nodeA, 2);
        nodeC.addNextPathWithCost(nodeB, 2);
        nodeB.addNextPathWithCost(nodeC, 2);
        nodeC.addNextPathWithCost(nodeE, 3);
        nodeE.addNextPathWithCost(nodeC, 3);
        nodeC.addNextPathWithCost(nodeD, 1);
        nodeD.addNextPathWithCost(nodeC, 1);
        nodeE.addNextPathWithCost(nodeF, 2);
        nodeF.addNextPathWithCost(nodeE, 2);
        nodeD.addNextPathWithCost(nodeG, 1);
        nodeG.addNextPathWithCost(nodeD, 1);
        nodeG.addNextPathWithCost(nodeF, 1);
        nodeF.addNextPathWithCost(nodeG, 1);
        nodeB.addNextPathWithCost(nodeF, 3);
        nodeF.addNextPathWithCost(nodeB, 3);
        
        nodes.add(nodeA);
        nodes.add(nodeB);
        nodes.add(nodeC);
        nodes.add(nodeD);
        nodes.add(nodeE);
        nodes.add(nodeF);
        nodes.add(nodeG);
        
        graph.setNodes(nodes);
        
        
        return graph;
    }
    
}
