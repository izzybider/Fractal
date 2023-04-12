import processing.core.PApplet;
import java.util.ArrayList;
public class Main extends PApplet{
    public static void main(String[] args) {
        PApplet.main("Main");
    }
    public Main() {
        app = this;
    }
    private java.util.ArrayList<Integer> circles;
    private java.util.ArrayList<Integer> circles2;
    private java.util.ArrayList<Integer> color;
    public static PApplet app;
    public void settings() {

        size(400, 400);
}

public void setup(){
        circles = new ArrayList<Integer>();
        circles2 = new ArrayList<Integer>();
        color = new ArrayList<Integer>();
        myFractal (1000, 1000);
        colors(500);
}

public void draw() {
    background(5, 32, 240);
    for (int i = 0; i < circles.size(); i++) {
        if (i < color.size()) {
            fill(color.get(i), 400, 0);
        }
        Main.app.ellipse(0, 0, circles.get(i), circles2.get(i));
    }
}

public void myFractal(int x, int y){
        circles.add(x);
        circles2.add(y);
        if ((y-10) > 10) {
            myFractal(x - 10, y - 10);
        }
}

public void colors(int purpleBright) {
    color.add(purpleBright);
    if (purpleBright > 0) {
        colors(purpleBright - 10);
    }
}
}