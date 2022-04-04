package com.PrimsProjekt;

public class Main {

    public static void main(String[] args) {
        //Denne class er i høj grad opbygget ud fra vejledningen i videoen "AdjacencyGraph" der ligger på kursets moodle side

        ///*
        //lav adjacency Graph
        AdjacencyListGraph adjgraph = new AdjacencyListGraph();

        //Lav vertices
        Vertex Jægerspris = new Vertex("Jægerspris");
        Vertex Kalundborg = new Vertex("Kalundborg");
        Vertex Holbæk = new Vertex("Holbæk");
        Vertex Sorø = new Vertex("Sorø");
        Vertex Ringsted = new Vertex("Ringsted");
        Vertex Roskilde = new Vertex("Roskilde");
        Vertex Slagelse = new Vertex("Slagelse");
        Vertex Korsør = new Vertex("Korsør");
        Vertex Haslev = new Vertex("Haslev");
        Vertex Køge = new Vertex("Køge");
        Vertex Næstved = new Vertex("Næstved");
        Vertex Vordingborg = new Vertex("Vordingborg");
        Vertex Eskildstrup = new Vertex("Eskildstrup");
        Vertex Maribo = new Vertex("Maribo");
        Vertex Nakskov = new Vertex("Nakskov");
        Vertex NykøbingF = new Vertex("NykøbingF");


        //tilføj vertices til graf
        adjgraph.addVertex(Jægerspris);
        adjgraph.addVertex(Kalundborg);
        adjgraph.addVertex(Holbæk);
        adjgraph.addVertex(Sorø);
        adjgraph.addVertex(Ringsted);
        adjgraph.addVertex(Roskilde);
        adjgraph.addVertex(Slagelse);
        adjgraph.addVertex(Korsør);
        adjgraph.addVertex(Haslev);
        adjgraph.addVertex(Køge);
        adjgraph.addVertex(Næstved);
        adjgraph.addVertex(Vordingborg);
        adjgraph.addVertex(Eskildstrup);
        adjgraph.addVertex(Maribo);
        adjgraph.addVertex(Nakskov);
        adjgraph.addVertex(NykøbingF);

        //Lav edges
        adjgraph.newEdge(Eskildstrup, Maribo, 28);
        adjgraph.newEdge(Eskildstrup, NykøbingF, 13);
        adjgraph.newEdge(Eskildstrup, Vordingborg, 24);

        adjgraph.newEdge(Haslev, Korsør, 60);
        adjgraph.newEdge(Haslev, Køge, 24);
        adjgraph.newEdge(Haslev, Næstved, 25);
        adjgraph.newEdge(Haslev, Ringsted, 19);
        adjgraph.newEdge(Haslev, Roskilde, 47);
        adjgraph.newEdge(Haslev, Slagelse, 48);
        adjgraph.newEdge(Haslev, Sorø, 34);
        adjgraph.newEdge(Haslev, Vordingborg, 40);

        adjgraph.newEdge(Holbæk, Jægerspris, 34);
        adjgraph.newEdge(Holbæk, Kalundborg, 44);
        adjgraph.newEdge(Holbæk, Korsør, 66);
        adjgraph.newEdge(Holbæk, Ringsted, 36);
        adjgraph.newEdge(Holbæk, Roskilde, 32);
        adjgraph.newEdge(Holbæk, Slagelse, 46);
        adjgraph.newEdge(Holbæk, Sorø, 34);

        adjgraph.newEdge(Jægerspris, Korsør, 95);
        adjgraph.newEdge(Jægerspris, Køge, 58);
        adjgraph.newEdge(Jægerspris, Ringsted, 56);
        adjgraph.newEdge(Jægerspris, Roskilde, 33);
        adjgraph.newEdge(Jægerspris, Slagelse, 74);
        adjgraph.newEdge(Jægerspris, Sorø, 63);

        adjgraph.newEdge(Kalundborg, Ringsted, 62);
        adjgraph.newEdge(Kalundborg, Roskilde, 70);
        adjgraph.newEdge(Kalundborg, Slagelse, 39);
        adjgraph.newEdge(Kalundborg, Sorø, 51);

        adjgraph.newEdge(Korsør, Næstved, 45);
        adjgraph.newEdge(Korsør, Ringsted, 28);

        adjgraph.newEdge(Køge, Næstved, 45);
        adjgraph.newEdge(Køge, Ringsted, 28);
        adjgraph.newEdge(Køge, Roskilde, 25);
        adjgraph.newEdge(Køge, Vordingborg, 60);

        adjgraph.newEdge(Maribo, Nakskov, 27);
        adjgraph.newEdge(Maribo, NykøbingF, 26);

        adjgraph.newEdge(Næstved, Roskilde, 57);
        adjgraph.newEdge(Næstved, Ringsted, 26);
        adjgraph.newEdge(Næstved, Slagelse, 37);
        adjgraph.newEdge(Næstved, Sorø, 32);
        adjgraph.newEdge(Næstved, Vordingborg, 28);

        adjgraph.newEdge(Ringsted, Roskilde, 31);
        adjgraph.newEdge(Ringsted, Sorø, 15);
        adjgraph.newEdge(Ringsted, Vordingborg, 58);

        adjgraph.newEdge(Slagelse, Sorø, 14);

        adjgraph.printGraph();


        //video her: https://www.youtube.com/watch?v=Ui15O4fmIbI
        //hendes student class kommer fra bubble sort videoen
        //hendes student class er åbenbart en helt seperat ting der indeholder en string, int og en char
        //MinHeap<x> xMinHeap = new MinHeap<x>();

        //tror jeg har svaret:
        // - når du udfører prims, laver du jo et mstSet, en form for liste, og det er jo den liste du skal putte ind i
        // - din minheap, så der er slet ikke grund til at putte direkte fra listen ind i heapen


        //*/
    }
}
