package fr.ecp.sio.model;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString(){
        return "Rectlangle { x= " + x +
    }
}
