package fr.ecp.sio.model;

public class Shape {
    public class Rectangle extends javafx.scene.shape.Shape {
        public int x;
        public int y;

        @Override
        public String toString(){
            return "toString() Shape /n"
                    + super.toString();
        }
        public abstract double getArea();
    }



