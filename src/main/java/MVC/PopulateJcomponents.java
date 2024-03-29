/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MVC;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naritaa
 */
public class PopulateJcomponents extends javax.swing.JFrame {

    /**
     * Creates new form PopulateJcomponents
     */
    public PopulateJcomponents() {
        initComponents();
        
        //populating list
        ArrayList<String> name = getListNames();
        DefaultListModel lModel = new DefaultListModel();
        lModel.addAll(name);
        listItem.setModel(lModel);
        
        //combobox
        DefaultComboBoxModel comModel = new DefaultComboBoxModel();
        comModel.addAll(name);
        comboItem.setModel(comModel);
        
        //tebel
        String [] column = {"Name", "Age","Grade"};
        String  [][] data = {{"Peter","53", "13"},{"John", "67", "5"},{"Paul", "98","8"}};
        DefaultTableModel tb = new DefaultTableModel(data,column);
        tabelItem.setModel(tb);
        
        //show info in corresponding label in events
        
    }
    
    
    public ArrayList<String>getListNames(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("John");
        list.add("Paul");
        
       return list;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listItem = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        comboItem = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelItem = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        listLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tabelLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("List");

        listItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listItem.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listItemValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listItem);

        jLabel2.setText("Combo");

        comboItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemItemStateChanged(evt);
            }
        });
        comboItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboItemActionPerformed(evt);
            }
        });

        tabelItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelItemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelItem);

        jLabel3.setText("Tabel");

        jLabel4.setText("List:");

        listLabel.setText("lll");

        jLabel6.setText("Combo:");

        comboLabel.setText("ccc");

        jLabel8.setText("Tabel:");

        tabelLabel.setText("ttt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(253, 253, 253)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboLabel)
                            .addComponent(listLabel)
                            .addComponent(tabelLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(listLabel)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboLabel))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tabelLabel))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboItemActionPerformed

    private void listItemValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listItemValueChanged
        // TODO add your handling code here:
        String name = listItem.getSelectedValue();
        listLabel.setText(name);
        
    }//GEN-LAST:event_listItemValueChanged

    private void comboItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemItemStateChanged
        // TODO add your handling code here:
        String name = (String)comboItem.getSelectedItem();
        comboLabel.setText(name);
    }//GEN-LAST:event_comboItemItemStateChanged

    private void tabelItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelItemMouseClicked
        // TODO add your handling code here:
        int row = tabelItem.getSelectedRow();
        String name = (String)tabelItem.getValueAt(row, 0);
        String grade = (String)tabelItem.getValueAt(row, 1);
        String age = (String)tabelItem.getValueAt(row, 2);
        
        tabelLabel.setText(name + " " +  grade + " "+ age);
    }//GEN-LAST:event_tabelItemMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PopulateJcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopulateJcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopulateJcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopulateJcomponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopulateJcomponents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboItem;
    private javax.swing.JLabel comboLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listItem;
    private javax.swing.JLabel listLabel;
    private javax.swing.JTable tabelItem;
    private javax.swing.JLabel tabelLabel;
    // End of variables declaration//GEN-END:variables
}
