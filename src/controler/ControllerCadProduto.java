package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Produto;
import view.CadastroProduto;
import view.FormBusProduto;

public class ControllerCadProduto implements ActionListener {

    CadastroProduto telaCadProduto;

    public ControllerCadProduto(CadastroProduto parTelaCadProduto) {

        this.telaCadProduto = parTelaCadProduto;

        telaCadProduto.getjButtonNovo().addActionListener(this);
        telaCadProduto.getjButtonCancelar().addActionListener(this);
        telaCadProduto.getjButtonGravar().addActionListener(this);
        telaCadProduto.getjButtonBuscar().addActionListener(this);
        telaCadProduto.getjButtonSair().addActionListener(this);

        telaCadProduto.ativa(true);
        telaCadProduto.ligaDesliga(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadProduto.getjButtonNovo()) {
            telaCadProduto.ativa(false);
            telaCadProduto.ligaDesliga(true);
            telaCadProduto.getjTextId().setEnabled(false);

        } else if (acao.getSource() == telaCadProduto.getjButtonCancelar()) {
            telaCadProduto.ativa(true);
            telaCadProduto.ligaDesliga(false);

        } else if (acao.getSource() == telaCadProduto.getjButtonGravar()) {
            if (telaCadProduto.getjTextDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Descrição: Campo com preenchimento obrigatório");

                // fazer validação dos demais campos
            } else {

                Produto produto = new Produto();
                produto.setDescricao(telaCadProduto.getjTextDescricao().getText());

                telaCadProduto.ativa(true);
                telaCadProduto.ligaDesliga(false);
            }

        } else if (acao.getSource() == telaCadProduto.getjButtonBuscar()) {

            FormBusProduto formBusProduto = new FormBusProduto();
            formBusProduto.setVisible(true);

        } else if (acao.getSource() == telaCadProduto.getjButtonSair()) {
            telaCadProduto.dispose();
        }
    }
}
