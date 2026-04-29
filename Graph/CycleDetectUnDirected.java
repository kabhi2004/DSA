import java.util.*;
public class CycleDetectUnDirected {
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
      graph[0].add(new Edge(0,1 ));
      graph[0].add(new Edge(0,4 ));

      graph[1].add(new Edge(1,0));
      graph[1].add(new Edge(1,2));
      graph[1].add(new Edge(1,4));

      graph[2].add(new Edge(2, 1));
      graph[2].add(new Edge(2, 3));

      graph[3].add(new Edge(3, 2));

      graph[4].add(new Edge(4,0));
      graph[4].add(new Edge(4, 1));
      graph[4].add(new Edge(4,5));

      graph[5].add(new Edge(5,4));

    }
    public static boolean DetectCycle(ArrayList<Edge> graph[],boolean vis[],int curr,int par)
    {
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e= graph[curr].get(i);
            if(vis[e.des]==true&& par!=e.des)
            {
                return true;
            }
            else if(!vis[e.des])
            {
                if(DetectCycle(graph,vis,e.des,curr)==true){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String args[])
    {
        int V=6;
        ArrayList<Edge> graph[]= new ArrayList[V];
        CreateGraph(graph);
        boolean vis[]=new boolean[V];
        int par=-1;
        boolean detect=false;
        for(int i=0;i<V;i++)
        {
            if(!vis[i]){
                detect= DetectCycle(graph,vis,i,par);
            }
        }
        System.out.println(detect);
    }

    
}
