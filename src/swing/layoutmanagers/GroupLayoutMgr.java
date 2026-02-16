
package swing.layoutmanagers;
import javax.swing.*;
public class GroupLayoutMgr extends JFrame {
    public GroupLayoutMgr() {
        setTitle("Exemple GroupLayout");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        JLabel labelNom = new JLabel("Nom :");
        JTextField champNom = new JTextField(15);
        JLabel labelEmail = new JLabel("Email :");
        JTextField champEmail = new JTextField(15);
        JButton bouton = new JButton("Envoyer");
        //Com: Définition du Groupe de composants sur l'horizontal
        layout.setHorizontalGroup(
                //Com: Création de groupes en parallèle 1
                layout.createParallelGroup()
                        //Com: Ajout de Groupe Séquentiel 1 dans le groupes en parallèle 1
                        .addGroup(layout.createSequentialGroup()
                                //Com: Ajout de Groupe parallèle 2 dans le groupes Séquentiel 1
                                .addGroup(layout.createParallelGroup()
                                        //Com: Ajout de composants dans le groupes en parallèle 2
                                        .addComponent(labelNom)
                                        .addComponent(labelEmail))
                                //Com: Ajout de Groupe parallèle 3 dans le groupes Séquentiel 1
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(champNom)
                                        .addComponent(champEmail)))
                        //Com: Ajout de composant dans le groupes en parallèle 1
                        .addComponent(bouton)
        );
        //Com: Définition du Groupe de composants sur le vertical
        layout.setVerticalGroup(
                //Com: Création de groupes en Séquentiel v1
                layout.createSequentialGroup()
                        //Com: Ajout de Groupe parallèle v1 dans le groupes Séquentiel v1
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                //Com: Ajout de composants dans le groupes en parallèle v1
                                .addComponent(labelNom)
                                .addComponent(champNom))
                        //Com: Ajout de Groupe parallèle v2 dans le groupes Séquentiel v1
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelEmail)
                                .addComponent(champEmail))
                        //Com: Ajout de composants dans le groupes Séquentiel v1
                        .addComponent(bouton)
        );
        bouton.addActionListener(e -> System.exit(0));
        add(panel);
    }

    public static void main(String[] args) {
        new GroupLayoutMgr().setVisible(true);
    }
}