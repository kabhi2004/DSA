import java.util.*;
public class DikjstraAlgo  {
    public static class Edge
    {
        int src;
        int dis;
        int wie;
        Edge(int src,int dis,int wie)
        {
            this.src=src;
            this.dis=dis;
            this.wie=wie;
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,5,5));
        graph[4].add(new Edge(4, 3, 2));

        
    }
    public static class Pair implements Comparable<Pair>{
    int node;
    int dis;
    Pair(int node,int dis)
    {
        this.node=node;
        this.dis=dis;
    }
    @Override
    public int compareTo(Pair p2)
    {
        return this.dis-p2.dis;

    }
}

    public static void Dikjstra(ArrayList<Edge> graph[],int src,int V){
        PriorityQueue<Pair> p=new PriorityQueue<>();
        int dist[]=new int[V];
        boolean vis[]=new boolean[V];
        p.add(new Pair(src,0));
        for(int i=0;i<V;i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }
        while(!p.isEmpty())
        {
            Pair curr=p.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++)
                {
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.dis;
                    if((dist[u]+e.wie)<dist[v])
                    {
                        dist[v]=dist[u]+e.wie;
                        p.add(new Pair(v,dist[v]));
                    }

                }
            }
        }
        
        for(int i=0;i<V;i++)
        {
            System.out.print(dist[i]+"-->");
        }

    
    
}

    public static void main(String args[])
    {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        CreateGraph(graph);
        Dikjstra(graph,0,V);
    }
    
}
