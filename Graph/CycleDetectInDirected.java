import java.util.*;
public class CycleDetectInDirected {
    public static class Edge{
        int src;
        int des;
        Edge(int src,int des)
        {
            this.src=src;
            this.des=des;
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[]){
         for(int i=0;i<graph.length;i++)
         {
            graph[i]=new ArrayList<>();
         }
        graph[0].add(new Edge(0,2));

         graph[1].add(new Edge(1,0));

         graph[2].add(new Edge(2,3));

         graph[3].add(new Edge(3,1));
    }
    public static boolean DetectCycle(ArrayList<Edge> graph[],int curr,boolean vis[],boolean res[]){
        vis[curr]=true;
        res[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(res[e.des]==true)
            {
                return true;
            }
            else if( vis[e.des]==false && DetectCycle(graph, e.des, vis, res))
            {
                return true;
            }
        }
        res[curr]=false;
        return false;
    }
    public static void main(String args[])
    {
        int V=4;
        ArrayList<Edge> graph[] =new ArrayList[V];
        CreateGraph(graph);
        boolean vis[]=new boolean[V];
        boolean res[]=new boolean[V];
        boolean find=false;
        for(int i=0;i<V;i++){
        find=DetectCycle(graph,i,vis,res);
        if(find==true)
        {
            break;
        }
        }
        System.out.println(find);
        
    }
    
}