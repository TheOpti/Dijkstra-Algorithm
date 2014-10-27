/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author opti
 */
public class Node {
    
    private String name;
    private List<Edge> edges;
    
    public Node(String name) {
        this.edges = new ArrayList<Edge>();
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public List<Edge> getEdges() {
        return this.edges;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
    
    public void setEdges(Edge ... edges) {
        List<Edge> edgeList = new ArrayList();
        edgeList.addAll(Arrays.asList(edges));
        this.edges = edgeList;
    }
    
    public void addNextPathWithCost(Node destination, Integer cost) {
        edges.add(new Edge(this, destination, cost));
    }
    
}
