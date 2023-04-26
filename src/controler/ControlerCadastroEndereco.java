package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.BairroDAO;
import model.DAO.CidadeDAO;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Endereco;
import view.CadastroEndereco;
import view.FormBusEndereco;

public class ControlerCadastroEndereco implements ActionListener {

    CadastroEndereco telaCadEndereco;
    BairroDAO bairroDao;
    CidadeDAO cidadeDAO;

    public ControlerCadastroEndereco(CadastroEndereco parTelaCadEndereco) {

        this.telaCadEndereco = parTelaCadEndereco;

        telaCadEndereco.getjButtonNovo().addActionListener(this);
        telaCadEndereco.getjButtonCancelar().addActionListener(this);
        telaCadEndereco.getjButtonGravar().addActionListener(this);
        telaCadEndereco.getjButtonBuscar().addActionListener(this);
        telaCadEndereco.getjButtonSair().addActionListener(this);

        telaCadEndereco.ativa(true);
        telaCadEndereco.ligaDesliga(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadEndereco.getjButtonNovo()) {
            telaCadEndereco.ativa(false);
            telaCadEndereco.ligaDesliga(true);
            telaCadEndereco.getjTextId().setEnabled(false);

        } else if (acao.getSource() == telaCadEndereco.getjButtonCancelar()) {
            telaCadEndereco.ativa(true);
            telaCadEndereco.ligaDesliga(false);

        } else if (acao.getSource() == telaCadEndereco.getjButtonGravar()) {
            //verificar espaços em branco - trim
            if (telaCadEndereco.getjFormattedTextCep().getText().trim().length() < 9) {
                JOptionPane.showMessageDialog(null, "CEP: Campo com preenchimento obrigatório");

            } else if (telaCadEndereco.getjTextLogradouro().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Logradouro: Campo com preenchimento obrigatório");

            } else {

                Endereco endereco = new Endereco();
                endereco.setLogradouro(telaCadEndereco.getjTextLogradouro().getText());
                var bairro = telaCadEndereco.getjTextBairro().getText();
                var cidade = telaCadEndereco.getjTextCidade().getText();
                endereco.setBairro(buscaBairro(bairro));
                endereco.setCidade(buscaCidade(cidade));
                endereco.setLogradouro(telaCadEndereco.getjTextLogradouro().getText());
                telaCadEndereco.ativa(true);
                telaCadEndereco.ligaDesliga(false);
            }

        } else if (acao.getSource() == telaCadEndereco.getjButtonBuscar()) {

            FormBusEndereco formBusEndereco = new FormBusEndereco();
            formBusEndereco.setVisible(true);

        } else if (acao.getSource() == telaCadEndereco.getjButtonSair()) {

            telaCadEndereco.dispose();
        }
    }

    private Bairro buscaBairro(String DescricaoBairro) {
        var bairro = bairroDao.search(DescricaoBairro);
        
        if(bairro != null){
            return bairro;
        }
        return bairroDao.create(new Bairro(DescricaoBairro));
    }

    private Cidade buscaCidade(String DescricaoCidade) {
        var cidade = cidadeDAO.search(DescricaoCidade);
        
        if(cidade != null){
            return cidade;
        }
        return cidadeDAO.create(new Cidade(DescricaoCidade));
    }
}
