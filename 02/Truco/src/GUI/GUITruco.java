package GUI;

import truco.Baralho;
import truco.Exibivel;
import truco.Jogador;
import truco.Time;
import truco.Truco;

public class GUITruco extends javax.swing.JFrame {
    
    private final Truco truco;
    
    public GUITruco() {
        initComponents();
        truco = new Truco(
            new Time[]{
                new Time((JLabelExibivel)labelTime0Ponto),
                new Time((JLabelExibivel)labelTime1Ponto)
            },          
            new Jogador[]{
                new Jogador(
                        new JButtonCarta[]{
                            (JButtonCarta)buttonJ0C0,
                            (JButtonCarta)buttonJ0C1,
                            (JButtonCarta)buttonJ0C2},
                        (JButtonCarta)buttonJ0C),
                new Jogador(
                        new JButtonCarta[]{
                            (JButtonCarta)buttonJ1C0,
                            (JButtonCarta)buttonJ1C1,
                            (JButtonCarta)buttonJ1C2},
                        (JButtonCarta)buttonJ1C),
                new Jogador(
                        new JButtonCarta[]{
                            (JButtonCarta)buttonJ2C0,
                            (JButtonCarta)buttonJ2C1,
                            (JButtonCarta)buttonJ2C2},
                        (JButtonCarta)buttonJ2C),
                new Jogador(
                        new JButtonCarta[]{
                            (JButtonCarta)buttonJ3C0,
                            (JButtonCarta)buttonJ3C1,
                            (JButtonCarta)buttonJ3C2},
                        (JButtonCarta)buttonJ3C)
            },
            Baralho.getInstance(),
            (Exibivel) labelFeed);
        truco.iniciarJogo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelPontuacao = new javax.swing.JPanel();
        labelTituloPontuacao = new javax.swing.JLabel();
        labelTituloTime0 = new javax.swing.JLabel();
        labelTituloTime1 = new javax.swing.JLabel();
        labelTime0Ponto = new JLabelExibivel();
        labelTime1Ponto = new JLabelExibivel();
        buttonJ0C = new JButtonCarta();
        buttonJ0C0 = new JButtonCarta();
        buttonJ0C1 = new JButtonCarta();
        buttonJ0C2 = new JButtonCarta();
        buttonJ1C = new JButtonCarta();
        buttonJ1C0 = new JButtonCarta();
        buttonJ1C1 = new JButtonCarta();
        buttonJ1C2 = new JButtonCarta();
        buttonJ2C = new JButtonCarta();
        buttonJ2C0 = new JButtonCarta();
        buttonJ2C1 = new JButtonCarta();
        buttonJ2C2 = new JButtonCarta();
        buttonJ3C = new JButtonCarta();
        buttonJ3C0 = new JButtonCarta();
        buttonJ3C1 = new JButtonCarta();
        buttonJ3C2 = new JButtonCarta();
        buttonIniciar = new javax.swing.JButton();
        buttonTrucar = new javax.swing.JButton();
        buttonDesistir = new javax.swing.JButton();
        labelFeed = new JLabelExibivel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setMaximumSize(new java.awt.Dimension(500, 500));
        panelBase.setMinimumSize(new java.awt.Dimension(500, 500));
        panelBase.setPreferredSize(new java.awt.Dimension(500, 500));

        panelPontuacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPontuacao.setMaximumSize(new java.awt.Dimension(100, 100));

        labelTituloPontuacao.setText("Pontuação");

        labelTituloTime0.setText("- :");

        labelTituloTime1.setText("| :");

        labelTime0Ponto.setText("?");

        labelTime1Ponto.setText("?");

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
                        .addComponent(labelTituloTime0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTime0Ponto))
                    .addGroup(panelPontuacaoLayout.createSequentialGroup()
                        .addComponent(labelTituloTime1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTime1Ponto)))
                .addContainerGap())
        );
        panelPontuacaoLayout.setVerticalGroup(
            panelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPontuacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloPontuacao)
                .addGap(18, 18, 18)
                .addGroup(panelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloTime0)
                    .addComponent(labelTime0Ponto))
                .addGap(18, 18, 18)
                .addGroup(panelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloTime1)
                    .addComponent(labelTime1Ponto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonJ0C.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ0C.setText("🂡\t");
        buttonJ0C.setBorder(null);
        buttonJ0C.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ0C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ0CActionPerformed(evt);
            }
        });

        buttonJ0C0.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ0C0.setText("?");
        buttonJ0C0.setBorder(null);
        buttonJ0C0.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ0C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ0C0ActionPerformed(evt);
            }
        });

        buttonJ0C1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ0C1.setText("?");
        buttonJ0C1.setBorder(null);
        buttonJ0C1.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ0C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ0C1ActionPerformed(evt);
            }
        });

        buttonJ0C2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ0C2.setText("?");
        buttonJ0C2.setBorder(null);
        buttonJ0C2.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ0C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ0C2ActionPerformed(evt);
            }
        });

        buttonJ1C.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ1C.setText("🂡\t");
        buttonJ1C.setBorder(null);
        buttonJ1C.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ1CActionPerformed(evt);
            }
        });

        buttonJ1C0.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ1C0.setText("?");
        buttonJ1C0.setBorder(null);
        buttonJ1C0.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ1C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ1C0ActionPerformed(evt);
            }
        });

        buttonJ1C1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ1C1.setText("?");
        buttonJ1C1.setBorder(null);
        buttonJ1C1.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ1C1ActionPerformed(evt);
            }
        });

        buttonJ1C2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ1C2.setText("?");
        buttonJ1C2.setBorder(null);
        buttonJ1C2.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ1C2ActionPerformed(evt);
            }
        });

        buttonJ2C.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ2C.setText("🂡\t");
        buttonJ2C.setBorder(null);
        buttonJ2C.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ2CActionPerformed(evt);
            }
        });

        buttonJ2C0.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ2C0.setText("?");
        buttonJ2C0.setBorder(null);
        buttonJ2C0.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ2C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ2C0ActionPerformed(evt);
            }
        });

        buttonJ2C1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ2C1.setText("?");
        buttonJ2C1.setBorder(null);
        buttonJ2C1.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ2C1ActionPerformed(evt);
            }
        });

        buttonJ2C2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ2C2.setText("?");
        buttonJ2C2.setBorder(null);
        buttonJ2C2.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ2C2ActionPerformed(evt);
            }
        });

        buttonJ3C.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ3C.setText("🂡\t");
        buttonJ3C.setBorder(null);
        buttonJ3C.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ3CActionPerformed(evt);
            }
        });

        buttonJ3C0.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ3C0.setText("?");
        buttonJ3C0.setBorder(null);
        buttonJ3C0.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ3C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ3C0ActionPerformed(evt);
            }
        });

        buttonJ3C1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ3C1.setText("?");
        buttonJ3C1.setBorder(null);
        buttonJ3C1.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ3C1ActionPerformed(evt);
            }
        });

        buttonJ3C2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        buttonJ3C2.setText("?");
        buttonJ3C2.setBorder(null);
        buttonJ3C2.setPreferredSize(new java.awt.Dimension(55, 57));
        buttonJ3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ3C2ActionPerformed(evt);
            }
        });

        buttonIniciar.setText("Iniciar");
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        buttonTrucar.setText("Trucar");
        buttonTrucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrucarActionPerformed(evt);
            }
        });

        buttonDesistir.setText("Desistir");
        buttonDesistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDesistirActionPerformed(evt);
            }
        });

        labelFeed.setText("*");

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addComponent(panelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBaseLayout.createSequentialGroup()
                                        .addComponent(labelFeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonJ0C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelBaseLayout.createSequentialGroup()
                                        .addComponent(buttonJ1C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonJ0C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonJ0C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonJ0C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBaseLayout.createSequentialGroup()
                                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonJ1C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonJ1C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelBaseLayout.createSequentialGroup()
                                        .addComponent(buttonJ2C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(buttonJ2C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonJ2C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonJ2C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelBaseLayout.createSequentialGroup()
                                        .addComponent(buttonJ1C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonJ3C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(62, 62, 62)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonJ3C0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonJ3C1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonJ3C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTrucar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDesistir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonJ2C0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonJ2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonJ2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonJ1C0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonJ2C, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonJ3C0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonJ1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonJ1C, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonJ3C, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonJ3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonJ0C, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonJ1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonJ3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonJ0C0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonJ0C1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonJ0C2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelFeed, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonDesistir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTrucar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonIniciar)))
                .addContainerGap())
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
        truco.iniciarRodada();
    }//GEN-LAST:event_buttonIniciarActionPerformed

    private void buttonJ0C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ0C0ActionPerformed
        truco.jogarCarta(0, 0);
    }//GEN-LAST:event_buttonJ0C0ActionPerformed

    private void buttonJ0CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ0CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonJ0CActionPerformed

    private void buttonJ0C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ0C1ActionPerformed
        truco.jogarCarta(0, 1);
    }//GEN-LAST:event_buttonJ0C1ActionPerformed

    private void buttonJ0C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ0C2ActionPerformed
        truco.jogarCarta(0, 2);
    }//GEN-LAST:event_buttonJ0C2ActionPerformed

    private void buttonJ1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ1C2ActionPerformed
        truco.jogarCarta(1, 2);
    }//GEN-LAST:event_buttonJ1C2ActionPerformed

    private void buttonJ1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ1C1ActionPerformed
        truco.jogarCarta(1, 1);
    }//GEN-LAST:event_buttonJ1C1ActionPerformed

    private void buttonJ1C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ1C0ActionPerformed
        truco.jogarCarta(1, 0);
    }//GEN-LAST:event_buttonJ1C0ActionPerformed

    private void buttonJ1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ1CActionPerformed

    }//GEN-LAST:event_buttonJ1CActionPerformed

    private void buttonJ2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ2CActionPerformed

    }//GEN-LAST:event_buttonJ2CActionPerformed

    private void buttonJ2C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ2C0ActionPerformed
        truco.jogarCarta(2, 0);
    }//GEN-LAST:event_buttonJ2C0ActionPerformed

    private void buttonJ2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ2C1ActionPerformed
        truco.jogarCarta(2, 1);
    }//GEN-LAST:event_buttonJ2C1ActionPerformed

    private void buttonJ2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ2C2ActionPerformed
        truco.jogarCarta(2, 2);
    }//GEN-LAST:event_buttonJ2C2ActionPerformed

    private void buttonJ3C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ3C0ActionPerformed
        truco.jogarCarta(3, 0);
    }//GEN-LAST:event_buttonJ3C0ActionPerformed

    private void buttonJ3CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ3CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonJ3CActionPerformed

    private void buttonJ3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ3C1ActionPerformed
        truco.jogarCarta(3, 1);
    }//GEN-LAST:event_buttonJ3C1ActionPerformed

    private void buttonJ3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ3C2ActionPerformed
        truco.jogarCarta(3, 2);
    }//GEN-LAST:event_buttonJ3C2ActionPerformed

    private void buttonTrucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrucarActionPerformed
        truco.trucar();
    }//GEN-LAST:event_buttonTrucarActionPerformed

    private void buttonDesistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDesistirActionPerformed
        truco.aceitar();
    }//GEN-LAST:event_buttonDesistirActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUITruco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDesistir;
    private javax.swing.JButton buttonIniciar;
    private javax.swing.JButton buttonJ0C;
    private javax.swing.JButton buttonJ0C0;
    private javax.swing.JButton buttonJ0C1;
    private javax.swing.JButton buttonJ0C2;
    private javax.swing.JButton buttonJ1C;
    private javax.swing.JButton buttonJ1C0;
    private javax.swing.JButton buttonJ1C1;
    private javax.swing.JButton buttonJ1C2;
    private javax.swing.JButton buttonJ2C;
    private javax.swing.JButton buttonJ2C0;
    private javax.swing.JButton buttonJ2C1;
    private javax.swing.JButton buttonJ2C2;
    private javax.swing.JButton buttonJ3C;
    private javax.swing.JButton buttonJ3C0;
    private javax.swing.JButton buttonJ3C1;
    private javax.swing.JButton buttonJ3C2;
    private javax.swing.JButton buttonTrucar;
    private javax.swing.JLabel labelFeed;
    private javax.swing.JLabel labelTime0Ponto;
    private javax.swing.JLabel labelTime1Ponto;
    private javax.swing.JLabel labelTituloPontuacao;
    private javax.swing.JLabel labelTituloTime0;
    private javax.swing.JLabel labelTituloTime1;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelPontuacao;
    // End of variables declaration//GEN-END:variables
}
