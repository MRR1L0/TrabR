package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAO.ColaboradorDAO;
import service.ColaboradorService;
import view.FormBusColaborador;

public class ControlerBuscaColaborador implements ActionListener {

    FormBusColaborador formBusColaborador;

    public ControlerBuscaColaborador(FormBusColaborador formBusColaborador) {

        this.formBusColaborador = formBusColaborador;

        this.formBusColaborador.getjButtonCarregar().addActionListener(this);
        this.formBusColaborador.getjButtonSair().addActionListener(this);
        
        DefaultTableModel tabela = (DefaultTableModel) this.formBusColaborador.getjTableBuscas().getModel();
       
       // var DAO = new ColaboradorDAO();
       //var lista = DAO.search();
        
        for (var item : ColaboradorService.buscar()) {
            tabela.addRow(new Object[]{item.getId(), item.getNome(),item.getLogin(),item.getStatus()});
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusColaborador.getjButtonCarregar()) {
            if (this.formBusColaborador.getjTableBuscas().getValueAt(this.formBusColaborador.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroColaborador.codigo = (int) this.formBusColaborador.getjTableBuscas().getValueAt(this.formBusColaborador.getjTableBuscas().getSelectedRow(), 0);
                formBusColaborador.dispose();
            } else if (evento.getSource() == formBusColaborador.getjButtonSair()) {
                formBusColaborador.dispose();
            }
        }
    }
}
