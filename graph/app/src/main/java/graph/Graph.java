package graph;

import java.util.*;

public class Graph {

    private Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public String addVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
        return adjVertices.toString();
    }

    public void addEdges(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    String printGraph() {
        StringBuilder strBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            strBuilder.append(vertex);
            strBuilder.append(adjVertices.get(vertex));
        }

        return strBuilder.toString();
    }

    public void addEdge(String data1, String data2, int weight) {
        Vertex vertex1 = new Vertex(data1, weight);
        Vertex vertex2 = new Vertex(data2, weight);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    public List<Vertex> getAdjVertices(String data) {
        return adjVertices.get(new Vertex(data));
    }

    public void removeVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.values().forEach(list -> list.remove(vertex));
        adjVertices.remove(vertex);

    }

    public void removeEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        List<Vertex> edgeList1 = adjVertices.get(vertex1);
        List<Vertex> edgList2 = adjVertices.get(vertex2);

        if (!edgeList1.isEmpty()) {
            edgeList1.remove(vertex2);
        }

        if (!edgList2.isEmpty()) {
            edgList2.remove(vertex1);
        }
    }

    public List getVertices() {
        List<String> result = new ArrayList<>();
        for (Vertex vertex : adjVertices.keySet()) {
            result.add(vertex.toString());
            result.add(adjVertices.get(vertex).toString());
        }
        return result;
    }

    public int size() {
        return adjVertices.size();
    }

    public List<Vertex> getNeighbors(String data) {
        return adjVertices.get(new Vertex(data));
    }
    //    get neighbors

    public Collection<List<Vertex>> getNeighbors() {
        return adjVertices.values();
    }

    public HashSet<String> breadthFirstTraversal(String root) {
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : getAdjVertices(vertex)) {
                if (!visited.contains((v.data))) {
                    queue.add(v.data);
                    visited.add(v.data);
                }
            }
        }
        return visited;
    }

    public int getWeight(String element, String visited) {
        List<Vertex> list = adjVertices.get(new Vertex(element));
        int weight = 0;
        for (Vertex index :
                list) {
            System.out.println(index);
            System.out.println(visited);
            if (index.getData() == visited) {
                weight = index.getWeight();


            }
        }

        return weight;

    }

    public static int graphBusinessTrip(Graph graph, ArrayList<String> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size() - 1; i++) {

            sum += graph.getWeight(arrayList.get(i), arrayList.get(i + 1));
        }
        return sum;
    }


    public HashSet<String> depthFirst(String root) {
        HashSet<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);
        visited.add(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            for (Vertex v : this.getNeighbors(vertex)) {
                if (!visited.contains((v.getData()))) {
                    stack.push(v.getData());
                    visited.add(v.getData());
                }
            }
        }
        return visited;

    }

}
