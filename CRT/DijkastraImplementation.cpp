#include <iostream>
#include <vector>
#include <queue>
#include <climits>

using namespace std;

class Edge {
public:
    int dest;
    int wt;

    Edge(int dest, int wt) {
        this->dest = dest;
        this->wt = wt;
    }
};

class Graph {
public:
    int node;
    vector<vector<Edge>> arr;

    Graph(int nodes) {
        node = nodes;
        arr.resize(nodes);
    }

    void addEdge(int src, int dest, int wt) {
        arr[src].push_back(Edge(dest, wt));
        arr[dest].push_back(Edge(src, wt)); // undirected graph
    }

    void dijkstra(int start) {

        priority_queue<
            pair<int, int>,
            vector<pair<int, int>>,
            greater<pair<int, int>>
        > que;

        vector<int> dis(node, INT_MAX);
        vector<bool> visited(node, false);

        dis[start] = 0;
        que.push({0, start});

        while (!que.empty()) {
            int curr = que.top().second;
            que.pop();

            if (visited[curr]) continue;
            visited[curr] = true;

            for (Edge edge : arr[curr]) {
                int adjnode = edge.dest;
                int wt = edge.wt;

                if (dis[curr] + wt < dis[adjnode]) {
                    dis[adjnode] = dis[curr] + wt;
                    que.push({dis[adjnode], adjnode});
                }
            }
        }

        // OUTPUT
        cout << "Shortest distances from node " << start << ":\n";
        for (int i = 0; i < node; i++) {
            cout << "To node " << i << " = " << dis[i] << endl;
        }
    }
};

int main() {

    Graph g(5);

    g.addEdge(0, 1, 4);
    g.addEdge(0, 2, 1);
    g.addEdge(2, 1, 2);
    g.addEdge(1, 3, 1);
    g.addEdge(2, 3, 5);
    g.addEdge(3, 4, 3);

    int start = 0;
    g.dijkstra(start);

    return 0;
}
