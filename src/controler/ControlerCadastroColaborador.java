package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import model.DAO.BairroDAO;
import model.DAO.CidadeDAO;
import model.DAO.EnderecoDAO;
import model.bo.Colaborador;
import model.bo.Endereco;
import view.CadastroColaborador;
import view.FormBusColaborador;

public class ControlerCadastroColaborador implements ActionListener {

    CadastroColaborador telaCadColaborador;
    CidadeDAO cidadeDAO;
    BairroDAO bairroDAO;
    EnderecoDAO enderecoDAO;

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
                colaborador.setSenha(telaCadColaborador.getjLabelSenha().getText());
                colaborador.setDtCadastro(telaCadColaborador.getjLabelDatCadastro().getText());
                colaborador.setComplementoEndereco(telaCadColaborador.getjLabelComplemento().getText());
                colaborador.setEmail(telaCadColaborador.getjTextFieldEmail().getText());
                colaborador.setFone1(telaCadColaborador.getjLabelFone1().getText());
                colaborador.setFone2(telaCadColaborador.getjLabelFone2().getText());
                colaborador.setNome(telaCadColaborador.getjLabelNome().getText());
                colaborador.setObservacao(telaCadColaborador.getjLabelObserv().getText());
                colaborador.setStatus(telaCadColaborador.getjComboBoxStatus().getSelectedItem().toString());
                var cidade = telaCadColaborador.getjTextFieldCidade().getText();
                var bairro = telaCadColaborador.getjLabelBairro().getText();
                var cep = telaCadColaborador.getjFormattedTextFieldCep().getText();
                colaborador.setEndereco(buscaEndereco(cidade, bairro, cep));
                telaCadColaborador.ativa(true);
                telaCadColaborador.ligaDesliga(false);
            }

        } else if (acao.getSource() == telaCadColaborador.getjButtonBuscar()) {

            FormBusColaborador formBusColaborador = new FormBusColaborador();
            formBusColaborador.setVisible(true);

        } else if (acao.getSource() == telaCadColaborador.getjButtonSair()) {

            telaCadColaborador.dispose();

        }
    }
     private Endereco buscaEndereco(String DescricaoCidade, String DescricaoBairro, String cep) {
        var cidade = cidadeDAO.search(DescricaoCidade);
        var bairro = bairroDAO.search(DescricaoBairro);
        if(cidade != null && bairro != null){
            return enderecoDAO.search(DescricaoCidade, DescricaoBairro);
        }
        return enderecoDAO.create(new Endereco(telaCadColaborador.getjLabelLogradouro().getText(), telaCadColaborador.getjLabelCep().getText(), bairro, cidade));
    }
}
