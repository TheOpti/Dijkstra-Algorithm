
package Graph;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author opti
 */
public class Graph {
    
    private Set<Node> nodes;
    
    public Graph() {
        this.nodes = new HashSet<Node>();
    }
    
    public Graph(Set<Node> nodes) {
        this.nodes = nodes;
    }
    
    public Set<Node> getNodes() {
        return this.nodes;
    }
    
    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }
    
}
