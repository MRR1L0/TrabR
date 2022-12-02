/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroColaborador;

/**
 *
 * @author murilo.cunha
 */
public class ColaboradorController implements ActionListener {

    public ColaboradorController() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CadastroColaborador cadastroColaborador = new CadastroColaborador();
        if (e.getSource() == cadastroColaborador.getBtnCancelar()) {
            cadastroColaborador.dispose();
        } else if (e.getSource() == cadastroColaborador.getBtnCadastrar()) {
            cadastroColaborador.getTxtBairro().getText();
            cadastroColaborador.getTxtCEP().getText();
            cadastroColaborador.getTxtCidade().getText();
            cadastroColaborador.getTxtComplemento().getText();
            cadastroColaborador.getTxtEmail().getText();
            cadastroColaborador.getTxtEstado().getText();
            cadastroColaborador.getTxtLogradouro().getText();
            cadastroColaborador.getTxtNome().getText();
            cadastroColaborador.getTxtObservacao().getText();
            cadastroColaborador.getTxtTelefone1().getText();
            cadastroColaborador.getTxtTelefone2().getText();
            cadastroColaborador.getTxtUsuario().getText();
            cadastroColaborador.getTxtSenha().getText();
            cadastroColaborador.getTxtSenhaConfirm().getText();
            cadastroColaborador.getTxtUsuario().getText();
            cadastroColaborador.dispose();
        }
    }
}
