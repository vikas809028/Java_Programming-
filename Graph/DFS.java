package Graph;

import java.util.*;

public class DFS {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static ArrayList<Edge>[] createGraph(int V) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        int weight = 1;

        // neighbour of 0
        graph[0].add(new Edge(0, 1, weight));
        graph[0].add(new Edge(0, 2, weight));

        // neighbour of 1
        graph[1].add(new Edge(1, 0, weight));
        graph[1].add(new Edge(1, 3, weight));

        // neighbour of 2
        graph[2].add(new Edge(2, 0, weight));
        graph[2].add(new Edge(2, 4, weight));

        // neighbour of 3
        graph[3].add(new Edge(3, 1, weight));
        graph[3].add(new Edge(3, 4, weight));
        graph[3].add(new Edge(3, 5, weight));

        // neighbour of 4
        graph[4].add(new Edge(4, 2, weight));
        graph[4].add(new Edge(4, 5, weight));

        // neighbour of 5
        graph[5].add(new Edge(5, 3, weight));
        graph[5].add(new Edge(5, 4, weight));
        graph[5].add(new Edge(5, 6, weight));

        // neighbour of 6
        graph[6].add(new Edge(6, 5, weight));

        return graph;
    }

    public static void neighbourOf(ArrayList<Edge>[] graph, int v) {
        for (int i = 0; i < graph[v].size(); i++) {
            Edge e = graph[v].get(i);
            System.out.print(e.dest + " ");
        }
    }

    public static void dfsTraversalConnectedComponenets(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfsUtil(graph, visited, i);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, boolean visited[], int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                DFSTraversal(graph, visited, e.dest);
            }
        }

    }

    public static void DFSTraversal(ArrayList<Edge>[] graph, boolean visited[], int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                DFSTraversal(graph, visited, e.dest);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = createGraph(7);
        neighbourOf(graph, 5);
        System.out.println();
        System.out.print("Graph Traversal : ");
        DFSTraversal(graph, new boolean[7], 0);
        System.out.println();
        dfsTraversalConnectedComponenets(graph);
    }
}
