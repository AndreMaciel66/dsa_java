package graph;

public class Main {

    public static void main(String[] args) {

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");
        myGraph.addEdge("D", "A");
        myGraph.addEdge("D", "B");
        myGraph.addEdge("D", "C");

        myGraph.removeVertex("D");

        System.out.println("\nGraph:");
        myGraph.printGraph();

        /*
            EXPECTED OUTPUT:
            ----------------
            Graph:
            {A=[], B=[]}

        */

    }

}
