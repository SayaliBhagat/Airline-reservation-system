/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManageAirliners;
import Business.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author BHAGAT
 */
public class AddingAirplanePanel extends javax.swing.JPanel {

    
    private JPanel cardSequenceJPanel;
    private Fleet fleet;
    public AddingAirplanePanel(Fleet fleet, JPanel cardSequenceJPanel) {
        initComponents();
        this.cardSequenceJPanel=cardSequenceJPanel;
        this.fleet=fleet;
        resetFields();
    }

    private void resetFields()
    {
        airlinerTextField.setText(fleet.getAirliners().getAirlines());
        airplaneIdTextField.setText("");
        mainHubTextField.setText("");
        manufacturingYearTextField.setText("");
        modelNumTextField.setText("");
        companyTextField1.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        iCAOTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mainHubTextField = new javax.swing.JTextField();
        countryTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addAirplanesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        iATATextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        companyTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        manufacturingYearTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        airplaneIdTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        modelNumTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        totalSeatsTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        airlinerTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel4.setText("ICAO");

        jLabel5.setText("Main Hub");

        jLabel6.setText("Country");

        addAirplanesButton.setText("Add Airplanes");

        jLabel2.setText("Name");

        jLabel3.setText("IATA");

        setBackground(new java.awt.Color(212, 248, 248));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectModel/Webp.net-resizeimage-5.png"))); // NOI18N
        jLabel1.setText("CREATION OF AIRPLANE PROFILE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 530, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel7.setText("Company");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 224, -1, -1));
        add(companyTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 221, 155, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel8.setText("Manufacturing Year");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 270, -1, -1));

        manufacturingYearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturingYearTextFieldActionPerformed(evt);
            }
        });
        add(manufacturingYearTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 267, 155, -1));

        addButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        addButton.setText("Add ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 50));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel10.setText("Airplane Id");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 133, -1, -1));
        add(airplaneIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 130, 155, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel11.setText("Model Number");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 184, -1, -1));
        add(modelNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 181, 155, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel9.setText("Total Seats");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 315, -1, -1));

        totalSeatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSeatsTextFieldActionPerformed(evt);
            }
        });
        add(totalSeatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 307, 155, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel12.setText("Airliner");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 90, 82, -1));

        airlinerTextField.setEnabled(false);
        add(airlinerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 82, 155, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 416, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void manufacturingYearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturingYearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturingYearTextFieldActionPerformed

    private void totalSeatsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSeatsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSeatsTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if((airplaneIdTextField.getText().isEmpty()) || (modelNumTextField.getText().isEmpty()) ||
           (manufacturingYearTextField.getText().isEmpty()) ||
           (totalSeatsTextField.getText().isEmpty()) || (companyTextField1.getText().isEmpty()))
            JOptionPane.showMessageDialog(null, "Please enter all the details before pressing Add", "Error", 0);
        else
        {
            try
            {
                int id = Integer.parseInt(airplaneIdTextField.getText());
                short year = Short.parseShort(manufacturingYearTextField.getText());
                short totSeats= Short.parseShort(totalSeatsTextField.getText());
                if ((id >=0 ) && (year >=0) && (totSeats>=0))
                {
                    Airplane airplane=fleet.addAirplane();
                    airplane.setAirplaneId(id);
                    airplane.setFleet(fleet);
                    airplane.setManufacturingCompany(companyTextField1.getText());
                    airplane.setManufacturingYear(year);
                    airplane.setModelNumber(modelNumTextField.getText());
                    airplane.setTotalSeats(totSeats);
                    JOptionPane.showMessageDialog(null, "Airplane added successfully");
                }
                else
                    JOptionPane.showMessageDialog(null, "id,year & total seats can not be negative", "Error", 0);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Please enter numeric fields in airplane Id, year and total seats", "Error", 0);
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Component component = cardSequenceJPanel.getComponent((cardSequenceJPanel.getComponentCount()-2));
        try
        {
            CreateAirlinerPanel createAirlinerPanel = (CreateAirlinerPanel)component;
            createAirlinerPanel.disableFields();
        }
        catch(Exception e)
        {
            ViewAirlinerPanel viewAirlinerPanel = (ViewAirlinerPanel) component;
            viewAirlinerPanel.reload();
        }
        cardSequenceJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAirplanesButton;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField airlinerTextField;
    private javax.swing.JTextField airplaneIdTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField companyTextField1;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JTextField iATATextField;
    private javax.swing.JTextField iCAOTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mainHubTextField;
    private javax.swing.JTextField manufacturingYearTextField;
    private javax.swing.JTextField modelNumTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField totalSeatsTextField;
    // End of variables declaration//GEN-END:variables

}
