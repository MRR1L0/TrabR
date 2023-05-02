package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.CondicaoPagamentoDAO;
import view.CondicaoPgto;
import view.FormBusCondPgto;

public class ControlerCadastroCondicaoPagamento implements ActionListener {

    CondicaoPgto telaCondicaoPgto;
    public static int codigo;

    public ControlerCadastroCondicaoPagamento(CondicaoPgto parTelaCadCondicaoPgto) {

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

                var condicaoPagamento = new model.bo.CondicaoPgto();
                condicaoPagamento.setDescricaoCondicao(telaCondicaoPgto.getjFormattedTextFieldDescricao().getText());
                condicaoPagamento.setNumeroParcelas(Integer.parseInt(telaCondicaoPgto.getjFormattedTextFieldNumeroParcelas().getText()));
                condicaoPagamento.setDiasEntreParcela(Integer.parseInt(telaCondicaoPgto.getjFormattedTextFieldDiasEntreParcelas().getText()));
                condicaoPagamento.setDiasPrimeiraParcela(Integer.parseInt(telaCondicaoPgto.getjFormattedTextFieldDiasPrimeiraParcelas().getText()));
                condicaoPagamento.setStatus(telaCondicaoPgto.getjComboStatus().getSelectedItem().toString());
                
                CondicaoPagamentoDAO condicaoPagamentoDAO = new CondicaoPagamentoDAO();

                if (this.telaCondicaoPgto.getjTextId().getText().equalsIgnoreCase("")) {
                    condicaoPagamentoDAO.create(condicaoPagamento);
                } else {
                    condicaoPagamento.setId(Integer.parseInt(telaCondicaoPgto.getjTextId().getText()));
                    condicaoPagamentoDAO.update(condicaoPagamento);
                }
                telaCondicaoPgto.ativa(true);
                telaCondicaoPgto.ligaDesliga(false);

            }

        } else if (acao.getSource() == telaCondicaoPgto.getjButtonBuscar()) {

            FormBusCondPgto formBusCondPgto = new FormBusCondPgto(null, true);
            ControlerBuscaCondicaoPagamento controllerBusCondPgto = new ControlerBuscaCondicaoPagamento(formBusCondPgto);
            formBusCondPgto.setVisible(true);

        } else if (acao.getSource() == telaCondicaoPgto.getjButtonSair()) {

            telaCondicaoPgto.dispose();

        }
    }

}
