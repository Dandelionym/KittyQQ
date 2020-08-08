import java.awt.*;

public class MyFrame extends Frame {
    static int id = 0;

    public MyFrame(int x, int y, int w, int h, Color color){
        super("MyFrame" + id);

        setBounds(x, y, w, h);
        setBackground(color);
        setVisible(true);
    }


    public static void main(String[] args) {

        new MyFrame(100, 100, 250, 315, Color.gray);
        new MyFrame(100, 100, 250, 315, Color.gray);
        new MyFrame(100, 100, 250, 315, Color.gray);
        new MyFrame(100, 100, 250, 315, Color.gray);
        new MyFrame(100, 100, 250, 315, Color.gray);


    }

}
