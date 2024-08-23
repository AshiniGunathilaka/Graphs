/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.LinkedList;

/**
 *
 * @author ashin
 */
public class DFS {

    /**
     * @param args the command line arguments
     */

    private LinkedList<Integer>[] adjList;
    private int vertices;

    // Constructor
    public DFS(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge
    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source); // for undirected graph
    }

    // DFS traversal
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        dfsRec(start, visited);
    }

    // Recursive DFS function
    private void dfsRec(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                dfsRec(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("DFS starting from vertex 0:");
        graph.dfs(0);
    }
}
