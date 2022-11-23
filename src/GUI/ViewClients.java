/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.sql.ResultSet;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
/**
 *
 * @author Rifat
 */

public class ViewClients extends javax.swing.JFrame {

    /**
     * Creates new form ViewClients
     */
    public ViewClients() {
        initComponents();
        getContentPane().setBackground(java.awt.Color.WHITE);
        date_d.setSelectableDateRange(null, new java.util.Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        clientID_i = new javax.swing.JTextField();
        search_t = new javax.swing.JTextField();
        g1 = new javax.swing.JRadioButton();
        date_d = new com.toedter.calendar.JDateChooser();
        g3 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        address_a = new javax.swing.JTextArea();
        country_c = new javax.swing.JComboBox<>();
        l5 = new javax.swing.JCheckBox();
        l1 = new javax.swing.JCheckBox();
        l2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l3 = new javax.swing.JCheckBox();
        name_n = new javax.swing.JTextField();
        l4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Clients");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Search Clients");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cid", "Name", "Gender", "DOB", "Country", "Address", "Language"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ADD NEW CLIENTS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Client ID :");

        clientID_i.setText("_____________");
        clientID_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientID_iActionPerformed(evt);
            }
        });

        search_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_tActionPerformed(evt);
            }
        });
        search_t.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_tKeyReleased(evt);
            }
        });

        buttonGroup1.add(g1);
        g1.setText("Male");
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(g3);
        g3.setText("Others");
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(g2);
        g2.setText("Female");
        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });

        address_a.setColumns(20);
        address_a.setRows(5);
        jScrollPane3.setViewportView(address_a);

        country_c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Country", "India", "Dubai", "Singapore", "Germany", "Qatar" }));
        country_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                country_cActionPerformed(evt);
            }
        });

        l5.setText("Hindi");
        l5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5ActionPerformed(evt);
            }
        });

        l1.setText("English");
        l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1ActionPerformed(evt);
            }
        });

        l2.setText("Spanish");
        l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Gender :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Address :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setText("DOB : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Country :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Language :");

        l3.setText("French");
        l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3ActionPerformed(evt);
            }
        });

        name_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_nActionPerformed(evt);
            }
        });

        l4.setText("German");
        l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(clientID_i, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name_n)
                                    .addComponent(country_c, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(date_d, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_t)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_t, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientID_i, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_n, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(g1)
                    .addComponent(g3)
                    .addComponent(g2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(date_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(l1)
                    .addComponent(l2)
                    .addComponent(l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l4)
                    .addComponent(l5))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, search_t});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clientID_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientID_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientID_iActionPerformed

    private void search_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_tActionPerformed

    private void search_tKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_tKeyReleased
        // Search Bar
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)jTable1.getModel();
        int rc = dtm.getRowCount();
        while(rc--!=0){
            dtm.removeRow(0);
        }
        String search_Name = search_t.getText();
        try{
            ResultSet rs = db.DbConnect.s.executeQuery("Select * from client_info WHERE name LIKE '%"+search_Name+"%' ");
            while(rs.next()){
                int cid = rs.getInt("cid");
                String name= rs.getString("name");
                String gender= rs.getString("gender");
                java.sql.Date dob= rs.getDate("dob");
                String country= rs.getString("country");
                String address= rs.getString("address");
                String language= rs.getString("language");
                
                java.util.Vector VectorClass = new java.util.Vector();
                VectorClass.add(cid);
                VectorClass.add(name);
                VectorClass.add(gender);
                VectorClass.add(dob);
                VectorClass.add(country);
                VectorClass.add(address);
                VectorClass.add(language);
                dtm.addRow(VectorClass);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_search_tKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // getting data from table into fields
        int ri = jTable1.getSelectedRow();
        int cid = (int)jTable1.getValueAt(ri, 0);
        String name = (String)jTable1.getValueAt(ri, 1);
        String gender = (String)jTable1.getValueAt(ri, 2);
        java.util.Date dob = (java.util.Date)jTable1.getValueAt(ri, 3);        
        String country = (String)jTable1.getValueAt(ri, 4);
        String address = (String)jTable1.getValueAt(ri, 5);
        String language = (String)jTable1.getValueAt(ri, 6);
        
        clientID_i.setText(cid+"");
        name_n.setText(name);
        switch (gender) {
            case "Male" -> g1.setSelected(true);
            case "Female" -> g2.setSelected(true);
            case "Others" -> g3.setSelected(true);
            default -> {}
        }
        date_d.setDate(dob);
        country_c.setSelectedItem(country);
        address_a.setText(address);
        
        l1.setSelected(false);
        l2.setSelected(false);
        l3.setSelected(false);
        l4.setSelected(false);
        l5.setSelected(false);

        if(!language.equals("")){
            StringTokenizer st = new StringTokenizer(language,",");
            while(st.hasMoreTokens()){
                String s = st.nextToken();

                if(s.equals("English"))
                    l1.setSelected(true);
           
                else if(s.equalsIgnoreCase("Spanish"))
                    l2.setSelected(true);
                
                else if(s.equalsIgnoreCase("French"))
                    l3.setSelected(true);
                
                else if(s.equalsIgnoreCase("German"))
                    l4.setSelected(true);
                
                else if(s.equalsIgnoreCase("Hindi"))
                    l5.setSelected(true);
                
            }
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g1ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g3ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g2ActionPerformed

    private void l5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l5ActionPerformed

    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l1ActionPerformed

    private void l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l2ActionPerformed

    private void l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l3ActionPerformed

    private void name_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_nActionPerformed

    private void l4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // DELETE BTN
        int ans = JOptionPane.showConfirmDialog(null, "Do you really want to delete the Client ??", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_OPTION){
                try{
                   int cid = Integer.parseInt(clientID_i.getText());
                    db.DbConnect.s.executeUpdate(" DELETE FROM client_info WHERE cid = "+cid);
                    JOptionPane.showMessageDialog(null, "Client deleted successfully");
                    search_tKeyReleased(null); 
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Action ABorted");
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // UPDATE BTN
        String name = name_n.getText();
        String gender;
        if(g1.isSelected()){
            gender = g1.getText();
        }else if(g2.isSelected()){
            gender = g2.getText();
        }else{
            gender = g3.getText();
        }
        
        int ri = jTable1.getSelectedRow();
        int cid = (int)jTable1.getValueAt(ri, 0);
        java.util.Date dob = (java.util.Date)jTable1.getValueAt(ri, 3);
        String country = (String)country_c.getSelectedItem();
        String address = address_a.getText();
        String language = "";
        if(l1.isSelected()){
            language+=l1.getText()+",";
        }
        if(l2.isSelected()){
            language+=l2.getText()+",";
        }
        if(l3.isSelected()){
            language+=l3.getText()+",";
        }
        if(l4.isSelected()){
            language+=l4.getText()+",";
        }
        if(l5.isSelected()){
            language+=l5.getText()+",";
        }
        if(!language.equals("")){
            language = language.substring(0, language.length()-1);
        }
        
        if(!name.equals("") && dob!=null && !address.equals("") && !country.equals("Select Country") ){
            try{
                    db.DbConnect.s.executeUpdate(" UPDATE client_info SET name='"+name+"', gender='"+gender+"', dob='"+dob+"', country='"+country+"', address='"+address+"', language='"+language+"' WHERE cid = "+cid);
                    JOptionPane.showMessageDialog(null, "Client updated successfully");
                    search_tKeyReleased(null);   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please complete the form");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void country_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_country_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_country_cActionPerformed

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
            java.util.logging.Logger.getLogger(ViewClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_a;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField clientID_i;
    private javax.swing.JComboBox<String> country_c;
    private com.toedter.calendar.JDateChooser date_d;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox l1;
    private javax.swing.JCheckBox l2;
    private javax.swing.JCheckBox l3;
    private javax.swing.JCheckBox l4;
    private javax.swing.JCheckBox l5;
    private javax.swing.JTextField name_n;
    private javax.swing.JTextField search_t;
    // End of variables declaration//GEN-END:variables

 
}
