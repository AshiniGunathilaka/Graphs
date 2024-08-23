/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author ashin
 */
public class adjacencyList {

    /**
     * @param args the command line arguments
     */
    



    private List<List<Integer>> adjList;

    // Constructor to initialize the adjacency list
    public adjacencyList(int vertices) {
        adjList = new LinkedList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    // Add an edge between two vertices (undirected graph)
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    // Print adjacency list
    public void printAdjList() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + ": ");
            for (Integer v : adjList.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjacencyList graph = new adjacencyList(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printAdjList();
    }
}
