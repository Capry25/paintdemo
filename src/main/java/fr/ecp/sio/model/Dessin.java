package fr.ecp.sio.model;

import java.awt.*;
import java.util.ArrayList;
import.java.util.List;
import javax.swing.*;

public class Dessin {
    public static void main(String[] args) {

        Component panel = new DrawingCanvas();

        JFrame window = new JFrame(title:"Photoshop");
        window.setSize(width:640, height:480);
        window.setDefaultCloseOperation(WindowConstant.EXIT_ON_CLOSE);
        window.add(panel);
        window.setVisible(true);


    }
}