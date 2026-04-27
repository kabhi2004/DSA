import java.util.ArrayList;

class WieghtedGraph{
    public static class Edge{
        int src;
        int des;
        int wie;
        public Edge(int src,int des,int wie)
        {
            this.src=src;
            this.des=des;
            this.wie=wie;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,5));
        graph[1].add(new Edge(1, 2, 6));
        graph[1].add(new Edge(1, 3, 4));
        graph[2].add(new Edge(2, 3, 2));
        graph[2].add(new Edge(2,3,4));
    }


    public static void main(String args[])
    {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                System.out.println(e.src+"---->"+e.des+"="+e.wie);
                        
            }
        }
    }
}