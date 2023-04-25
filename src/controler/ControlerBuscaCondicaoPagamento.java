package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

import view.FormBusCondPgto;

public class ControlerBuscaCondicaoPagamento implements ActionListener {

    FormBusCondPgto formBusCondPgto;

    public ControlerBuscaCondicaoPagamento(FormBusCondPgto formBusCondPgto) {

        this.formBusCondPgto = formBusCondPgto;

        this.formBusCondPgto.getjButtonCarregar().addActionListener(this);
        this.formBusCondPgto.getjButtonSair().addActionListener(this);

        //carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.formBusCondPgto.getjTableBuscas().getModel();
        var condicaoPagamentoDAO = new model.DAO.CondicaoPagamentoDAO();
        for (model.bo.CondicaoPgto objetoAtualDaLista : condicaoPagamentoDAO.search()) {

            tabela.addRow(new Object[]{objetoAtualDaLista.getId(),
                objetoAtualDaLista.getDescricaoCondicao()});
        }
    }

    @Override

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusCondPgto.getjButtonCarregar()) {
            if (this.formBusCondPgto.getjTableBuscas().getValueAt(this.formBusCondPgto.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroBairro.codigo = (int) this.formBusCondPgto.getjTableBuscas().getValueAt(this.formBusCondPgto.getjTableBuscas().getSelectedRow(), 0);
                formBusCondPgto.dispose();
            } else if (evento.getSource() == formBusCondPgto.getjButtonSair()) {
                formBusCondPgto.dispose();
            }
        }
    }
}
