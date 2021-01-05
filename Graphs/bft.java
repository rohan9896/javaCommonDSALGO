package Graphs;

import java.util.*;

public class bft {

    public static void bftraversal(int[][] adjMatrix, int source, boolean[] visited, Queue<Integer> pendingVertices){
        visited[source] = true;
        pendingVertices.add(source);

        //take out a vertex from queue, print it and explore its unvisited neighbours
        while(!pendingVertices.isEmpty()){
            int currentVertex = pendingVertices.poll();
            System.out.print(currentVertex+" ");
            for(int i = 0; i < adjMatrix.length;i++){
                if(adjMatrix[currentVertex][i] == 1 && visited[i] == false){
                    // i is unvisited neighbour of current vertex
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
    }


    public static void bftraversal(int[][] adjMatrix){
        boolean[] visited = new boolean[adjMatrix.length];
        Arrays.fill(visited, false);
        Queue<Integer> pendingVertices = new LinkedList<Integer>();
        bftraversal(adjMatrix, 0, visited, pendingVertices);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int adjMatrix[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        bftraversal(adjMatrix);
        sc.close();
    }
}


/*
input - 
    5 4
    0 2
    0 3
    2 1
    3 4
output - 
    0 2 3 1 4
*/