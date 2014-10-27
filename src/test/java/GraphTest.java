
import Graph.Graph;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author opti
 */
public class GraphTest {
    
    public GraphTest() {
    }
    
    @Test
    public void testGraph() {
        Graph graph = new Graph();
        Assert.assertNotNull(graph);
    }


}
