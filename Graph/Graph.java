import java.util.ArrayList;

class Graph{
    static class Edge{
        int src;
        int des;
        public Edge(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));
        graph[1].add(new Edge(1, 3));


    }
    public static void main(String args[]){
        int V=4;
        ArrayList<Edge> graph[]= new ArrayList[V];
        CreateGraph(graph);
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                System.out.println(e.src+"--->"+e.des);
            }
        }

    }
}