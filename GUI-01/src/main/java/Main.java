import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame("KittyQQ");
        frame.setSize(250, 315);
        frame.setVisible(true);
        frame.setBackground(new Color(112, 123,165));
        frame.setLocation(1412, 654);
        frame.setResizable(false);
        frame.setLayout(null);

        // 头像框
        Panel panel = new Panel();
        panel.setBounds(80, 50, 90, 90);
        panel.setBackground(new Color(103, 123, 255));
        frame.add(panel);


        // 用户名、密码
        Panel info = new Panel();
        info.setBounds(50, 200, 150, 70);
        info.setBackground(Color.white);
        info.add(new TextArea());
        info.add(new TextField());
        frame.add(info);










        // 监听

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });






    }
}
