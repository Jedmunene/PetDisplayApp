
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class PetDisplayUI extends javax.swing.JFrame {
    public PetDisplayUI() {
        initComponents();
        ButtonGroup petGroup = new ButtonGroup();
        petGroup.add(birdRadioButton);
        petGroup.add(catRadioButton);
        petGroup.add(dogRadioButton);
        petGroup.add(pigRadioButton);
    }

    private void updateDisplayedPet() {
        if (birdRadioButton.isSelected()) {
            petLabel.setText("You selected Bird");
            petImageLabel.setIcon(new ImageIcon(getClass().getResource("/images/Bird.png"));
        } else if (catRadioButton.isSelected()) {
            petLabel.setText("You selected Cat");
            petImageLabel.setIcon(new ImageIcon(getClass().getResource("/images/Cat.png"));
        } else if (dogRadioButton.isSelected()) {
            petLabel.setText("You selected Dog");
            petImageLabel.setIcon(new ImageIcon(getClass().getResource("/images/Dog.png"));
        } else if (pigRadioButton.isSelected()) {
            petLabel.setText("You selected Pig");
            petImageLabel.setIcon(new ImageIcon(getClass().getResource("/images/Pig.png"));
        } else {
            petLabel.setText("Please select a pet.");
            petImageLabel.setIcon(null);
        }
    }

    private void birdRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        updateDisplayedPet();
    }

    private void catRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        updateDisplayedPet();
    }

    private void dogRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        updateDisplayedPet();
    }

    private void pigRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        updateDisplayedPet();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PetDisplayUI().setVisible(true);
        });
    }
}
