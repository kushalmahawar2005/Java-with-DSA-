import java.util.ArrayList;

public class GraphImplementation {

    static int node;
    static int[][] arr;

    GraphImplementation(int vertex)
    {
        node = vertex;
        arr = new int[vertex][vertex];
    }

    static void addEdge(int node1, int node2){
        arr[node1][node2] = 1 ;
        arr[node2][node1] = 1;
    }


    static void findPath(int source, int destination, boolean visit[], ArrayList<Integer> path, ArrayList<ArrayList<Integer>> allPath)
    {
        visit[source] = true;
        path.add(source);
        if(source == destination)
        {
            allPath.add(new ArrayList<>(path));
        }
        else{
            for(int i=0;i<node;i++)
            {
                if(arr[source][i] == 1 && !visit[i])
                {
                    findPath(i, destination, visit,path, allPath);
                }
            }
        }
        path.remove(path.size() - 1);
        visit[source] = false;
    }

    static void countways(int source, int destination){
        boolean[] visit = new boolean[node];

        ArrayList<Integer> path =new ArrayList<>();

        ArrayList<ArrayList<Integer>> allPath = new ArrayList<>();

        findPath(source, destination, visit, path, allPath);

        for(ArrayList<Integer> i: allPath)
        {
            for(int n : i)
            {
                System.out.print(n);
            }
            System.out.println();
        }


    }
// For DFS - we use Recccursion Nebour and For BFS (Recursion and Queue) and Next . BFS -  Queuee   (in Graph)

    static void create(ArrayList<ArrayList<Integer>> graph, int nodes){

        int[][] matrix = new int[nodes][nodes];

        for(int i=0;i< nodes;i++)
        {
            for(int j=0;j<nodes;j++)
            {
                if(graph.get(i).get(j) == 1)
                {
                    matrix[i][j]=1;
                    matrix[j][i]=1;
                }
            }
        }

        for(int i=0;i< nodes;i++)
        {
            for(int j=0;j<nodes;j++)
            {

                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {


        GraphImplementation obj = new GraphImplementation(4);
        addEdge(0,1);
        addEdge(0,2);
        addEdge(0,3);
        addEdge(1,3);
        addEdge(2,3);
        addEdge(3,2);
        countways(0,3);



    }
}
