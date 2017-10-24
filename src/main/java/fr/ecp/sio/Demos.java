package fr.ecp.sio;

import fr.ecp.sio.model.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Demos {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int a = 2;
        long b = 3;
        float c = 3.3f;
        char d = 'e';
        double e = b / 3.;
        String helloWorld = "Hello World";

        if (a == 2) {
            System.out.println("A = 2");
        }
        if (helloWorld.contains("r")) ;
        {
            System.out.println("Hello World contient bien un R");
        }
        for (int i = 0; i < 10; i++) {

            Rectangle r = new Rectangle();
            r.x = 40;
            r.y = 20;
            r.width = 20;
            r.height = 40;
            int area = r.getArea();


            Rectangle r2 = new Rectangle();
            r2.x = 30;
            r2.y = 60;
            r2.width = 20;
            r2.height = 80;

            Rectangle[] rects = new Rectangle[2];
            rects[0] = r;
            rects[1] = r2;
        boolean[] bools = new boolean[]{true, false};
        int[] ints = {12, 56};

        r2.height = 400;
        Rectangle r1 = rects[1];
        System.out.println("Height is " + r1.height);

            Rectangle r3 = new Rectangle[();
            r3.x = 40;
            r3.y= 80
            r3.width = 20;
            r3.height = 20;


            List<Rectangle> list = new ArrayList<Rectangle>();
            list.add(r2);
            Rectangle r4 = list.get(0);
        List<Shape> list = new ArrayList<Shape>();
        list.add(r2)
        }
}
}
