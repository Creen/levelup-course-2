package ru.levelup.training.graph;

//Вершина
public class Vertex {

    //метка, соответствующую вершине: букыв, город ...
    private String nameVertex;

    //была ли данная вершина посещена при обходе графа
    private boolean isVisited;

    public Vertex(String nameVertex) {
        this.nameVertex = nameVertex;
        isVisited = false;
    }

    public String getNameVertex(){
        return nameVertex;
    }

    public void setNameVertex(String nameVertex) {
        this.nameVertex = nameVertex;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

}
