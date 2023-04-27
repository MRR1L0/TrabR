package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAO.ClasseDAO;
import model.bo.Classe;
import view.FormBusClasse;

public class ControlerBuscaClasse implements ActionListener {

    FormBusClasse formBusClasse;

    public ControlerBuscaClasse(FormBusClasse formBusClasse) {

        this.formBusClasse = formBusClasse;

        this.formBusClasse.getjButtonCarregar().addActionListener(this);
        this.formBusClasse.getjButtonSair().addActionListener(this);

        //carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.formBusClasse.getjTableBuscas().getModel();
        ClasseDAO classeDAO = new ClasseDAO();
        for (Classe objetoAtualDaLista : classeDAO.search()) {

            tabela.addRow(new Object[]{objetoAtualDaLista.getId(),
                objetoAtualDaLista.getDescricao()});
        }
    }

    @Override

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusClasse.getjButtonCarregar()) {
            if (this.formBusClasse.getjTableBuscas().getValueAt(this.formBusClasse.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroClasse.codigo = (int) this.formBusClasse.getjTableBuscas().getValueAt(this.formBusClasse.getjTableBuscas().getSelectedRow(), 0);
                formBusClasse.dispose();
            } else if (evento.getSource() == formBusClasse.getjButtonSair()) {
                formBusClasse.dispose();
            }
        }
    }
}
