package Graphs;

import java.util.Arrays;
import java.util.Scanner;

public class Dfs {

    public static void dftraversal(int[][] adjMatrix, int currentVertex, boolean[] visited){
        visited[currentVertex] = true;
        System.out.print(currentVertex+" ");
        for(int i=0;i<adjMatrix.length;i++){
            if(adjMatrix[currentVertex][i] == 1 && visited[i] == false){
                dftraversal(adjMatrix, i, visited);
            }
        }
    }

    public static void dftraversal(int[][] adjMatrix){
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        dftraversal(adjMatrix, 0, visited);
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
        dftraversal(adjMatrix);
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(adjMatrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}


/*
input -
    4 3
    0 1
    0 3
    1 2
output - 
    0 1 2
*/