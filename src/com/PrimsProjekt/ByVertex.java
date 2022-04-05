package com.PrimsProjekt;

public class ByVertex implements Comparable<ByVertex> {

    private Vertex navn;
    private Integer key;
    private Vertex parent;

    public ByVertex(Vertex navn, int key, Vertex parent) {
        this.navn = navn;
        this.key = key;
        this.parent = parent;
    }

    //Getters & setters:

    public String getNavn() {
        return navn.getName();
    }

    public void setNavn(Vertex navn) {
        this.navn = navn;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    @Override //obligatorisk fordi implementerer Comparable
    public int compareTo(ByVertex bv) {
        return this.key.compareTo(bv.key);
    }
}
