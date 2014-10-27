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
    
    public Edge(Node from, Node to, Integer cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
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
    
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    
    public Edge withFrom(Node from) {
        setFrom(from);
        return this;
    }
    
    public Edge withTo(Node to) {
        setTo(to);
        return this;
    }
    
    public Edge withCost(Integer cost) {
        setCost(cost);
        return this;
    }
    
}
