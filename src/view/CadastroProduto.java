package view;

import java.awt.Component;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastroProduto extends javax.swing.JFrame {

    public CadastroProduto() {
        initComponents();
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public void setjButtonBuscar(JButton jButtonBuscar) {
        this.jButtonBuscar = jButtonBuscar;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public void setjButtonCancelar(JButton jButtonCancelar) {
        this.jButtonCancelar = jButtonCancelar;
    }

    public JButton getjButtonClassse() {
        return jButtonClassse;
    }

    public void setjButtonClassse(JButton jButtonClassse) {
        this.jButtonClassse = jButtonClassse;
    }

    public JButton getjButtonGravar() {
        return jButtonGravar;
    }

    public void setjButtonGravar(JButton jButtonGravar) {
        this.jButtonGravar = jButtonGravar;
    }

    public JButton getjButtonMarcaProduto() {
        return jButtonMarcaProduto;
    }

    public void setjButtonMarcaProduto(JButton jButtonMarcaProduto) {
        this.jButtonMarcaProduto = jButtonMarcaProduto;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public void setjButtonNovo(JButton jButtonNovo) {
        this.jButtonNovo = jButtonNovo;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public void setjButtonSair(JButton jButtonSair) {
        this.jButtonSair = jButtonSair;
    }

    public JComboBox<String> getjComboStatus() {
        return jComboStatus;
    }

    public void setjComboStatus(JComboBox<String> jComboStatus) {
        this.jComboStatus = jComboStatus;
    }

    public JLabel getjLabel1UnCompra() {
        return jLabel1UnCompra;
    }

    public void setjLabel1UnCompra(JLabel jLabel1UnCompra) {
        this.jLabel1UnCompra = jLabel1UnCompra;
    }

    public JLabel getjLabelClasse() {
        return jLabelClasse;
    }

    public void setjLabelClasse(JLabel jLabelClasse) {
        this.jLabelClasse = jLabelClasse;
    }

    public JLabel getjLabelCodEntra() {
        return jLabelCodEntra;
    }

    public void setjLabelCodEntra(JLabel jLabelCodEntra) {
        this.jLabelCodEntra = jLabelCodEntra;
    }

    public JLabel getjLabelCodSaida() {
        return jLabelCodSaida;
    }

    public void setjLabelCodSaida(JLabel jLabelCodSaida) {
        this.jLabelCodSaida = jLabelCodSaida;
    }

    public JLabel getjLabelDatCadastro() {
        return jLabelDatCadastro;
    }

    public void setjLabelDatCadastro(JLabel jLabelDatCadastro) {
        this.jLabelDatCadastro = jLabelDatCadastro;
    }

    public JLabel getjLabelDescricao() {
        return jLabelDescricao;
    }

    public void setjLabelDescricao(JLabel jLabelDescricao) {
        this.jLabelDescricao = jLabelDescricao;
    }

    public JLabel getjLabelEstoqueMax() {
        return jLabelEstoqueMax;
    }

    public void setjLabelEstoqueMax(JLabel jLabelEstoqueMax) {
        this.jLabelEstoqueMax = jLabelEstoqueMax;
    }

    public JLabel getjLabelEstoqueMin() {
        return jLabelEstoqueMin;
    }

    public void setjLabelEstoqueMin(JLabel jLabelEstoqueMin) {
        this.jLabelEstoqueMin = jLabelEstoqueMin;
    }

    public JLabel getjLabelFator() {
        return jLabelFator;
    }

    public void setjLabelFator(JLabel jLabelFator) {
        this.jLabelFator = jLabelFator;
    }

    public JLabel getjLabelId() {
        return jLabelId;
    }

    public void setjLabelId(JLabel jLabelId) {
        this.jLabelId = jLabelId;
    }

    public JLabel getjLabelMarcaProduto() {
        return jLabelMarcaProduto;
    }

    public void setjLabelMarcaProduto(JLabel jLabelMarcaProduto) {
        this.jLabelMarcaProduto = jLabelMarcaProduto;
    }

    public JLabel getjLabelStatus() {
        return jLabelStatus;
    }

    public void setjLabelStatus(JLabel jLabelStatus) {
        this.jLabelStatus = jLabelStatus;
    }

    public JLabel getjLabelUnVenda() {
        return jLabelUnVenda;
    }

    public void setjLabelUnVenda(JLabel jLabelUnVenda) {
        this.jLabelUnVenda = jLabelUnVenda;
    }

    public JLabel getjLabelValorCompra() {
        return jLabelValorCompra;
    }

    public void setjLabelValorCompra(JLabel jLabelValorCompra) {
        this.jLabelValorCompra = jLabelValorCompra;
    }

    public JLabel getjLabelValorVenda() {
        return jLabelValorVenda;
    }

    public void setjLabelValorVenda(JLabel jLabelValorVenda) {
        this.jLabelValorVenda = jLabelValorVenda;
    }

    public JLabel getjLabeltitulo() {
        return jLabeltitulo;
    }

    public void setjLabeltitulo(JLabel jLabeltitulo) {
        this.jLabeltitulo = jLabeltitulo;
    }

    public JPanel getjPanelBotoes() {
        return jPanelBotoes;
    }

    public void setjPanelBotoes(JPanel jPanelBotoes) {
        this.jPanelBotoes = jPanelBotoes;
    }

    public JPanel getjPanelDados() {
        return jPanelDados;
    }

    public void setjPanelDados(JPanel jPanelDados) {
        this.jPanelDados = jPanelDados;
    }

    public JPanel getjPanelTitulo() {
        return jPanelTitulo;
    }

    public void setjPanelTitulo(JPanel jPanelTitulo) {
        this.jPanelTitulo = jPanelTitulo;
    }

    public JTextField getjTextCodEntrada() {
        return jTextCodEntrada;
    }

    public void setjTextCodEntrada(JTextField jTextCodEntrada) {
        this.jTextCodEntrada = jTextCodEntrada;
    }

    public JTextField getjTextCodSaida() {
        return jTextCodSaida;
    }

    public void setjTextCodSaida(JTextField jTextCodSaida) {
        this.jTextCodSaida = jTextCodSaida;
    }

    public JTextField getjTextDescricao() {
        return jTextDescricao;
    }

    public void setjTextDescricao(JTextField jTextDescricao) {
        this.jTextDescricao = jTextDescricao;
    }

    public JTextField getjTextEstoqueMax() {
        return jTextEstoqueMax;
    }

    public void setjTextEstoqueMax(JTextField jTextEstoqueMax) {
        this.jTextEstoqueMax = jTextEstoqueMax;
    }

    public JTextField getjTextEstoqueMin() {
        return jTextEstoqueMin;
    }

    public void setjTextEstoqueMin(JTextField jTextEstoqueMin) {
        this.jTextEstoqueMin = jTextEstoqueMin;
    }

    public JTextField getjTextFator() {
        return jTextFator;
    }

    public void setjTextFator(JTextField jTextFator) {
        this.jTextFator = jTextFator;
    }

    public JTextField getjTextFieldClasse() {
        return jTextFieldClasse;
    }

    public void setjTextFieldClasse(JTextField jTextFieldClasse) {
        this.jTextFieldClasse = jTextFieldClasse;
    }

    public JTextField getjTextFieldDatCadastro() {
        return jTextFieldDatCadastro;
    }

    public void setjTextFieldDatCadastro(JTextField jTextFieldDatCadastro) {
        this.jTextFieldDatCadastro = jTextFieldDatCadastro;
    }

    public JTextField getjTextFieldMarcaProduto() {
        return jTextFieldMarcaProduto;
    }

    public void setjTextFieldMarcaProduto(JTextField jTextFieldMarcaProduto) {
        this.jTextFieldMarcaProduto = jTextFieldMarcaProduto;
    }

    public JTextField getjTextId() {
        return jTextId;
    }

    public void setjTextId(JTextField jTextId) {
        this.jTextId = jTextId;
    }

    public JTextField getjTextUnCompra() {
        return jTextUnCompra;
    }

    public void setjTextUnCompra(JTextField jTextUnCompra) {
        this.jTextUnCompra = jTextUnCompra;
    }

    public JTextField getjTextUnVenda() {
        return jTextUnVenda;
    }

    public void setjTextUnVenda(JTextField jTextUnVenda) {
        this.jTextUnVenda = jTextUnVenda;
    }

    public JTextField getjTextValorCompra() {
        return jTextValorCompra;
    }

    public void setjTextValorCompra(JTextField jTextValorCompra) {
        this.jTextValorCompra = jTextValorCompra;
    }

    public JTextField getjTextValorVenda() {
        return jTextValorVenda;
    }

    public void setjTextValorVenda(JTextField jTextValorVenda) {
        this.jTextValorVenda = jTextValorVenda;
    }

    public void ativa(boolean estadoComponente) {
        jButtonNovo.setEnabled(estadoComponente);
        jButtonCancelar.setEnabled(!estadoComponente);
        jButtonGravar.setEnabled(!estadoComponente);
        jButtonBuscar.setEnabled(estadoComponente);
        jButtonSair.setEnabled(estadoComponente);
    }

    public void ligaDesliga(boolean estadoComponente) {

        Component[] componentes = jPanelDados.getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            } else if (componente instanceof JFormattedTextField) {
                ((JFormattedTextField) componente).setText("");
            } else if (componente instanceof JTextArea) {
                ((JTextArea) componente).setText("");
            } else if (componente instanceof JComboBox) {
                ((JComboBox) componente).setSelectedIndex(0);
            } else if (componente instanceof JScrollPane) {
                //((JScrollPane) componente).getClass().
            }
            componente.setEnabled(estadoComponente);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabeltitulo = new javax.swing.JLabel();
        jPanelDados = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextDescricao = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jComboStatus = new javax.swing.JComboBox<>();
        jLabelEstoqueMin = new javax.swing.JLabel();
        jLabelEstoqueMax = new javax.swing.JLabel();
        jLabelDatCadastro = new javax.swing.JLabel();
        jLabelCodEntra = new javax.swing.JLabel();
        jLabelCodSaida = new javax.swing.JLabel();
        jLabelUnVenda = new javax.swing.JLabel();
        jLabel1UnCompra = new javax.swing.JLabel();
        jTextUnVenda = new javax.swing.JTextField();
        jTextCodSaida = new javax.swing.JTextField();
        jTextUnCompra = new javax.swing.JTextField();
        jTextCodEntrada = new javax.swing.JTextField();
        jTextEstoqueMax = new javax.swing.JTextField();
        jTextEstoqueMin = new javax.swing.JTextField();
        jLabelValorCompra = new javax.swing.JLabel();
        jLabelValorVenda = new javax.swing.JLabel();
        jLabelFator = new javax.swing.JLabel();
        jTextValorVenda = new javax.swing.JTextField();
        jTextValorCompra = new javax.swing.JTextField();
        jTextFator = new javax.swing.JTextField();
        jTextFieldDatCadastro = new javax.swing.JTextField();
        jLabelMarcaProduto = new javax.swing.JLabel();
        jTextFieldMarcaProduto = new javax.swing.JTextField();
        jButtonMarcaProduto = new javax.swing.JButton();
        jLabelClasse = new javax.swing.JLabel();
        jTextFieldClasse = new javax.swing.JTextField();
        jButtonClassse = new javax.swing.JButton();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(204, 51, 0));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelTitulo.setForeground(new java.awt.Color(102, 255, 51));

        jLabeltitulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabeltitulo.setForeground(new java.awt.Color(255, 255, 0));
        jLabeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltitulo.setText("Produto");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeltitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelId.setText("Código");

        jTextId.setEditable(false);

        jLabelDescricao.setText("Descrição*");

        jLabelStatus.setText("Status");

        jComboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jLabelEstoqueMin.setText("Estoque Min");

        jLabelEstoqueMax.setText("Estoque Max");

        jLabelDatCadastro.setText("Data de Cadastro");

        jLabelCodEntra.setText("Cod. Entrada");

        jLabelCodSaida.setText("Cod. Saída");

        jLabelUnVenda.setText("Un. Venda");

        jLabel1UnCompra.setText("Un. Compra");

        jLabelValorCompra.setText("Valor de Compra");

        jLabelValorVenda.setText("Valor de Venda");

        jLabelFator.setText("Fator");

        jLabelMarcaProduto.setText("Marca do Produto");

        jButtonMarcaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jButtonMarcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcaProdutoActionPerformed(evt);
            }
        });

        jLabelClasse.setText("Classe");

        jButtonClassse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextUnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabelFator, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextUnCompra)
                    .addComponent(jLabel1UnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFator)
                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))
                                    .addComponent(jComboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                                        .addGap(280, 280, 280)
                                        .addComponent(jButtonMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelCodSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextCodSaida)
                                            .addComponent(jLabelCodEntra)
                                            .addComponent(jTextCodEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelEstoqueMin, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(jTextEstoqueMax)
                                            .addComponent(jTextEstoqueMin)))
                                    .addComponent(jLabelDatCadastro))
                                .addGap(20, 20, 20)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextValorVenda)
                                    .addComponent(jTextValorCompra)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jTextFieldClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jButtonClassse, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDatCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonClassse))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelId)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabelStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUnVenda)
                            .addComponent(jLabelCodSaida)
                            .addComponent(jLabelEstoqueMax)
                            .addComponent(jLabelValorVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextUnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCodSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1UnCompra)
                            .addComponent(jLabelCodEntra)
                            .addComponent(jLabelEstoqueMin)
                            .addComponent(jLabelValorCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextUnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCodEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFator)
                            .addComponent(jLabelDatCadastro)
                            .addComponent(jLabelMarcaProduto)
                            .addComponent(jLabelClasse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMarcaProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldDatCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Create.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setPreferredSize(new java.awt.Dimension(95, 30));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonNovo);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(95, 30));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonCancelar);

        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OK.png"))); // NOI18N
        jButtonGravar.setText("Gravar");
        jButtonGravar.setEnabled(false);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(95, 30));
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonGravar);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(95, 30));
        jPanelBotoes.add(jButtonBuscar);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setPreferredSize(new java.awt.Dimension(95, 30));
        jPanelBotoes.add(jButtonSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonMarcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMarcaProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(ObjetoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjetoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjetoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjetoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObjetoCadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonClassse;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonMarcaProduto;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboStatus;
    private javax.swing.JLabel jLabel1UnCompra;
    private javax.swing.JLabel jLabelClasse;
    private javax.swing.JLabel jLabelCodEntra;
    private javax.swing.JLabel jLabelCodSaida;
    private javax.swing.JLabel jLabelDatCadastro;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEstoqueMax;
    private javax.swing.JLabel jLabelEstoqueMin;
    private javax.swing.JLabel jLabelFator;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMarcaProduto;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelUnVenda;
    private javax.swing.JLabel jLabelValorCompra;
    private javax.swing.JLabel jLabelValorVenda;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextCodEntrada;
    private javax.swing.JTextField jTextCodSaida;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextEstoqueMax;
    private javax.swing.JTextField jTextEstoqueMin;
    private javax.swing.JTextField jTextFator;
    private javax.swing.JTextField jTextFieldClasse;
    private javax.swing.JTextField jTextFieldDatCadastro;
    private javax.swing.JTextField jTextFieldMarcaProduto;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextUnCompra;
    private javax.swing.JTextField jTextUnVenda;
    private javax.swing.JTextField jTextValorCompra;
    private javax.swing.JTextField jTextValorVenda;
    // End of variables declaration//GEN-END:variables
}
