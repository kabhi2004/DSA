import java.util.*;
public class DisConnectBFS {
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
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
    }
    public static void BFS(ArrayList<Edge> graph[],boolean vis[],int start)
    {
        
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(vis[curr]==false)
            {
                System.out.println(curr);
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e=graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }
    public static void main(String args[])
    {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        CreateGraph(graph);
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
           BFS(graph,vis,i);
        }
        
    }
    
}
