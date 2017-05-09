package truco;

import javax.swing.JButton;

public class Truco extends javax.swing.JFrame {

    
    private final Jogador jogador[];
    
    public Truco() {
        initComponents();
        jogador = new Jogador[4];
        jogador[0] = new Jogador(new JButton[]{buttonJ0C0, buttonJ0C1, buttonJ0C2}, buttonJ0C);
//        jogador[1] = new Jogador(new JLabel[]{labelJ1C0, labelJ1C1, labelJ1C2}, labelJ1C);
//        jogador[2] = new Jogador(new JLabel[]{labelJ2C0, labelJ2C1, labelJ2C2}, labelJ2C);
//        jogador[3] = new Jogador(new JLabel[]{labelJ3C0, labelJ3C1, labelJ3C2}, labelJ3C);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        buttonIniciar = new javax.swing.JButton();
        panelPontuacao = new javax.swing.JPanel();
        labelTituloPontuacao = new javax.swing.JLabel();
        labelTituloTime1 = new javax.swing.JLabel();
        labelTituloTime2 = new javax.swing.JLabel();
        labelTime1Ponto = new javax.swing.JLabel();
        labelTime2Ponto = new javax.swing.JLabel();
        labelJ1C0 = new javax.swing.JLabel();
        labelJ1C1 = new javax.swing.JLabel();
        labelJ1C2 = new javax.swing.JLabel();
        labelJ2C0 = new javax.swing.JLabel();
        labelJ2C1 = new javax.swing.JLabel();
        labelJ2C2 = new javax.swing.JLabel();
        labelJ3C0 = new javax.swing.JLabel();
        labelJ3C1 = new javax.swing.JLabel();
        labelJ3C2 = new javax.swing.JLabel();
        buttonJ0C = new javax.swing.JButton();
        buttonJ0C0 = new javax.swing.JButton();
        buttonJ0C1 = new javax.swing.JButton();
        buttonJ0C2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setMaximumSize(new java.awt.Dimension(500, 500));
        panelBase.setMinimumSize(new java.awt.Dimension(500, 500));
        panelBase.setPreferredSize(new java.awt.Dimension(500, 500));

        buttonIniciar.setText("Iniciar");
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        panelPontuacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPontuacao.setMaximumSize(new java.awt.Dimension(100, 100));

        labelTituloPontuacao.setText("Pontuação");

        labelTituloTime1.setText("- :");

        labelTituloTime2.setText("| :");

        labelTime1Ponto.setText("?");

        labelTime2Ponto.setText("?");

        javax.swing.GroupLayout panelPontuacaoLayout = new javax.swing.GroupLayout(panelPontuacao);
        panelPontuacao.setLayout(panelPontuacaoLayout);
        panelPontuacaoLayout.setHorizontalGroup(
            panelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPontuacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPontuacaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelTituloPontuacao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelPontuacaoLayout.createSequentialGroup()
                        .addComponent(labelTituloTime1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTime1Ponto))
                    .addGroup(panelPontuacaoLayout.createSequentialGroup()
                        .addComponent(labelTituloTime2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTime2Ponto)))
                .addContainerGap())
        );
        panelPontuacaoLayout.setVerticalGroup(
            panelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPontuacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloPontuacao)
                .addGap(18, 18, 18)
                .addGroup(panelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloTime1)
                    .addComponent(labelTime1Ponto))
                .addGap(18, 18, 18)
                .addGroup(panelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloTime2)
                    .addComponent(labelTime2Ponto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelJ1C0.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelJ1C0.setText("🂡\t");

        labelJ1C1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelJ1C1.setText("🂡\t");

        labelJ1C2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelJ1C2.setText("🂡\t");

        labelJ2C0.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelJ2C0.setText("🂡\t");

        labelJ2C1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelJ2C1.setText("🂡\t");

        labelJ2C2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelJ2C2.setText("🂡\t");

        labelJ3C0.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelJ3C0.setText("🂡\t");

        labelJ3C1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelJ3C1.setText("🂡\t");

        labelJ3C2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelJ3C2.setText("🂡\t");

        buttonJ0C.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ0C.setText("🂡\t");
        buttonJ0C.setBorder(null);
        buttonJ0C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ0CActionPerformed(evt);
            }
        });

        buttonJ0C0.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ0C0.setText("?");
        buttonJ0C0.setBorder(null);
        buttonJ0C0.setPreferredSize(new java.awt.Dimension(49, 57));
        buttonJ0C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ0C0ActionPerformed(evt);
            }
        });

        buttonJ0C1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ0C1.setText("?");
        buttonJ0C1.setBorder(null);
        buttonJ0C1.setPreferredSize(new java.awt.Dimension(49, 57));
        buttonJ0C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ0C1ActionPerformed(evt);
            }
        });

        buttonJ0C2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ0C2.setText("?");
        buttonJ0C2.setBorder(null);
        buttonJ0C2.setPreferredSize(new java.awt.Dimension(49, 57));
        buttonJ0C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ0C2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJ1C0)
                            .addComponent(labelJ1C1)
                            .addComponent(labelJ1C2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJ3C0)
                            .addComponent(labelJ3C1)
                            .addComponent(labelJ3C2)))
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addComponent(panelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(labelJ2C0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelJ2C1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelJ2C2))
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonJ0C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonJ0C)
                                    .addGroup(panelBaseLayout.createSequentialGroup()
                                        .addComponent(buttonJ0C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonJ0C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(buttonIniciar)))
                .addContainerGap())
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJ2C0)
                            .addComponent(labelJ2C1)
                            .addComponent(labelJ2C2))))
                .addGap(72, 72, 72)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addComponent(labelJ3C0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelJ3C1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelJ3C2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonIniciar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonJ0C0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonJ0C1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonJ0C2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBaseLayout.createSequentialGroup()
                        .addComponent(labelJ1C0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelJ1C1)
                        .addGap(0, 0, 0)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJ1C2)
                            .addComponent(buttonJ0C, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIniciarActionPerformed
        Baralho b = new Baralho();
        for (int i = 0; i < 1; i++)
            jogador[i].receberCarta(new Carta[]{b.getTopo(), b.getTopo(), b.getTopo()});
    }//GEN-LAST:event_buttonIniciarActionPerformed

    private void buttonJ0C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ0C0ActionPerformed
            jogador[0].jogarCarta(0);
    }//GEN-LAST:event_buttonJ0C0ActionPerformed

    private void buttonJ0CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ0CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonJ0CActionPerformed

    private void buttonJ0C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ0C1ActionPerformed
        jogador[0].jogarCarta(1);
    }//GEN-LAST:event_buttonJ0C1ActionPerformed

    private void buttonJ0C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ0C2ActionPerformed
        jogador[0].jogarCarta(2);
    }//GEN-LAST:event_buttonJ0C2ActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Truco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIniciar;
    private javax.swing.JButton buttonJ0C;
    private javax.swing.JButton buttonJ0C0;
    private javax.swing.JButton buttonJ0C1;
    private javax.swing.JButton buttonJ0C2;
    private javax.swing.JLabel labelJ1C0;
    private javax.swing.JLabel labelJ1C1;
    private javax.swing.JLabel labelJ1C2;
    private javax.swing.JLabel labelJ2C0;
    private javax.swing.JLabel labelJ2C1;
    private javax.swing.JLabel labelJ2C2;
    private javax.swing.JLabel labelJ3C0;
    private javax.swing.JLabel labelJ3C1;
    private javax.swing.JLabel labelJ3C2;
    private javax.swing.JLabel labelTime1Ponto;
    private javax.swing.JLabel labelTime2Ponto;
    private javax.swing.JLabel labelTituloPontuacao;
    private javax.swing.JLabel labelTituloTime1;
    private javax.swing.JLabel labelTituloTime2;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelPontuacao;
    // End of variables declaration//GEN-END:variables
}
