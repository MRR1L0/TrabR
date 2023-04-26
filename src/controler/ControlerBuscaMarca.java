package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAO.MarcaDAO;
import model.bo.Marca;
import view.FormBusMarca;

public class ControlerBuscaMarca implements ActionListener {

    FormBusMarca formBusMarca;

    public ControlerBuscaMarca(FormBusMarca formBusMarca) {

        this.formBusMarca = formBusMarca;

        this.formBusMarca.getjButtonCarregar().addActionListener(this);
        this.formBusMarca.getjButtonSair().addActionListener(this);

        //carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.formBusMarca.getjTableBuscas().getModel();
        MarcaDAO marcaDAO = new MarcaDAO();
        for (Marca objetoAtualDaLista : marcaDAO.search()) {
            tabela.addRow(new Object[]{objetoAtualDaLista.getId(),
                objetoAtualDaLista.getDescricao()});
        }
    }

    @Override

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusMarca.getjButtonCarregar()) {
            if (this.formBusMarca.getjTableBuscas().getValueAt(this.formBusMarca.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroBairro.codigo = (int) this.formBusMarca.getjTableBuscas().getValueAt(this.formBusMarca.getjTableBuscas().getSelectedRow(), 0);
                formBusMarca.dispose();
            } else if (evento.getSource() == formBusMarca.getjButtonSair()) {
                formBusMarca.dispose();
            }
        }
    }
}
