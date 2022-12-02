/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroClasse;

/**
 *
 * @author murilo.cunha
 */
public class ClasseController implements ActionListener {

    public ClasseController() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CadastroClasse cadastroClasse = new CadastroClasse();
        if (e.getSource() == cadastroClasse.getBtnCancelar()) {
            cadastroClasse.dispose();
        } else if (e.getSource() == cadastroClasse.getBtnCadastrar()) {
            cadastroClasse.getTxtId().getText();
            cadastroClasse.getTxtDescricao().getText();
            cadastroClasse.dispose();
        }
    }

}
