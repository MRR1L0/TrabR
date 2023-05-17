package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAO.EnderecoDAO;
import model.bo.Endereco;
import service.EnderecoService;
import view.FormBusEndereco;

public class ControlerBuscaEndereco implements ActionListener {

    FormBusEndereco formBusEndereco;

    public ControlerBuscaEndereco(FormBusEndereco formBusEndereco) {

        this.formBusEndereco = formBusEndereco;

        this.formBusEndereco.getjButtonCarregar().addActionListener(this);
        this.formBusEndereco.getjButtonSair().addActionListener(this);
        
        DefaultTableModel tabela = (DefaultTableModel) this.formBusEndereco.getjTableBuscas().getModel();
        
       // var enderecoDAO = new EnderecoDAO();
        for (var objetoAtualDaLista : EnderecoService.buscar()) {
            tabela.addRow(new Object[]{objetoAtualDaLista.getId(),
                objetoAtualDaLista.getCep(),objetoAtualDaLista.getLogradouro()});
        }
    }

    @Override

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusEndereco.getjButtonCarregar()) {
            if (this.formBusEndereco.getjTableBuscas().getValueAt(this.formBusEndereco.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroEndereco.codigo = (int) this.formBusEndereco.getjTableBuscas().getValueAt(this.formBusEndereco.getjTableBuscas().getSelectedRow(), 0);
                formBusEndereco.dispose();
            } else if (evento.getSource() == formBusEndereco.getjButtonSair()) {
                formBusEndereco.dispose();
            }
        }
    }
}
