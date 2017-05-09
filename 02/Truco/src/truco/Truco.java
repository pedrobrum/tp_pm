package truco;

public class Truco extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Truco() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setPreferredSize(new java.awt.Dimension(500, 500));

        buttonIniciar.setText("Iniciar");
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        panelPontuacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonIniciar))
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addComponent(panelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 398, Short.MAX_VALUE))
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                .addComponent(panelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addComponent(buttonIniciar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIniciarActionPerformed
        System.out.println("Ola");
    }//GEN-LAST:event_buttonIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Truco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIniciar;
    private javax.swing.JLabel labelTime1Ponto;
    private javax.swing.JLabel labelTime2Ponto;
    private javax.swing.JLabel labelTituloPontuacao;
    private javax.swing.JLabel labelTituloTime1;
    private javax.swing.JLabel labelTituloTime2;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelPontuacao;
    // End of variables declaration//GEN-END:variables
}
