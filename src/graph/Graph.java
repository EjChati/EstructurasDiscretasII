package graph;

import java.util.*;

public class Graph {
    private Vector<Node> nodes = new Vector<>();
    private Vector<Link> links = new Vector<>();

    public Graph() {}

    public Graph(Vector<Node> nodes, Vector<Link> links) {
        Node.resetId();
        this.nodes = nodes;
        this.links = links;
    }

    public Vector<Node> getNodeList() { return nodes; }

    public Vector<Link> getLinkList() { return links; }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Node n : nodes) { str.append(n.toString()).append("\n"); }
        return str.toString();
    }
}