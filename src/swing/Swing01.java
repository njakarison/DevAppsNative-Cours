package swing;

import javax.swing.*;
import java.awt.event.*;

public class Swing01 extends JFrame {

    public Swing01() {
        super("titre de l'application");

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        addWindowListener(l);
        setSize(600,480);
        setVisible(true);
    }

    public static void main(String [] args){
        JFrame frame = new Swing01();
    }
}