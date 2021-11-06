/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogos;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Maciel
 */
public class JogoDaVelhaJDV extends javax.swing.JFrame {

   boolean Player1Active = true;
   boolean Player2Active = false;
   
   int WinnerPlayer1 = 0;
   int WinnerPlayer2 = 0;
   int BreakEven = 0;
   
    public JogoDaVelhaJDV() {
        initComponents();
    }
    
    public void PlayerActive() {
        
        if (Player1Active == true) {
            Player1Active = false;
            Player2Active = true;
        } else { 
            Player1Active = true;
            Player2Active = false;
        }
        WinningPlayer("X");
        WinningPlayer("O");       
    }
    
    public void WinningPlayer(String Player) {
        
        /* Linhas */
        
        if (B1.getText().equals(Player) &&
                B2.getText().equals(Player) &&
                B3.getText().equals(Player)) {
            
            if (B1.getText().equals("X")) 
                Winner("Player 1");
            else
                Winner("Player 2");
        }
        
        if (B4.getText().equals(Player) &&
                B5.getText().equals(Player) &&
                B6.getText().equals(Player)) {
            
            if (B4.getText().equals("X")) 
                Winner("Player 1");
            else
                Winner("Player 2");
        }
        
        if (B7.getText().equals(Player) &&
                B8.getText().equals(Player) &&
                B9.getText().equals(Player)) {
            
            if (B7.getText().equals("X")) 
                Winner("Player 1");
            else
                Winner("Player 2");
        }
        
        /* Colunas */
        
        if (B1.getText().equals(Player) &&
                B4.getText().equals(Player) &&
                B7.getText().equals(Player)) {
            
            if (B1.getText().equals("X")) 
                Winner("Player 1");
            else
                Winner("Player 2");
        }
        
        if (B2.getText().equals(Player) &&
                B5.getText().equals(Player) &&
                B8.getText().equals(Player)) {
            
            if (B2.getText().equals("X")) 
                Winner("Player 1");
            else
                Winner("Player 2");
        }
        
        if (B3.getText().equals(Player) &&
                B6.getText().equals(Player) &&
                B9.getText().equals(Player)) {
            
            if (B3.getText().equals("X")) 
                Winner("Player 1");
            else
                Winner("Player 2");
        }
        
        /* Diagonais */
        
        if (B1.getText().equals(Player) &&
                B5.getText().equals(Player) &&
                B9.getText().equals(Player)) {
            
            if (B1.getText().equals("X")) 
                Winner("Player 1");
            else
                Winner("Player 2");
        }
        
        if (B3.getText().equals(Player) &&
                B5.getText().equals(Player) &&
                B7.getText().equals(Player)) {
            
            if (B3.getText().equals("X")) 
                Winner("Player 1");
            else
                Winner("Player 2");
        }
        
        /* Empate */
        
        if ( !B1.getText().equals("") &&
             !B2.getText().equals("") &&
             !B3.getText().equals("") &&
             !B4.getText().equals("") &&
             !B5.getText().equals("") &&
             !B6.getText().equals("") &&
             !B7.getText().equals("") &&
             !B8.getText().equals("") &&
             !B9.getText().equals("") ) {
                
            Winner("Round Tied");
            } 
    }
    
    /* Vencedor */
    
    public void Winner (String WinningPlayer) {
            
            if (WinningPlayer.equals("Player 1")) {
              JOptionPane.showMessageDialog(JogoDaVelhaJDV.this, "Player 1 wins!");
               WinnerPlayer1++;
               WinsPlayer1.setText("Wins: " + WinnerPlayer1 );
               ClearData();
               CreateFile();
            }
                        
            if (WinningPlayer.equals("Player 2")) {
              JOptionPane.showMessageDialog(JogoDaVelhaJDV.this, "Player 2 wins!");
               WinnerPlayer2++;
               WinsPlayer2.setText("Wins: " + WinnerPlayer2 );
                ClearData();
               CreateFile();
            }
            if (WinningPlayer.equals("Round Tied")) {
              JOptionPane.showMessageDialog(JogoDaVelhaJDV.this, "Round Tied!");
               BreakEven++;
               RoundTied.setText("Roud Tied: " + BreakEven );
               ClearData();
               CreateFile();
            }
    }
    
    /* Limpar Dados */
    
    public void ClearData() {

        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");
    
            Player1Active = true;
            Player2Active = false;
    }
     
        public void CreateFile(){
        
        try {
            String breakline = System.getProperty("line.separator");
            String localarqv = new File("").getAbsolutePath();
            FileWriter escritor = new FileWriter(localarqv + "\\SaveGame.txt", true); 
            escritor.write(breakline);
            escritor.write("Player 1: "+String.valueOf(WinnerPlayer1));
            escritor.write(breakline);
            escritor.write("Player 2: "+String.valueOf(WinnerPlayer2));
            escritor.write(breakline); // 
            escritor.write("Round Tied: "+String.valueOf(BreakEven));
            escritor.write(breakline);
            escritor.write("+===================+");
            escritor.close();
        } catch (Exception e) {
            System.out.println("Erro 404");
            e.printStackTrace();
        }
        
    }
        
        
        
    
        public void ClearScore(){
            WinnerPlayer1 = 0;
            WinnerPlayer2 = 0;
            BreakEven = 0;
            WinsPlayer1.setText("Wins: "+String.valueOf(WinnerPlayer1));
            WinsPlayer2.setText("Wins: "+String.valueOf(WinnerPlayer2));
            RoundTied.setText("Round Tied: "+String.valueOf(BreakEven));
        } 
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Player1AndSymbolX = new javax.swing.JLabel();
        WinsPlayer1 = new javax.swing.JLabel();
        Player2AndSymbolO = new javax.swing.JLabel();
        WinsPlayer2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        RoundTied = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NewGame = new javax.swing.JButton();
        LeaveGame = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JDV");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(B1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "JDV Game Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        Player1AndSymbolX.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Player1AndSymbolX.setForeground(new java.awt.Color(51, 51, 51));
        Player1AndSymbolX.setText("PLAYER 1   X ");

        WinsPlayer1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        WinsPlayer1.setForeground(new java.awt.Color(51, 51, 51));
        WinsPlayer1.setText("Wins: 0");

        Player2AndSymbolO.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Player2AndSymbolO.setForeground(new java.awt.Color(51, 51, 51));
        Player2AndSymbolO.setText("PLAYER 2   O ");

        WinsPlayer2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        WinsPlayer2.setForeground(new java.awt.Color(51, 51, 51));
        WinsPlayer2.setText("Wins: 0");

        RoundTied.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        RoundTied.setForeground(new java.awt.Color(51, 51, 51));
        RoundTied.setText("Round Tied: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RoundTied)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Player2AndSymbolO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WinsPlayer2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Player1AndSymbolX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WinsPlayer1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1AndSymbolX)
                    .addComponent(WinsPlayer1))
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player2AndSymbolO)
                    .addComponent(WinsPlayer2))
                .addGap(38, 38, 38)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RoundTied)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "JDV Game Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        NewGame.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        NewGame.setText("New Game");
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });

        LeaveGame.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        LeaveGame.setText("Leave the Game");
        LeaveGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeaveGame, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(LeaveGame, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        
        if (Player1Active == true ) {
            if (B1.getText().equals("")) { 
                B1.setText("X");
            PlayerActive();
            }
        } else {
          if (B1.getText().equals("")) {
              B1.setText("O");
            PlayerActive();
          }
       }
    
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        
        if (Player1Active == true ) {
            if (B2.getText().equals("")) { 
                B2.setText("X");
            PlayerActive();
            }
        } else {
          if (B2.getText().equals("")) {
              B2.setText("O");
            PlayerActive();
          }
       }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        
        if (Player1Active == true ) {
            if (B3.getText().equals("")) { 
                B3.setText("X");
            PlayerActive();
            }
        } else {
          if (B3.getText().equals("")) {
              B3.setText("O");
            PlayerActive();
          }
       }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
           if (Player1Active == true ) {
            if (B4.getText().equals("")) { 
                B4.setText("X");
            PlayerActive();
            }
        } else {
          if (B4.getText().equals("")) {
              B4.setText("O");
            PlayerActive();
          }
       }
          
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        
        if (Player1Active == true ) {
            if (B5.getText().equals("")) { 
                B5.setText("X");
            PlayerActive();
            }
        } else {
          if (B5.getText().equals("")) {
              B5.setText("O");
            PlayerActive();
          }
       }
        
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        
        if (Player1Active == true ) {
            if (B6.getText().equals("")) { 
                B6.setText("X");
            PlayerActive();
            }
        } else {
          if (B6.getText().equals("")) {
              B6.setText("O");
            PlayerActive();
          }
       }
        
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        
        if (Player1Active == true ) {
            if (B7.getText().equals("")) { 
                B7.setText("X");
            PlayerActive();
            }
        } else {
          if (B7.getText().equals("")) {
              B7.setText("O");
            PlayerActive();
          }
       }
        
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        
        if (Player1Active == true ) {
            if (B8.getText().equals("")) { 
                B8.setText("X");
            PlayerActive();
            }
        } else {
          if (B8.getText().equals("")) {
              B8.setText("O");
            PlayerActive();
          }
       }
        
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        
        if (Player1Active == true ) {
            if (B9.getText().equals("")) { 
                B9.setText("X");
            PlayerActive();
            }
        } else {
          if (B9.getText().equals("")) {
              B9.setText("O");
            PlayerActive();
          }
       }
        
    }//GEN-LAST:event_B9ActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        
      ClearData();
      ClearScore();
      
    }//GEN-LAST:event_NewGameActionPerformed

    private void LeaveGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveGameActionPerformed
        
      System.exit(0);
        
    }//GEN-LAST:event_LeaveGameActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelhaJDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelhaJDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelhaJDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelhaJDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelhaJDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton LeaveGame;
    private javax.swing.JButton NewGame;
    private javax.swing.JLabel Player1AndSymbolX;
    private javax.swing.JLabel Player2AndSymbolO;
    private javax.swing.JLabel RoundTied;
    private javax.swing.JLabel WinsPlayer1;
    private javax.swing.JLabel WinsPlayer2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
