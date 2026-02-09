
package applications.jinternalframe;
import javax.swing.*;
public class FenAvecJinternalframe extends JFrame{
    private JDesktopPane desktop = new JDesktopPane();
    private JInternalFrame fenInterne1;
    private JInternalFrame fenInterne2;
    public FenAvecJinternalframe(){
        this.setTitle("Fenetre avec JInternalFrame");
        fenInterne1 = new JInternalFrame("Fenêtre interne 1",
                true, false, true, true);
        fenInterne1.setSize(300,100);
        fenInterne1.setVisible(true);
        fenInterne2 = new JInternalFrame("Fenêtre interne 2",
                false, true, true, true);
        fenInterne2.setSize(300,150);
        fenInterne2.setVisible(true);
        desktop.add(fenInterne1);
        desktop.add(fenInterne2);
        this.setTitle("Fenetre avec JInternalFrame");
        this.setSize(480, 300);
        this.add(desktop);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        JFrame frame = new FenAvecJinternalframe();
        frame.setVisible(true);
    }
}