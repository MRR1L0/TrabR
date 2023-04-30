package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAO.ClienteDAO;
import model.bo.Cliente;
import view.FormBusCliente;

public class ControlerBuscaCliente implements ActionListener {

    FormBusCliente formBusCliente;

    public ControlerBuscaCliente(FormBusCliente formBusCliente) {

        this.formBusCliente = formBusCliente;

        this.formBusCliente.getjButtonCarregar().addActionListener(this);
        this.formBusCliente.getjButtonSair().addActionListener(this);

        ///carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.formBusCliente.getjTableBuscas().getModel();
        ClienteDAO clienteDAO = new ClienteDAO();
        var clientes = clienteDAO.search();
        for (Cliente cliente : clientes) {
            tabela.addRow(new Object[]{cliente.getId(), cliente.getNome(),cliente.getCpf(),
                cliente.getSexo(), cliente.getFone1(), cliente.getStatus(), cliente.getDtCadastro()});
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        //
        if (evento.getSource() == this.formBusCliente.getjButtonCarregar()) {
            if (this.formBusCliente.getjTableBuscas().getValueAt(this.formBusCliente.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroCliente.codigo = (int) this.formBusCliente.getjTableBuscas().getValueAt(this.formBusCliente.getjTableBuscas().getSelectedRow(), 0);
                formBusCliente.dispose();

            } else if (evento.getSource() == formBusCliente.getjButtonSair()) {
                formBusCliente.dispose();
            }
        }
    }
}
