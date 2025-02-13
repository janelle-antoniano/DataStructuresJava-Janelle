import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int src, int dest) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());
        adjList.get(src).add(dest);
    }

    public void printGraph() {
        for (int node : adjList.keySet()) {
            System.out.println(node + " -> " + adjList.get(node));
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.printGraph();
    }
}
