class GraphMatrix {
    int vertices;
    int[][] matrix;

    GraphMatrix(int vertices, int edges) {
        this.vertices = vertices;
        this.matrix = new int[vertices][vertices];
    }

    public void addEdge(int node1, int node2) {
        matrix[node1][node2] = 1;
        matrix[node2][node1] = 1;
    }

    public void create() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = 1;
                    matrix[j][i] = 1;
                }
            }
        }
        for (int i = 0 ,j =0; i < vertices && j < vertices; i++, j++) {
            System.out.println(matrix[i][j]);
        }
    }

    public void dfsearch(int matrix , int vertices) {
        boolean[] visited = new boolean[this.vertices];
        // Assuming DFS starts from node 0, or this method needs a starting node parameter.
        // For now, let's start from node 0.
        dfsRecursive(0, visited);
    }

    private void dfsRecursive(int currentNode, boolean[] visited) {
        visited[currentNode] = true;
        System.out.print(currentNode + " "); // Process the current node (e.g., print it)

        for (int i = 0; i < vertices; i++) {
            if (matrix[currentNode][i] == 1 && !visited[i]) {
                dfsRecursive(i, visited);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ArrayList() {
        
    }

    public static void main(String args[]) {
        GraphMatrix gh = new GraphMatrix(5, 6);

        gh.addEdge(0, 1);
        gh.addEdge(0, 2);
        gh.addEdge(1, 2);
        gh.addEdge(1, 3);
        gh.addEdge(1, 4);
        gh.addEdge(2, 3);

        gh.printMatrix();
    }
}
