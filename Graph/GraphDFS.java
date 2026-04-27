import java.util.*;
public class GraphDFS {
    public static class Edge{
        int src;
        int des;
        Edge(int src,int des)
        {
            this.src=src;
            this.des=des;
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5 ));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));
    }
    public static void DFS(ArrayList<Edge> graph[], boolean vis[],int start){
       if(vis[start]==false){
        System.out.println(start);
        vis[start]=true;
        for(int i=0;i<graph[start].size();i++)
        {
            Edge e=graph[start].get(i);
            DFS(graph,vis,e.des);
        }
       }

    }
    public static void main(String args[])
    {
       int V=7;
       ArrayList<Edge> graph[]=new ArrayList[V];
       CreateGraph(graph);
       boolean vis[]=new boolean[V];
       DFS(graph,vis,0);
    }
    
}
