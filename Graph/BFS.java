package Graph;

import java.util.*;

public class BFS {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static ArrayList<Edge>[] createGraph(int v) {
        @SuppressWarnings("unchecked")

        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 35));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 2, 2));
        // graph[4].add(new Edge(4, 5, 5));

        graph[5].add(new Edge(5, 6, 1));

        graph[5].add(new Edge(6, 5, 1));
        return graph;
    }

    public static void bfsTraversalConnectedComponenets(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                bfsUtil(graph, visited, i);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visited, int i) {

        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {// if visited false
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int j = 0; j < graph[curr].size(); j++) {
                    Edge e = graph[curr].get(j);
                    q.add(e.dest);
                }

            }
        }
    }

    public static void BFSTraversal(ArrayList<Edge>[] graph) {

        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {// if visited false
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }

    public static void main(String[] args) {
        int numberOfVertex = 7;
        ArrayList<Edge>[] graph = createGraph(numberOfVertex);
        BFSTraversal(graph);
        System.out.println();
        bfsTraversalConnectedComponenets(graph);
    }
}
