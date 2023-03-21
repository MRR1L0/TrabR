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
        for (Marca objetoAtualDaLista : marcaDAO.retrieve()) {

            tabela.addRow(new Object[]{objetoAtualDaLista.getId(),
                objetoAtualDaLista.getDescricao()});
        }
    }

    @Override

    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == this.formBusMarca.getjButtonCarregar()) {

        } else if (acao.getSource() == this.formBusMarca.getjButtonSair()) {

        }

    }

}
