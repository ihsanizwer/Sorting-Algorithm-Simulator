/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author IT15-010704
 */
public class InsertionSort extends javax.swing.JFrame {

    /**
     * Creates new form InsertionsSort
     */
        private Double array[];
        private JLabel lArray[];
    public InsertionSort() {
        
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(130,173,122));
        initComponents();
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel24.setVisible(false);
        lArray  = new JLabel[8];
        array = new Double[8];
        lArray[0] = n1;
        lArray[1]= n2;
        lArray[2]= n3;
        lArray[3] = n4;
        lArray[4]= n5;
        lArray[5] = n6;
        lArray[6] = n7;
        lArray[7] = n8;
        for(JLabel j : lArray){
            j.setVisible(false);
        }
        jLabel3.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n6 = new javax.swing.JLabel();
        n7 = new javax.swing.JLabel();
        n8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel1.setText("Insertion Sort");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/button (8).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(0, 204, 102));
        jLabel4.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel4.setText("Java Code");

        jLabel5.setBackground(new java.awt.Color(0, 204, 102));
        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("for(j=1; j<array.length; j++){");

        jLabel6.setBackground(new java.awt.Color(0, 204, 102));
        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("double key = array[j];");

        jLabel7.setBackground(new java.awt.Color(0, 204, 102));
        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("int i = j-1;");

        jLabel8.setBackground(new java.awt.Color(0, 204, 102));
        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("while(i>=0 && array[i] > key){");

        jLabel9.setBackground(new java.awt.Color(0, 204, 102));
        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setText("array[i+1] = array[i];");

        jLabel10.setBackground(new java.awt.Color(0, 204, 102));
        jLabel10.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel10.setText("i = i-1;");

        jLabel11.setBackground(new java.awt.Color(0, 204, 102));
        jLabel11.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel11.setText("}");

        jLabel31.setBackground(new java.awt.Color(0, 204, 102));
        jLabel31.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel31.setText("array[i+1] = key;");

        jLabel32.setBackground(new java.awt.Color(0, 204, 102));
        jLabel32.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel32.setText("}");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel4))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel12.setText("Enter values to be sorted");

        t1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        t2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        t3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        t4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        t7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        t8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        t5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        t6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/go.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        n1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        n1.setText("   ");
        n1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        n2.setText("   ");
        n2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        n3.setText("   ");
        n3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        n4.setText("   ");
        n4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        n5.setText("   ");
        n5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        n6.setText("   ");
        n6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        n7.setText("   ");
        n7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        n8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        n8.setText("   ");
        n8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setBackground(new java.awt.Color(255, 255, 0));
        jLabel22.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 0));
        jLabel22.setText("Swap");

        jLabel23.setBackground(new java.awt.Color(255, 255, 0));
        jLabel23.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 255, 153));
        jLabel23.setText("Key =    ");

        jLabel24.setBackground(new java.awt.Color(255, 255, 0));
        jLabel24.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("White - Sorted");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/button (5)_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(n1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(n2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(n3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(n4))
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(n5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(n6))
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n1)
                            .addComponent(n2)
                            .addComponent(n3)
                            .addComponent(n4)
                            .addComponent(n5)
                            .addComponent(n6)
                            .addComponent(n7)
                            .addComponent(n8))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(800, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        for(JLabel j : lArray){
            j.setVisible(false);
        }
        FormatMe.enableTextBoxes(t1, t2, t3, t4, t5, t6, t7, t8, true);
        jLabel24.setVisible(false);
        jLabel23.setVisible(false);
        jLabel13.setEnabled(true);
        jLabel3.setEnabled(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        class SortingThread extends Thread{

                @Override
                public void run(){
                    try{
                    for(JLabel j : lArray){
                      j.setVisible(true);
                      j.setForeground(Color.black);
                    }
                    jLabel13.setEnabled(false);
                
                    FormatMe.enableTextBoxes(t1, t2, t3, t4, t5, t6, t7, t8, false);
                    FormatMe.setLabelText(n1, t1.getText());
                    FormatMe.setLabelText(n2, t2.getText());
                    FormatMe.setLabelText(n3, t3.getText());
                    FormatMe.setLabelText(n4, t4.getText());
                    FormatMe.setLabelText(n5, t5.getText());
                    FormatMe.setLabelText(n6, t6.getText());
                    FormatMe.setLabelText(n7, t7.getText());
                    FormatMe.setLabelText(n8, t8.getText());

          try{  
                array[0] = Double.parseDouble(t1.getText());
                array[1] = Double.parseDouble(t2.getText());        
                array[2] = Double.parseDouble(t3.getText());
                array[3] = Double.parseDouble(t4.getText());
                array[4] = Double.parseDouble(t5.getText());
                array[5] = Double.parseDouble(t6.getText());
                array[6] = Double.parseDouble(t7.getText());
                array[7] = Double.parseDouble(t8.getText());
          }catch(NumberFormatException ex){
                for(JLabel j : lArray){
                    j.setVisible(false);
                }
                FormatMe.enableTextBoxes(t1, t2, t3, t4, t5, t6, t7, t8, true);
                jLabel24.setVisible(false);
                jLabel13.setEnabled(true);
                jLabel3.setEnabled(false);
              JOptionPane.showMessageDialog(null, "Invalid Inputs. Please check again and enter Numbers only.");
              return;
          }
                    for(int j=1;j<array.length;j++){
                        
                        int lindex =j;
                        jLabel31.setForeground(Color.black);
                        jLabel5.setForeground(Color.red);
                        Thread.sleep(1500);
                        double key =  array[j];
                        jLabel23.setVisible(true);
                        jLabel23.setText("Key ="+array[j]);
                        jLabel5.setForeground(Color.black);
                        jLabel6.setForeground(Color.red);
                        Thread.sleep(1500);
                        int i= j-1;
                        jLabel6.setForeground(Color.black);
                        jLabel7.setForeground(Color.red);
                        
                        Thread.sleep(1500);
                        jLabel7.setForeground(Color.black);
                        JLabel temp = lArray[i];
                        JLabel temp2 = lArray[lindex];
                        temp.setForeground(Color.yellow);
                        temp2.setForeground(Color.yellow);
                        while(i>=0 && array[i]>key){
                            temp = lArray[i];
                            temp2 = lArray[i+1];
                            temp.setForeground(Color.yellow);
                            temp2.setForeground(Color.yellow);
                            jLabel8.setForeground(Color.red);
                            jLabel10.setForeground(Color.black);
                            Thread.sleep(1500);
                            array[i+1] = array[i];
                            jLabel22.setVisible(true);
                            temp.setForeground(Color.black);
                            temp2.setForeground(Color.black);
                            temp = lArray[i];
                            temp2 = lArray[i+1];
                            temp.setForeground(Color.yellow);
                            temp2.setForeground(Color.yellow);
                            jLabel8.setForeground(Color.black);
                            jLabel9.setForeground(Color.red);
                            FormatMe.setLabelText(lArray[i+1], array[i+1].toString());
                            Thread.sleep(1500);
                            jLabel22.setVisible(false);
                            i = i-1;
                            jLabel9.setForeground(Color.black);
                            jLabel10.setForeground(Color.red);
                            Thread.sleep(1500);
                            temp.setForeground(Color.black);
                            temp2.setForeground(Color.black);
                            }
                        if(array[i+1]!=key)
                        jLabel22.setVisible(true);
                        array[i+1] = key;
                        lindex = i+1;
                        temp2.setForeground(Color.black);
                        temp2 = lArray[lindex];
                        try{
                        temp = lArray[lindex+1];
                        }catch(Exception e){}
                        temp.setForeground(Color.yellow);
                        temp2.setForeground(Color.yellow);
                        jLabel10.setForeground(Color.black);
                        jLabel31.setForeground(Color.red);
                        //FormatMe.setLabelText(j2, array[i+2].toString());
                        FormatMe.setLabelText(lArray[i+1], array[i+1].toString());
                        
                        Thread.sleep(1500);
                        jLabel31.setForeground(Color.black);
                        temp.setForeground(Color.black);
                        temp2.setForeground(Color.black);
                        jLabel22.setVisible(false);
                        for(int k=0; k<=j;k++){
                            JLabel j1 = lArray[k];
                            j1.setForeground(Color.white);
                        }
                        jLabel24.setVisible(true);
                        Thread.sleep(2000);
                        
                        }
                    
                    jLabel3.setEnabled(true); 
                    }catch(InterruptedException e){
                        System.out.println(e.getMessage());
                    } 
                
            }
        }
        new SortingThread().start();
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(InsertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertionSort().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n8;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    // End of variables declaration//GEN-END:variables
}
