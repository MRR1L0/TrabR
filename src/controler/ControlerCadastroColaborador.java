package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.DAO.BairroDAO;
import model.DAO.CidadeDAO;
import model.DAO.ColaboradorDAO;
import model.DAO.EnderecoDAO;
import model.bo.Colaborador;
import model.bo.Endereco;
import view.CadastroColaborador;
import view.FormBusColaborador;

public class ControlerCadastroColaborador implements ActionListener {

    CadastroColaborador telaCadColaborador;
    public static int codigo;

    public ControlerCadastroColaborador(CadastroColaborador parTelaCadColaborador) {

        this.telaCadColaborador = parTelaCadColaborador;

        telaCadColaborador.getjButtonNovo().addActionListener(this);
        telaCadColaborador.getjButtonCancelar().addActionListener(this);
        telaCadColaborador.getjButtonGravar().addActionListener(this);
        telaCadColaborador.getjButtonBuscar().addActionListener(this);
        telaCadColaborador.getjButtonSair().addActionListener(this);

        telaCadColaborador.ativa(true);
        telaCadColaborador.ligaDesliga(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadColaborador.getjButtonNovo()) {
            telaCadColaborador.ativa(false);
            telaCadColaborador.ligaDesliga(true);
            telaCadColaborador.getjTextFieldId().setEnabled(false);

        } else if (acao.getSource() == telaCadColaborador.getjButtonCancelar()) {
            telaCadColaborador.ativa(true);
            telaCadColaborador.ligaDesliga(false);

        } else if (acao.getSource() == telaCadColaborador.getjButtonGravar()) {

            //verificar espaços em branco
            if (telaCadColaborador.getjTextFieldNome().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Nome: Campo com preenchimento obrigatório");

            } else if (telaCadColaborador.getjTextFieldLogin().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Login: Campo com preenchimento obrigatório");

            } else if (telaCadColaborador.getjFormattedTextFieldSenha().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Senha: Campo com preenchimento obrigatório");

            } else {

                Colaborador colaborador = new Colaborador();
                colaborador.setLogin(telaCadColaborador.getjTextFieldLogin().getText());
                colaborador.setSenha(telaCadColaborador.getjFormattedTextFieldSenha().getText());
                colaborador.setDtCadastro(getDataCadastro());
                colaborador.setComplementoEndereco(telaCadColaborador.getjTextFieldComplemento().getText());
                colaborador.setEmail(telaCadColaborador.getjTextFieldEmail().getText());
                colaborador.setFone1(telaCadColaborador.getjFormattedTextFieldFone1().getText());
                colaborador.setFone2(telaCadColaborador.getjFormattedTextFieldFone2().getText());
                colaborador.setNome(telaCadColaborador.getjTextFieldNome().getText());
                colaborador.setObservacao(telaCadColaborador.getjTextAreaObserv().getText());
                colaborador.setStatus(telaCadColaborador.getjComboBoxStatus().getSelectedItem().toString());
                var cidade = telaCadColaborador.getjTextFieldCidade().getText();
                var bairro = telaCadColaborador.getjTextFieldBairro().getText();
                var cep = telaCadColaborador.getjFormattedTextFieldCep().getText();
                colaborador.setEndereco(buscaEndereco(cidade, bairro, cep));
                
                ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
                if (this.telaCadColaborador.getjTextFieldId().getText().equalsIgnoreCase("")){
                    colaboradorDAO.create(colaborador);
            }else{
                    colaborador.setId(Integer.parseInt(telaCadColaborador.getjTextFieldId().getText()));
                    colaboradorDAO.update(colaborador);
                    }
                
                telaCadColaborador.ativa(true);
                telaCadColaborador.ligaDesliga(false);
            }

        } else if (acao.getSource() == telaCadColaborador.getjButtonBuscar()) {

            this.codigo = 0;
            FormBusColaborador busColaborador = new FormBusColaborador();
            ControlerBuscaColaborador controlerBuscaColaborador = new ControlerBuscaColaborador(busColaborador);
            busColaborador.setVisible(true);

        } else if (acao.getSource() == telaCadColaborador.getjButtonSair()) {

            telaCadColaborador.dispose();

        }
    }
     private Endereco buscaEndereco(String DescricaoCidade, String DescricaoBairro, String cep) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        BairroDAO bairroDAO = new BairroDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        
        var cidade = cidadeDAO.search(DescricaoCidade);
        var bairro = bairroDAO.search(DescricaoBairro);
        if(cidade != null && bairro != null){
            return enderecoDAO.search(DescricaoCidade, DescricaoBairro);
        }
        return enderecoDAO.create(new Endereco(telaCadColaborador.getjTextFieldLogradouro().getText(), telaCadColaborador.getjFormattedTextFieldCep().getText(), bairro, cidade));
    }

    private String getDataCadastro() {
       LocalDateTime currentLocalDateTime = LocalDateTime.now();

       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
 
       return currentLocalDateTime.format(dateTimeFormatter);
    }
}
