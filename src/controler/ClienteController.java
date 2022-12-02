/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroCliente;

/**
 *
 * @author murilo.cunha
 */
public class ClienteController implements ActionListener {

    public ClienteController() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CadastroCliente cadastroCliente = new CadastroCliente();
        if (e.getSource() == cadastroCliente.getBtnCancelar()) {
            cadastroCliente.dispose();
        } else if (e.getSource() == cadastroCliente.getBtnSalvar()) {
            cadastroCliente.getTxtBairro().getText();
            cadastroCliente.getTxtCep().getText();
            cadastroCliente.getTxtCidade().getText();
            cadastroCliente.getTxtComplemento().getText();
            cadastroCliente.getTxtCpf().getText();
            cadastroCliente.getTxtDataNascimento().getText();
            cadastroCliente.getTxtEmail().getText();
            cadastroCliente.getTxtEstado().getText();
            cadastroCliente.getTxtLogradouro().getText();
            cadastroCliente.getTxtNome().getText();
            cadastroCliente.getTxtObservacao().getText();
            cadastroCliente.getTxtRg().getText();
            cadastroCliente.getTxtTelefone1().getText();
            cadastroCliente.getTxtTelefone2().getText();
            cadastroCliente.dispose();
        }
    }
}
