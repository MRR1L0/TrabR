package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Fornecedor;
import service.FornecedorService;
import view.FormBusFornecedor;

public class ControlerBuscaFornecedor implements ActionListener {

    FormBusFornecedor formBusFornecedor;

    public ControlerBuscaFornecedor(FormBusFornecedor formBusFornecedor) {

        this.formBusFornecedor = formBusFornecedor;

        this.formBusFornecedor.getjButtonCarregar().addActionListener(this);
        this.formBusFornecedor.getjButtonSair().addActionListener(this);

        ///carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.formBusFornecedor.getjTableBuscas().getModel();

        for (Fornecedor fornecedor : FornecedorService.buscar()) {
            tabela.addRow(new Object[]{fornecedor.getId(), fornecedor.getNome(), fornecedor.getCpf(),
                fornecedor.getFone1(), fornecedor.getStatus(), fornecedor.getDtCadastro()});
        }

    }

    @Override

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusFornecedor.getjButtonCarregar()) {
            if (this.formBusFornecedor.getjTableBuscas().getValueAt(this.formBusFornecedor.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroFornecedor.codigo = (int) this.formBusFornecedor.getjTableBuscas().getValueAt(this.formBusFornecedor.getjTableBuscas().getSelectedRow(), 0);
                formBusFornecedor.dispose();
            } else if (evento.getSource() == formBusFornecedor.getjButtonSair()) {
                formBusFornecedor.dispose();
            }
        }
    }
}
