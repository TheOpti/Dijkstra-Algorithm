/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author opti
 */
public class Edge {
    
    private Node from;
    private Node to;
    private Integer cost;
    
    public Edge() {
        
    }
    
    public Edge(Node from, Node to) {
        this.from = from;
        this.to = to;
    }
    
    public Node getFrom() {
        return this.from;
    }
    
    public Node getTo() {
        return this.to;
    }
    
    public Integer getCost() {
        return this.cost;
    }
    
    public void setFrom(Node from) {
        this.from = from;
    }
    
    public void setTo(Node to) {
        this.to = to;
    }
    
    
}
