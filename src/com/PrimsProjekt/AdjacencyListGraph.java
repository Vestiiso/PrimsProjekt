package com.PrimsProjekt;

import java.util.ArrayList;

public class AdjacencyListGraph implements Comparable<AdjacencyListGraph> {
//Denne class er opbygget ud fra vejledningen i videoen "AdjacencyGraph" der ligger på kursets moodle side
    private ArrayList<Vertex> vertices;

    public  AdjacencyListGraph(){
        vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void newEdge(Vertex from, Vertex to, Integer dist) {
        if ( !(vertices.contains(from) && vertices.contains(to))) {
            System.out.println(" Vertex not found");
            return;
        }
        Edge newedge = new Edge(from, to, dist);
    }

    public void printGraph(){
        Vertex currentv;
        for (int i = 0 ; i < vertices.size() ; i++) {
            currentv = vertices.get(i); //så vi ikke skal lave vertices.get alt for meget
            System.out.println("Edges from Vertex: " + currentv.getName());
            for (int j = 0; j < currentv.getOutEdges().size(); j++) {
                Edge currente = currentv.getOutEdges().get(j);
                System.out.println(" - to: " + currente.getToVertex().getName() + ", weight: " + currente.getWeight());
            }
            System.out.println(" ");
        }
    }
}

class Vertex implements Comparable<Vertex> {
    //Så vi kan sortere //kan sorteres ud fra distance og kan derefter smides i en kø, husk når man ændrer afstanden i
    // -en kø bliver de ikke opdateret så de skal poppes ind igen

    private String Name;
    private ArrayList<Edge> outEdges;
    Integer distance = Integer.MAX_VALUE;

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex(String id) {
        this.Name = id;
        outEdges = new ArrayList<>();
    }
    public void addOutEdge (Edge outEdge) {
        outEdges.add(outEdge);
    }

    @Override
    //Følgende metode bliver brugt til sortering
    public int compareTo(Vertex o) {
        if (this.distance<o.distance)
            return -1;
        else if (this.distance>o.distance)
            return 1;
        else
            return 0;
    }

    public String getName() {
        return Name;
    }
}

class Edge {
    private Vertex fromVertex;
    private Vertex toVertex;
    private Integer weight;

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Edge(Vertex from, Vertex to, Integer cost) {
        fromVertex = from;
        toVertex = to;
        weight = cost;
        from.addOutEdge(this);

    }
}
