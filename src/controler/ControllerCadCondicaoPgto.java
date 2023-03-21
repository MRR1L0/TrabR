package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.CondicaoPagamento;
import view.CondicaoPgto;
import view.FormBusCondPgto;

public class ControllerCadCondicaoPgto implements ActionListener {

    CondicaoPgto telaCondicaoPgto;

    public ControllerCadCondicaoPgto(CondicaoPgto parTelaCadCondicaoPgto) {

        this.telaCondicaoPgto = parTelaCadCondicaoPgto;

        telaCondicaoPgto.getjButtonNovo().addActionListener(this);
        telaCondicaoPgto.getjButtonCancelar().addActionListener(this);
        telaCondicaoPgto.getjButtonGravar().addActionListener(this);
        telaCondicaoPgto.getjButtonBuscar().addActionListener(this);
        telaCondicaoPgto.getjButtonSair().addActionListener(this);

        telaCondicaoPgto.ativa(true);
        telaCondicaoPgto.ligaDesliga(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCondicaoPgto.getjButtonNovo()) {
            telaCondicaoPgto.ativa(false);
            telaCondicaoPgto.ligaDesliga(true);
            telaCondicaoPgto.getjTextId().setEnabled(false);

        } else if (acao.getSource() == telaCondicaoPgto.getjButtonCancelar()) {
            telaCondicaoPgto.ativa(true);
            telaCondicaoPgto.ligaDesliga(false);

        } else if (acao.getSource() == telaCondicaoPgto.getjButtonGravar()) {
            //verificar espaços em branco
            if (telaCondicaoPgto.getjTextDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Descrição: Campo com preenchimento obrigatório");

            } else {

                CondicaoPagamento condicaoPagamento = new CondicaoPagamento();
                condicaoPagamento.setDescricaoCondicao(telaCondicaoPgto.getjTextDescricao().getText());

                telaCondicaoPgto.ativa(true);
                telaCondicaoPgto.ligaDesliga(false);

            }

        } else if (acao.getSource() == telaCondicaoPgto.getjButtonBuscar()) {

            FormBusCondPgto formBusCondPgto = new FormBusCondPgto(null, true);
            ControllerBusCondPgto controllerBusCondPgto = new ControllerBusCondPgto(formBusCondPgto);
            formBusCondPgto.setVisible(true);

        } else if (acao.getSource() == telaCondicaoPgto.getjButtonSair()) {

            telaCondicaoPgto.dispose();

        }
    }

}
