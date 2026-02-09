package applications;
import javax.swing.*;

public class PremiereFenetreRaw extends JFrame {
    private Integer largFen = 800;
    private Integer hautFen = 600;
    public PremiereFenetreRaw(){
        super("Ma premiere fenetre");
        this.setSize(largFen, hautFen);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        PremiereFenetreRaw fenetre = new PremiereFenetreRaw();
        fenetre.setVisible(true);
    }
}
