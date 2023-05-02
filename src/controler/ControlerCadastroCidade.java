package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.CidadeDAO;
import model.bo.Cidade;
import view.CadastroCidade;
import view.FormBusCidade;

public class ControlerCadastroCidade implements ActionListener {

    CadastroCidade telaCadCidade;
    public static int codigo;

    public ControlerCadastroCidade(CadastroCidade parTelaCadCidade) {

        this.telaCadCidade = parTelaCadCidade;

        telaCadCidade.getjButtonNovo().addActionListener(this);
        telaCadCidade.getjButtonCancelar().addActionListener(this);
        telaCadCidade.getjButtonGravar().addActionListener(this);
        telaCadCidade.getjButtonBuscar().addActionListener(this);
        telaCadCidade.getjButtonSair().addActionListener(this);

        telaCadCidade.ativa(true);

        telaCadCidade.ligaDesliga(false);

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadCidade.getjButtonNovo()) {
            telaCadCidade.ativa(false);
            telaCadCidade.ligaDesliga(true);
            telaCadCidade.getjTextId().setEnabled(false);

        } else if (acao.getSource() == telaCadCidade.getjButtonCancelar()) {
            telaCadCidade.ativa(true);
            telaCadCidade.ligaDesliga(false);

        } else if (acao.getSource() == telaCadCidade.getjButtonGravar()) {
            //verificar espaços em branco
            if (telaCadCidade.getjTextDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Descrição: Campo com preenchimento obrigatório");

            } else {

                Cidade cidade = new Cidade();
                cidade.setDescricao(telaCadCidade.getjTextDescricao().getText());
                CidadeDAO cidadeDAO = new CidadeDAO();
                if (this.telaCadCidade.getjTextId().getText().equalsIgnoreCase("")) {
                    cidadeDAO.create(cidade);
                } else {
                    cidade.setId(Integer.parseInt(telaCadCidade.getjTextId().getText()));
                    cidadeDAO.update(cidade);
                }
                telaCadCidade.ativa(true);
                telaCadCidade.ligaDesliga(false);

            }

        } else if (acao.getSource() == telaCadCidade.getjButtonBuscar()) {

            FormBusCidade formBusCidade = new FormBusCidade(null, true);
            ControlerBuscaCidade controllerBusCidade = new ControlerBuscaCidade(formBusCidade);
            formBusCidade.setVisible(true);

            

            if (this.codigo != 0) {
                Cidade cidade = new Cidade();
                CidadeDAO cidadeDAO = new CidadeDAO();
                cidade = cidadeDAO.search(codigo);

                telaCadCidade.ativa(false);
                telaCadCidade.ligaDesliga(true);
                telaCadCidade.getjTextId().setText(cidade.getId() + "");
                telaCadCidade.getjTextDescricao().setText(cidade.getDescricao());
                telaCadCidade.getjTextId().setEnabled(false);

            }
        } else if (acao.getSource() == telaCadCidade.getjButtonSair()) {

            telaCadCidade.dispose();

        }
    }

}
