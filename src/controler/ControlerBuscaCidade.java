package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAO.CidadeDAO;
import model.bo.Cidade;
import view.FormBusCidade;

public class ControlerBuscaCidade implements ActionListener {

    FormBusCidade formBusCidade;

    public ControlerBuscaCidade(FormBusCidade formBusCidade) {

        this.formBusCidade = formBusCidade;

        this.formBusCidade.getjButtonCarregar().addActionListener(this);
        this.formBusCidade.getjButtonSair().addActionListener(this);
        
        //carregar os dados para a jTable
        DefaultTableModel tabela = (DefaultTableModel) this.formBusCidade.getjTableBuscas().getModel();
        CidadeDAO cidadeDAO = new CidadeDAO();
        for (Cidade objetoAtualDaLista : cidadeDAO.search()) {
            
            tabela.addRow(new Object[]{objetoAtualDaLista.getId(),
                                       objetoAtualDaLista.getDescricao()});            
        }
    }

    @Override

    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == this.formBusCidade.getjButtonCarregar()) {

        } else if (acao.getSource() == this.formBusCidade.getjButtonSair()) {

        }

    }
}