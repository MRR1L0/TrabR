/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroProduto;

/**
 *
 * @author murilo.cunha
 */
public class ProdutoController implements ActionListener {

    public ProdutoController() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        if (e.getSource() == cadastroProduto.getBtnCancelar()) {
            cadastroProduto.dispose();
        } else if (e.getSource() == cadastroProduto.getBtnCadastrar()) {
            cadastroProduto.getTxtBarraEntrada().getText();
            cadastroProduto.getTxtBarraSaida().getText();
            cadastroProduto.getTxtDescricao().getText();
            cadastroProduto.getTxtEstoqueMinimo().getText();
            cadastroProduto.getTxtId().getText();
            cadastroProduto.getTxtValorCompra().getText();
            cadastroProduto.getTxtValorVenda().getText();

            cadastroProduto.dispose();
        }
    }
}
