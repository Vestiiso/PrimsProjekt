package com.PrimsProjekt;

public class Main {

    public static void main(String[] args) {
	// Adjacency Graph

        //Lav vertices
        AdjacencyListGraph adjgraph = new AdjacencyListGraph();
        Vertex A = new Vertex("0");
        Vertex B = new Vertex("1");
        Vertex C = new Vertex("2");
        Vertex D = new Vertex("3");
        Vertex E = new Vertex("4");
        Vertex F = new Vertex("5");
        Vertex G = new Vertex("6");

        adjgraph.addVertex(A);
        adjgraph.addVertex(B);
        adjgraph.addVertex(C);
        adjgraph.addVertex(D);
        adjgraph.addVertex(E);
        adjgraph.addVertex(F);
        adjgraph.addVertex(G);

        //Lav edges
        adjgraph.newEdge(A, B, 1);
        adjgraph.newEdge(A, C, 5);
        adjgraph.newEdge(A, E, 3);
        adjgraph.newEdge(B, E, 1);
        adjgraph.newEdge(B, F, 7);
        adjgraph.newEdge(C, D, 1);
        adjgraph.newEdge(D, E, 1);
        adjgraph.newEdge(D, G, 1);
        adjgraph.newEdge(E, C, 1);
        adjgraph.newEdge(E, D, 3);
        adjgraph.newEdge(E,F, 3);
        adjgraph.newEdge(E, G, 4);
        adjgraph.newEdge(F, G, 1);

        adjgraph.printGraph();
    }
}
