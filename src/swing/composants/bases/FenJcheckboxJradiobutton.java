
package swing.composants.bases;
import javax.swing.*;
import java.awt.*;
public class FenJcheckboxJradiobutton extends  JFrame{
    //Note : Composant choix multiple et sélection unique
    private JCheckBox boxJava, boxCpp, boxCSharp, boxPython;
    private JRadioButton radioDeb, radioInterm, radioExp;
    private JTextArea affichage =
            new JTextArea("Affichage des choix",10,40);
    private JButton bouton = new JButton("Visualiser le choix");
    public FenJcheckboxJradiobutton(String titre){
        setTitle(titre);
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel("Quel sont vos langages Favoris :\n"));
        //Com : création des composant de choix pour JCheckBox
        boxJava = new JCheckBox("Java");
        boxCpp = new JCheckBox("C++");
        boxCSharp = new JCheckBox("C#");
        boxPython = new JCheckBox("Python");
        // Com : ajout des composant JCheckBox au conteneur
        add(boxJava);add(boxCpp);add(boxCSharp);add(boxPython);
        add(new JLabel("\nNiveau de compétence :\n"));
        //Com : création des composant de choix pour JRadioButton
        radioDeb = new JRadioButton("Debutant");
        radioInterm = new JRadioButton("Intermédiaire");
        radioExp = new JRadioButton("Expert");
        //Com : Objet de regroupement des JRadioButton
        ButtonGroup niveauProg = new ButtonGroup();
        //Com : ajout des JRadioButton dans l'objet pour être regroupés
        niveauProg.add(radioDeb);niveauProg.add(radioInterm);niveauProg.add(radioExp);
        // Com : ajout des composant JRadioButton au conteneur
        add(radioDeb);add(radioInterm);add(radioExp);
        add(bouton);
        affichage.setBackground(Color.darkGray);
        affichage.setForeground(Color.white);;
        add(affichage);
        bouton.addActionListener(e -> affichage.setText(resultat()));
    }
    //Note : Methode évoquée lors de la validation
    public String resultat(){
        String res = "Les Choix sont : \n";
        res += "   - vos langages favoris :\n";
        if(boxJava.isSelected()) res += "\t- Java\n";
        if(boxCpp.isSelected()) res += "\t- C++\n";
        if(boxCSharp.isSelected()) res += "\t- C#\n";
        if(boxPython.isSelected()) res += "\t- Python\n";
        if(!(boxJava.isSelected()) && !(boxCpp.isSelected())
                &&!(boxCSharp.isSelected())
                &&!(boxPython.isSelected()))
            res += "\tVous n'avez pas de préférence\n";
        res += "   - Votre niveau :\n";
        if(radioDeb.isSelected()){
            res += "\t- Débutant\n";
        }else if(radioInterm.isSelected()){
            res += "\t- Intermédiaire\n";
        }else if(radioExp.isSelected()){
            res += "\t- Expert\n";
        }else {
            res += "\tNiveau non défini\n";
        }
        return res;
    }
    public static void main(String args[]){
        JFrame fen =
                new FenJcheckboxJradiobutton(
                        "Utilisation JCheckBox et JRadioButton");
        fen.setVisible(true);
    }
}

