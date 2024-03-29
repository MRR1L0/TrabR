package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAO.BairroDAO;
import model.bo.Bairro;
import service.BairroService;
import view.FormBusBairro;

public class ControlerBuscaBairro implements ActionListener {

    FormBusBairro formBusBairro;

    public ControlerBuscaBairro(FormBusBairro formBusBairro) {

        this.formBusBairro = formBusBairro;

        this.formBusBairro.getjButtonCarregar().addActionListener(this);
        this.formBusBairro.getjButtonSair().addActionListener(this);

        ///carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.formBusBairro.getjTableBuscas().getModel();
       
        for (Bairro objetoAtualDaLista : BairroService.buscar()){
            tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getDescricao()});

        }

    }

    @Override

    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.formBusBairro.getjButtonCarregar()) {
            if (this.formBusBairro.getjTableBuscas().getValueAt(this.formBusBairro.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroBairro.codigo = (int) this.formBusBairro.getjTableBuscas().getValueAt(this.formBusBairro.getjTableBuscas().getSelectedRow(), 0);
                formBusBairro.dispose();

            } else if (evento.getSource() == formBusBairro.getjButtonSair()) {
                formBusBairro.dispose();
            }
        }
    }
}
