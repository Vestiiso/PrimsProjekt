package com.PrimsProjekt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Denne class er i høj grad opbygget ud fra vejledningen i videoen "AdjacencyGraph" der ligger på kursets moodle side

        ///*
        //lav adjacency Graph
        AdjacencyListGraph adjgraph = new AdjacencyListGraph();


        //Lav vertices
        Vertex ekstraV = new Vertex("ekstraV");
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
        adjgraph.addVertex(ekstraV);
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
        adjgraph.addUnDirectedEdge(Eskildstrup, Maribo, 28);
        adjgraph.addUnDirectedEdge(Eskildstrup, NykøbingF, 13);
        adjgraph.addUnDirectedEdge(Eskildstrup, Vordingborg, 24);

        adjgraph.addUnDirectedEdge(Haslev, Korsør, 60);
        adjgraph.addUnDirectedEdge(Haslev, Køge, 24);
        adjgraph.addUnDirectedEdge(Haslev, Næstved, 25);
        adjgraph.addUnDirectedEdge(Haslev, Ringsted, 19);
        adjgraph.addUnDirectedEdge(Haslev, Roskilde, 47);
        adjgraph.addUnDirectedEdge(Haslev, Slagelse, 48);
        adjgraph.addUnDirectedEdge(Haslev, Sorø, 34);
        adjgraph.addUnDirectedEdge(Haslev, Vordingborg, 40);

        adjgraph.addUnDirectedEdge(Holbæk, Jægerspris, 34);
        adjgraph.addUnDirectedEdge(Holbæk, Kalundborg, 44);
        adjgraph.addUnDirectedEdge(Holbæk, Korsør, 66);
        adjgraph.addUnDirectedEdge(Holbæk, Ringsted, 36);
        adjgraph.addUnDirectedEdge(Holbæk, Roskilde, 32);
        adjgraph.addUnDirectedEdge(Holbæk, Slagelse, 46);
        adjgraph.addUnDirectedEdge(Holbæk, Sorø, 34);

        adjgraph.addUnDirectedEdge(Jægerspris, Korsør, 95);
        adjgraph.addUnDirectedEdge(Jægerspris, Køge, 58);
        adjgraph.addUnDirectedEdge(Jægerspris, Ringsted, 56);
        adjgraph.addUnDirectedEdge(Jægerspris, Roskilde, 33);
        adjgraph.addUnDirectedEdge(Jægerspris, Slagelse, 74);
        adjgraph.addUnDirectedEdge(Jægerspris, Sorø, 63);

        adjgraph.addUnDirectedEdge(Kalundborg, Ringsted, 62);
        adjgraph.addUnDirectedEdge(Kalundborg, Roskilde, 70);
        adjgraph.addUnDirectedEdge(Kalundborg, Slagelse, 39);
        adjgraph.addUnDirectedEdge(Kalundborg, Sorø, 51);

        adjgraph.addUnDirectedEdge(Korsør, Næstved, 45);
        adjgraph.addUnDirectedEdge(Korsør, Ringsted, 28);

        adjgraph.addUnDirectedEdge(Køge, Næstved, 45);
        adjgraph.addUnDirectedEdge(Køge, Ringsted, 28);
        adjgraph.addUnDirectedEdge(Køge, Roskilde, 25);
        adjgraph.addUnDirectedEdge(Køge, Vordingborg, 60);

        adjgraph.addUnDirectedEdge(Maribo, Nakskov, 27);
        adjgraph.addUnDirectedEdge(Maribo, NykøbingF, 26);

        adjgraph.addUnDirectedEdge(Næstved, Roskilde, 57);
        adjgraph.addUnDirectedEdge(Næstved, Ringsted, 26);
        adjgraph.addUnDirectedEdge(Næstved, Slagelse, 37);
        adjgraph.addUnDirectedEdge(Næstved, Sorø, 32);
        adjgraph.addUnDirectedEdge(Næstved, Vordingborg, 28);

        adjgraph.addUnDirectedEdge(Ringsted, Roskilde, 31);
        adjgraph.addUnDirectedEdge(Ringsted, Sorø, 15);
        adjgraph.addUnDirectedEdge(Ringsted, Vordingborg, 58);

        adjgraph.addUnDirectedEdge(Slagelse, Sorø, 14);


        adjgraph.printGraph();

        //Følgende kode er lavet ud fra fremgangsmåden i denne video fra moodle: https://www.youtube.com/watch?v=Ui15O4fmIbI
        //opret minHeap
        MinHeap<ByVertex> byerMinHeap = new MinHeap<>();

        ByVertex A = new ByVertex(ekstraV, 0, null);
        ByVertex B = new ByVertex(Jægerspris, Integer.MAX_VALUE, null);
        ByVertex C = new ByVertex(Kalundborg, Integer.MAX_VALUE, null);
        ByVertex D = new ByVertex(Holbæk, Integer.MAX_VALUE, null);
        ByVertex E = new ByVertex(Sorø, Integer.MAX_VALUE, null);
        ByVertex F = new ByVertex(Ringsted, Integer.MAX_VALUE, null);
        ByVertex G = new ByVertex(Roskilde, Integer.MAX_VALUE, null);
        ByVertex H = new ByVertex(Slagelse, Integer.MAX_VALUE, null);
        ByVertex I = new ByVertex(Korsør, Integer.MAX_VALUE, null);
        ByVertex J = new ByVertex(Køge, Integer.MAX_VALUE, null);
        ByVertex K = new ByVertex(Haslev, Integer.MAX_VALUE, null);
        ByVertex L = new ByVertex(Næstved, Integer.MAX_VALUE, null);
        ByVertex M = new ByVertex(Vordingborg, Integer.MAX_VALUE, null);
        ByVertex N = new ByVertex(Eskildstrup, Integer.MAX_VALUE, null);
        ByVertex O = new ByVertex(NykøbingF, Integer.MAX_VALUE, null);
        ByVertex P = new ByVertex(Maribo, Integer.MAX_VALUE, null);
        ByVertex Q = new ByVertex(Nakskov, Integer.MAX_VALUE, null);

        byerMinHeap.Insert(A);
        byerMinHeap.Insert(B);
        byerMinHeap.Insert(C);
        byerMinHeap.Insert(D);
        byerMinHeap.Insert(E);
        byerMinHeap.Insert(F);
        byerMinHeap.Insert(G);
        byerMinHeap.Insert(H);
        byerMinHeap.Insert(I);
        byerMinHeap.Insert(J);
        byerMinHeap.Insert(K);
        byerMinHeap.Insert(L);
        byerMinHeap.Insert(M);
        byerMinHeap.Insert(N);
        byerMinHeap.Insert(O);
        byerMinHeap.Insert(P);
        byerMinHeap.Insert(Q);

        System.out.println("___________________________________________ \n");
        System.out.println("Byer i vores minHeap: \n");

        //print minHeap
        while (!byerMinHeap.isEmpty()) {
            System.out.println(byerMinHeap.extractMin().getNavn());
        }

        System.out.println("\n");

        //Opret mstSet
        ArrayList<ByVertex> mstSet = new ArrayList<>();

        //nedenstående kode lavet ud fra fremgangsmåden i denne video fra moodle: https://www.youtube.com/watch?v=sEIRzWY34uQ&t=65s


        while (byerMinHeap.isEmpty()) {
            ByVertex u = byerMinHeap.extractMin();
            for (int v = 0; v < adjgraph.size(); v++) {//her går det muligvis galt ved 22:22 i videoen, har prøvet men ved ikke om det passer
                //if(u.getKey() == 1 && u.getKey()<) { //23:51 heller ikke sikker på u.getkey ... denne linje ermuligvis ikke nødvendig da vi ikke laver matrix
                
                }
            }
        }

    }
}
