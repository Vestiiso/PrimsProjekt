package com.PrimsProjekt;

import java.util.ArrayList;

//Koden i denne class er lavet ud fra fremgangen beskrevet i videoen:
// - MinHeap (no recursion) (fra moodle)

public class MinHeap <T extends Comparable<T>>{
    //root is at index 0
    ArrayList<T> minheap;
    private int size;

    public MinHeap() {
        this.minheap = new ArrayList<T>();
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size > 0){
            return false;
        }
        else {
            return true;
        }
    }

    private int parent(int pos) {
        return (pos-1)/2;
    }

    private int leftChild(int pos) {
        return pos * 2 + 1;
    }

    private int rightChild(int pos) {
        return pos * 2 + 2;
    }

    private void swap(int pos1, int pos2){
        T dummy = minheap.get(pos1);
        minheap.set(pos1, minheap.get(pos2));
        minheap.set(pos2, dummy);
    }

    public  void Insert (T item) {
        minheap.add(item);
        size++;
        decreasekey(size-1); //indsætter tingen nederst i træeet, og rykker den herefter op af træet indtil det passer
    }

    public void  decreasekey(int pos) { //flytter en key op af træet
        int currentpos = pos;
        while (minheap.get(currentpos).compareTo(minheap.get(parent(currentpos)))<0) { //if the current position is smaller than parent
            swap(currentpos, parent(currentpos));
            currentpos = parent(currentpos);
        }
    }

    public  T viewMin(){
        return  minheap.get(0);
    }

    private boolean movedown(int pos) {
        boolean leftsmaller = leftChild(pos)<size
                && (minheap.get(leftChild(pos)).compareTo(minheap.get(pos))<0);
        //vi siger <size for at sørge for at den ikke tjekker childs der ikke findes i bunden af træet

        boolean rightsmaller = rightChild(pos)<size
                && (minheap.get(rightChild(pos)).compareTo(minheap.get(pos))<0);

        return leftsmaller || rightsmaller;
    }

    public void increasekey(int pos) { //flytter en key ned af træet
        int currentpos = pos;
        while (movedown(currentpos)) { //Tjekker om der er noget i 'børnene' og om en af dem er mindre end mig
            //vi ved at hvis der er noget i højre barn, må der også være noget i venstre barn pga. den rækkefølge
            //-man fylder træet op i

            int rpos = rightChild(currentpos); //vi gør bare det her for ikke at skulle skrive så meget tekst hver gang
            int lpos = leftChild(currentpos);

            if (rpos < size && minheap.get(rpos).compareTo(minheap.get(lpos))<0) {
                //replace right position
                swap(rpos, currentpos);
                currentpos = rpos;
            }
            else {
                swap(lpos, currentpos);
                currentpos = lpos;
            }
        }
    }

    public T extractMin() {
        T min = minheap.get(0);
        minheap.set(0, minheap.get(size-1)); //flytter træets sidste element til den øverste plads
        size--;
        increasekey(0);

        return min;
    }
}
