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

public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {

        initComponents();
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JComboBox<String> getjComboBoxStatus() {
        return jComboBoxStatus;
    }

    public void setjComboBoxStatus(JComboBox<String> jComboBoxStatus) {
        this.jComboBoxStatus = jComboBoxStatus;
    }

    public JFormattedTextField getjFormattedTextFieldFone2() {
        return jFormattedTextFieldFone2;
    }

    public void setjFormattedTextFieldFone2(JFormattedTextField jFormattedTextFieldFone2) {
        this.jFormattedTextFieldFone2 = jFormattedTextFieldFone2;
    }

    public JLabel getjLabelBairro() {
        return jLabelBairro;
    }

    public void setjLabelBairro(JLabel jLabelBairro) {
        this.jLabelBairro = jLabelBairro;
    }

    public JLabel getjLabelCep() {
        return jLabelCep;
    }

    public void setjLabelCep(JLabel jLabelCep) {
        this.jLabelCep = jLabelCep;
    }

    public JLabel getjLabelCidade() {
        return jLabelCidade;
    }

    public void setjLabelCidade(JLabel jLabelCidade) {
        this.jLabelCidade = jLabelCidade;
    }

    public JLabel getjLabelComplemento() {
        return jLabelComplemento;
    }

    public void setjLabelComplemento(JLabel jLabelComplemento) {
        this.jLabelComplemento = jLabelComplemento;
    }

    public JLabel getjLabelCpf() {
        return jLabelCpf;
    }

    public void setjLabelCpf(JLabel jLabelCpf) {
        this.jLabelCpf = jLabelCpf;
    }

    public JLabel getjLabelDatCadastro() {
        return jLabelDatCadastro;
    }

    public void setjLabelDatCadastro(JLabel jLabelDatCadastro) {
        this.jLabelDatCadastro = jLabelDatCadastro;
    }

    public JLabel getjLabelDatNasc() {
        return jLabelDatNasc;
    }

    public void setjLabelDatNasc(JLabel jLabelDatNasc) {
        this.jLabelDatNasc = jLabelDatNasc;
    }

    public JLabel getjLabelEmail() {
        return jLabelEmail;
    }

    public void setjLabelEmail(JLabel jLabelEmail) {
        this.jLabelEmail = jLabelEmail;
    }

    public JLabel getjLabelFone1() {
        return jLabelFone1;
    }

    public void setjLabelFone1(JLabel jLabelFone1) {
        this.jLabelFone1 = jLabelFone1;
    }

    public JLabel getjLabelFone2() {
        return jLabelFone2;
    }

    public void setjLabelFone2(JLabel jLabelFone2) {
        this.jLabelFone2 = jLabelFone2;
    }

    public JLabel getjLabelId() {
        return jLabelId;
    }

    public void setjLabelId(JLabel jLabelId) {
        this.jLabelId = jLabelId;
    }

    public JLabel getjLabelLogradouro() {
        return jLabelLogradouro;
    }

    public void setjLabelLogradouro(JLabel jLabelLogradouro) {
        this.jLabelLogradouro = jLabelLogradouro;
    }

    public JLabel getjLabelNome() {
        return jLabelNome;
    }

    public void setjLabelNome(JLabel jLabelNome) {
        this.jLabelNome = jLabelNome;
    }

    public JLabel getjLabelObserv() {
        return jLabelObserv;
    }

    public void setjLabelObserv(JLabel jLabelObserv) {
        this.jLabelObserv = jLabelObserv;
    }

    public JLabel getjLabelRg() {
        return jLabelRg;
    }

    public void setjLabelRg(JLabel jLabelRg) {
        this.jLabelRg = jLabelRg;
    }

    public JLabel getjLabelSexo() {
        return jLabelSexo;
    }

    public void setjLabelSexo(JLabel jLabelSexo) {
        this.jLabelSexo = jLabelSexo;
    }

    public JLabel getjLabelStatus() {
        return jLabelStatus;
    }

    public void setjLabelStatus(JLabel jLabelStatus) {
        this.jLabelStatus = jLabelStatus;
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

    public JPanel getjPanelTitulo() {
        return jPanelTitulo;
    }

    public void setjPanelTitulo(JPanel jPanelTitulo) {
        this.jPanelTitulo = jPanelTitulo;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getjTextAreaObserv() {
        return jTextAreaObserv;
    }

    public void setjTextAreaObserv(JTextArea jTextAreaObserv) {
        this.jTextAreaObserv = jTextAreaObserv;
    }

    public JTextField getjTextFieldBairro() {
        return jTextFieldBairro;
    }

    public void setjTextFieldBairro(JTextField jTextFieldBairro) {
        this.jTextFieldBairro = jTextFieldBairro;
    }

    public JTextField getjTextFieldCidade() {
        return jTextFieldCidade;
    }

    public void setjTextFieldCidade(JTextField jTextFieldCidade) {
        this.jTextFieldCidade = jTextFieldCidade;
    }

    public JTextField getjTextFieldComplemento() {
        return jTextFieldComplemento;
    }

    public void setjTextFieldComplemento(JTextField jTextFieldComplemento) {
        this.jTextFieldComplemento = jTextFieldComplemento;
    }

    public JTextField getjTextFieldDatCadastro() {
        return jTextFieldDatCadastro;
    }

    public void setjTextFieldDatCadastro(JTextField jTextFieldDatCadastro) {
        this.jTextFieldDatCadastro = jTextFieldDatCadastro;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public void setjTextFieldId(JTextField jTextFieldId) {
        this.jTextFieldId = jTextFieldId;
    }

    public JTextField getjTextFieldLogradouro() {
        return jTextFieldLogradouro;
    }

    public void setjTextFieldLogradouro(JTextField jTextFieldLogradouro) {
        this.jTextFieldLogradouro = jTextFieldLogradouro;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public boolean isRootPaneCheckingEnabled() {
        return rootPaneCheckingEnabled;
    }

    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
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

    public JButton getjButtonGravar() {
        return jButtonGravar;
    }

    public void setjButtonGravar(JButton jButtonGravar) {
        this.jButtonGravar = jButtonGravar;
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

    public JComboBox<String> getjComboBoxSexo() {
        return jComboBoxSexo;
    }

    public void setjComboBoxSexo(JComboBox<String> jComboBoxSexo) {
        this.jComboBoxSexo = jComboBoxSexo;
    }

    public JFormattedTextField getjFormattedCpf() {
        return jFormattedCpf;
    }

    public void setjFormattedCpf(JFormattedTextField jFormattedCpf) {
        this.jFormattedCpf = jFormattedCpf;
    }

    public JFormattedTextField getjFormattedDatNasci() {
        return jFormattedDatNasci;
    }

    public void setjFormattedDatNasci(JFormattedTextField jFormattedDatNasci) {
        this.jFormattedDatNasci = jFormattedDatNasci;
    }

    public JFormattedTextField getjFormattedRg() {
        return jFormattedRg;
    }

    public void setjFormattedRg(JFormattedTextField jFormattedRg) {
        this.jFormattedRg = jFormattedRg;
    }

    public JPanel getjPanelDados() {
        return jPanelDados;
    }

    public void setjPanelDados(JPanel jPanelDados) {
        this.jPanelDados = jPanelDados;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JFormattedTextField getjFormattedTextFieldCep() {
        return jFormattedTextFieldCep;
    }

    public void setjFormattedTextFieldCep(JFormattedTextField jFormattedTextFieldCep) {
        this.jFormattedTextFieldCep = jFormattedTextFieldCep;
    }

    public JFormattedTextField getjFormattedTextFieldFone1() {
        return jFormattedTextFieldFone1;
    }

    public void setjFormattedTextFieldFone1(JFormattedTextField jFormattedTextFieldFone1) {
        this.jFormattedTextFieldFone1 = jFormattedTextFieldFone1;
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
         //       ((JTextField) componente).setText("");
            } else if (componente instanceof JFormattedTextField) {
                ((JFormattedTextField) componente).setText("");
            } else if (componente instanceof JTextArea) {
                ((JTextArea) componente).setText("");
            } else if (componente instanceof JComboBox) {
                ((JComboBox) componente).setSelectedIndex(0);
            } else if (componente instanceof JScrollPane) {
                //((JScrollPane) componente).getClass();

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
        jLabelCpf = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jLabelDatNasc = new javax.swing.JLabel();
        jFormattedCpf = new javax.swing.JFormattedTextField();
        jFormattedRg = new javax.swing.JFormattedTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabelSexo = new javax.swing.JLabel();
        jFormattedDatNasci = new javax.swing.JFormattedTextField();
        jLabelId = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabelDatCadastro = new javax.swing.JLabel();
        jTextFieldDatCadastro = new javax.swing.JTextField();
        jLabelFone2 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jFormattedTextFieldFone2 = new javax.swing.JFormattedTextField();
        jLabelFone1 = new javax.swing.JLabel();
        jFormattedTextFieldFone1 = new javax.swing.JFormattedTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObserv = new javax.swing.JTextArea();
        jLabelObserv = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelLogradouro = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(204, 51, 0));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelTitulo.setForeground(new java.awt.Color(102, 255, 51));

        jLabeltitulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabeltitulo.setForeground(new java.awt.Color(255, 255, 0));
        jLabeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltitulo.setText("Cliente");

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

        jLabelCpf.setText("CPF*");

        jLabelRg.setText("R.G.");

        jLabelDatNasc.setText("Data de Nascimento");

        try {
            jFormattedCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione\t", "Masculino", "Feminino", "Outros" }));
        jComboBoxSexo.setPreferredSize(new java.awt.Dimension(60, 22));

        jLabelSexo.setText("Sexo");

        try {
            jFormattedDatNasci.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelId.setText("Código");

        jLabelNome.setText("Nome*");

        jTextFieldId.setEditable(false);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelStatus.setText("Status");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jLabelDatCadastro.setText("Data de Cadastro");

        jLabelFone2.setText("Fone 2");

        jLabelEmail.setText("E-mail");

        try {
            jFormattedTextFieldFone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelFone1.setText("Fone 1*");

        try {
            jFormattedTextFieldFone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextAreaObserv.setColumns(20);
        jTextAreaObserv.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObserv);

        jLabelObserv.setText("Observação");

        jLabelCep.setText("CEP*");

        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+");

        jLabelCidade.setText("Cidade");

        jTextFieldCidade.setEditable(false);

        jLabelLogradouro.setText("Logradouro ");

        jLabelBairro.setText("Bairro");

        jTextFieldBairro.setEditable(false);

        jTextFieldLogradouro.setEditable(false);

        jLabelComplemento.setText("Complemento");

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jFormattedCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCep, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelDadosLayout.createSequentialGroup()
                                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(jLabelDatNasc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFormattedDatNasci))
                                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jFormattedTextFieldFone1)))
                                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanelDadosLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabelComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(134, 134, 134))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosLayout.createSequentialGroup()
                                            .addComponent(jFormattedTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 47, Short.MAX_VALUE))
                                .addGroup(jPanelDadosLayout.createSequentialGroup()
                                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jFormattedRg, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxStatus, 0, 123, Short.MAX_VALUE)
                                        .addComponent(jLabelDatCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldDatCadastro))
                                    .addGap(47, 47, 47))))
                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabelObserv, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelDadosLayout.createSequentialGroup()
                            .addComponent(jScrollPane1)
                            .addGap(47, 47, 47)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelRg)
                    .addComponent(jLabelSexo)
                    .addComponent(jLabelDatCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDatCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFone1)
                    .addComponent(jLabelFone2)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelDatNasc))
                .addGap(10, 10, 10)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedDatNasci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldFone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jLabelComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelObserv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JFormattedTextField jFormattedCpf;
    private javax.swing.JFormattedTextField jFormattedDatNasci;
    private javax.swing.JFormattedTextField jFormattedRg;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone1;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDatCadastro;
    private javax.swing.JLabel jLabelDatNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFone1;
    private javax.swing.JLabel jLabelFone2;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelObserv;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObserv;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldDatCadastro;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
