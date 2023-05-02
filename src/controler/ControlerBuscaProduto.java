package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.DAO.ClasseDAO;
import model.DAO.ColaboradorDAO;
import model.DAO.MarcaDAO;
import model.DAO.ProdutoDAO;
import view.FormBusProduto;

public class ControlerBuscaProduto implements ActionListener {

    FormBusProduto formBusProduto;

    public ControlerBuscaProduto(FormBusProduto formBusProduto) {

        this.formBusProduto = formBusProduto;

        this.formBusProduto.getjButtonCarregar().addActionListener(this);
        this.formBusProduto.getjButtonSair().addActionListener(this);
        
        DefaultTableModel tabela = (DefaultTableModel) this.formBusProduto.getjTableBuscas().getModel();
        var DAO = new ProdutoDAO();
        var marcaDAO = new MarcaDAO();
        var classeDAO = new ClasseDAO();
        var lista = DAO.search();
        for (var item : lista) {
            var marca = marcaDAO.search(item.getMarca().getId()).getDescricao();
            var classe = classeDAO.search(item.getClasse().getId()).getDescricao();
            tabela.addRow(new Object[]{item.getId(), item.getDescricao(),item.getEstoqueMaximo(),item.getValorVenda(),
            item.getStatus(),marca,classe});
        }
    }

    @Override

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusProduto.getjButtonCarregar()) {
            if (this.formBusProduto.getjTableBuscas().getValueAt(this.formBusProduto.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroProduto.codigo = (int) this.formBusProduto.getjTableBuscas().getValueAt(this.formBusProduto.getjTableBuscas().getSelectedRow(), 0);
                formBusProduto.dispose();
            } else if (evento.getSource() == formBusProduto.getjButtonSair()) {
                formBusProduto.dispose();
            }
        }
    }
}
