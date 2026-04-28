import java.util.*;
class AllPathsFromSrcToTar{
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
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6, 5));

    }
    public static void FindAllPaths(ArrayList<Edge> graph[],int curr,int tar,boolean vis[],String path){
     if(curr==tar)
     {
       System.out.println(path);
       return;
     }
     for(int i=0;i<graph[curr].size();i++)
     {
        Edge e=graph[curr].get(i);
        if(vis[curr]==false)
        {
            vis[curr]=true;
            FindAllPaths(graph,e.des,tar,vis,path+e.des);
            vis[curr]=false;
        }
     }
    }

    public static void main(String args[])
    {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        CreateGraph(graph);
        int src=0;
        int tar=5;
        boolean vis[]=new boolean[V];
        String path="0";
        FindAllPaths(graph,src,tar,vis,path);

    }
}