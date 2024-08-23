/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ashin
 */
public class adjacencyMatrix {

    /**
     * @param args the command line arguments
     */

    private int[][] adjMatrix;

    // Constructor to initialize adjacency matrix
    public adjacencyMatrix(int vertices) {
        adjMatrix = new int[vertices][vertices];
    }

    // Add an edge between two vertices (undirected graph)
    public void addEdge(int source, int destination) {
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }

    // Print adjacency matrix
    public void printAdjMatrix() {
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjacencyMatrix graph = new adjacencyMatrix(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printAdjMatrix();
    }
}
