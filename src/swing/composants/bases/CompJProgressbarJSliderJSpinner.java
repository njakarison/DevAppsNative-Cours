
package swing.composants.bases;
import javax.swing.*;
import java.awt.*;
public class CompJProgressbarJSliderJSpinner extends JFrame {
    // Note : Les composants à utiliser
    private JProgressBar progressBar;
    private JSlider slider;
    private JSpinner spinner;
    private JButton progression;
    private JButton bouton;
    private JTextArea affichage =
            new JTextArea("Affichage des valeurs",10,25);
    public CompJProgressbarJSliderJSpinner() {
        // Com : Barre de progression JProgressBar
        progressBar = new JProgressBar(0, 100);
        // Com : Afficher le porcentage de la progression
        progressBar.setStringPainted(true);
        add(new JLabel("Progression :"));
        add(progressBar);
        // Com : Bouton de lancement de la simulation de progression
        progression = new JButton("Lancer la simulation de progression");
        add(progression);
        // Com : Slider avec JSlider(minimale, maximale, valeur par defaut)
        slider = new JSlider(0, 100, 50);
        // Com : espacement pour les valeurs avec étiquettes
        slider.setMajorTickSpacing(20);
        // Com : valeur d'espacement entre division
        slider.setMinorTickSpacing(5);
        // Com : Afficher les divisions
        slider.setPaintTicks(true);
        // Com : Afficher les valeurs sur les étiquettes
        slider.setPaintLabels(true);
        add(new JLabel("Choisir une valeur (Slider) :"));
        add(slider);
        // Com : Création du modèle de spinner pour le JSpinner
        SpinnerNumberModel model =
                // Com : (valeur par défaut, minimum, maximum, pas d'augmentation)
                new SpinnerNumberModel(50, 0, 100, 1);
        // Com : Création du Spinner via le modèle
        spinner = new JSpinner(model);
        add(new JLabel("Choisir une valeur (Spinner) :"));
        add(spinner);
        // Note : affichage des valeurs
        bouton = new JButton("Récupérer valeurs");
        add(bouton);
        affichage.setBackground(Color.darkGray);
        affichage.setForeground(Color.white);;
        add(affichage);
        bouton.addActionListener(e -> affichage.setText(valeurs(slider, spinner)));
        slider.addChangeListener(e -> affichage.setText(valeurs(slider, spinner)));
        spinner.addChangeListener(e -> affichage.setText(valeurs(slider, spinner)));
        progression.addActionListener(e -> lancerProgression());
    }
    // Note : Récupération et affichage des valeurs du slider et du spinner
    private String valeurs(JSlider slider, JSpinner spinner){
        String res = "Les valeurs sont :\n";
        res += "    - Pour le slider : " + slider.getValue() + "\n";
        res += "    - Pour le spinner : " + spinner.getValue() + "\n";
        return res;
    }
    // Note : Simulation de progression avec un Thread
    private void lancerProgression() {
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                progressBar.setValue(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        JFrame fen = new CompJProgressbarJSliderJSpinner();
        fen.setTitle("JProgressBar - JSlider - JSpinner");
        fen.setSize(350, 410);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fen.setLayout(new FlowLayout());
        fen.setLocationRelativeTo(null);
        fen.setVisible(true);
    }
}