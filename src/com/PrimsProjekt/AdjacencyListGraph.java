package com.PrimsProjekt;

import java.util.ArrayList;

public class AdjacencyListGraph {
//Denne class er opbygget ud fra vejledningen i videoen "AdjacencyGraph" der ligger på kursets moodle side
    private ArrayList<Vertex> vertices;


}

class Vertex implements Comparable<Vertex> { //Så vi kan sortere
    private String Name;
    private ArrayList<Edge> outEdges;
    Integer distance = Integer.MAX_VALUE;

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
}

class Edge {
    private Vertex fromVertex;
    private Vertex toVertex;
    private Integer weight;

    public Edge(Vertex from, Vertex to, Integer cost) {
        fromVertex = from;
        toVertex = to;
        weight = cost;

    }
}
