package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAO.BairroDAO;
import model.bo.Bairro;
import view.FormBusBairro;

public class ControllerBusBairro implements ActionListener {

    FormBusBairro formBusBairro;

    public ControllerBusBairro(FormBusBairro formBusBairro) {

        this.formBusBairro = formBusBairro;

        this.formBusBairro.getjButtonCarregar().addActionListener(this);
        this.formBusBairro.getjButtonSair().addActionListener(this);

        ///carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.formBusBairro.getjTableBuscas().getModel();
        BairroDAO bairroDAO = new BairroDAO();
        for (Bairro objetoAtualDaLista : bairroDAO.retrieve()) {
            tabela.addRow(new Object[]{objetoAtualDaLista.getId(), objetoAtualDaLista.getDescricao()});

        }

    }

    @Override
    //evento                        //falta fazer a acao do botao
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == this.formBusBairro.getjButtonCarregar()) {
            if(this.formBusBairro.getjTableBuscas().getValueAt(this.formBusBairro.getjTableBuscas().getSelectedRow(), 0) != null){
                    ControllerCadBairro.codigo = (int) this.formBusBairro.getjTableBuscas().getValueAt(this.formBusBairro.getjTableBuscas().getSelectedRow(),0);
                    formBusBairro.dispose();
                    

        } else if (evento.getSource() == formBusBairro.getjButtonSair()) {
            formBusBairro.dispose();
        }

        }

    }
}
