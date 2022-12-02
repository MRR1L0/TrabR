/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroFornecedor;

/**
 *
 * @author murilo.cunha
 */
public class FornecedorController implements ActionListener {

    public FornecedorController() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CadastroFornecedor cadastroFornecedor = new CadastroFornecedor();
        if (e.getSource() == cadastroFornecedor.getBtnCancelar()) {
            cadastroFornecedor.dispose();
        } else if (e.getSource() == cadastroFornecedor.getBtnCadastrar()) {
            cadastroFornecedor.getTxtBairro().getText();
            cadastroFornecedor.getTxtCEP().getText();
            cadastroFornecedor.getTxtCidade().getText();
            cadastroFornecedor.getTxtComplemento().getText();
            cadastroFornecedor.getTxtEstado().getText();
            cadastroFornecedor.getTxtLogradouro().getText();
            cadastroFornecedor.getTxtNome().getText();
            cadastroFornecedor.getTxtObservacao().getText();
            cadastroFornecedor.getTxtCNPJ();
            cadastroFornecedor.dispose();
        }
    }
}
