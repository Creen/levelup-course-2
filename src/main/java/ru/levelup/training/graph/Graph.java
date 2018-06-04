package ru.levelup.training.graph;

public class Graph {

    //количество вершин в корафе
    private final int VERTEX_MAX = 30;

    //массив для хранения этих вершин
    private Vertex[] vertexArray;

    //текущее количество вершин в графе
    private int countVertex;

    //матрица смежности
    private int[][] matrix;

    public Graph() {
        //заполнение матрицы нулями
        matrix = new int[VERTEX_MAX][VERTEX_MAX];
        for (int i = 0; i < VERTEX_MAX; i++) {
            for (int j = 0; j < VERTEX_MAX; j++) {
                matrix[i][j] = 0;
            }
        }
        countVertex = 0;
        vertexArray = new Vertex[VERTEX_MAX];
    }

    //добавление вершины
    public void addVertex(String vertex){
        vertexArray[countVertex++] = new Vertex(vertex);
    }

    //добавление ребра
    public void addEdge(int beginEdge, int endEdge){
        matrix [beginEdge][endEdge] = 1;
        matrix [endEdge][beginEdge] = 0;
    }

    //метод возвращает непосещенную вершину, смежную по отношению к v
    int getSuccessor (int v)
    {
        for(int j = 0; j < countVertex; j++)
            if(matrix[v][j] == 1 && vertexArray[j].isVisited() == false)
                return j; //возвращает первую найденную вершину
        return -1; //таких вершин нет
    }

    //обход в ширину
    Queue queue = new Queue(30);

//    public void byPassWidth(int v){
//        vertexArray[v].isVisited() = true;
//        queue.insertElement(v);
//        int vertex;
//
//        //выведем вершину, с которой начинается обход, на экран
//        System.out.println(vertexArray[v].getNameVertex());
//
//        while(!queue.isEmpty())//пока очередь не опустеет
//        {
//            int current = queue.pop();
//            while((vertex = getSuccessor(current)) != -1)
//            {
//                vertexArray[vertex].isVisited() = true;
//                queue.insertElement(vertex);
//                //вывод вершины на экран
//                System.out.println(vertexArray[vertex].getNameVertex());
//            }
//
//        }
//        //сброс флагов
//        for(int j = 0; j < countVertex; j++)
//            vertexArray[j].isVisited() = false;
//
//    }
}
