package com.xtl.base;

/**
 * 正方形
 * @author 31925
 */
public class Square implements Shape{
    private Double edge;

    public Square(Double edge) {
        this.edge = edge;
    }

    public Double getEdge() {
        return edge;
    }

    public void setEdge(Double edge) {
        this.edge = edge;
    }

    @Override
    public Double area() {
        return Math.pow(edge,2);
    }

    @Override
    public Double perimeter() {
        return 4*edge;
    }
}
