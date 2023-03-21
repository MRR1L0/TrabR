package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Colaborador;
import view.CadastroColaborador;
import view.FormBusColaborador;

public class ControllerCadColaborador implements ActionListener {

    CadastroColaborador telaCadColaborador;

    public ControllerCadColaborador(CadastroColaborador parTelaCadColaborador) {

        this.telaCadColaborador = parTelaCadColaborador;

        telaCadColaborador.getjButtonNovo().addActionListener(this);
        telaCadColaborador.getjButtonCancelar().addActionListener(this);
        telaCadColaborador.getjButtonGravar().addActionListener(this);
        telaCadColaborador.getjButtonBuscar().addActionListener(this);
        telaCadColaborador.getjButtonSair().addActionListener(this);

        telaCadColaborador.ativa(true);
        telaCadColaborador.ligaDesliga(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadColaborador.getjButtonNovo()) {
            telaCadColaborador.ativa(false);
            telaCadColaborador.ligaDesliga(true);
            telaCadColaborador.getjTextFieldId().setEnabled(false);

        } else if (acao.getSource() == telaCadColaborador.getjButtonCancelar()) {
            telaCadColaborador.ativa(true);
            telaCadColaborador.ligaDesliga(false);

        } else if (acao.getSource() == telaCadColaborador.getjButtonGravar()) {

            //verificar espaços em branco
            if (telaCadColaborador.getjTextFieldNome().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Nome: Campo com preenchimento obrigatório");

            } else if (telaCadColaborador.getjTextFieldLogin().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Login: Campo com preenchimento obrigatório");

            } else if (telaCadColaborador.getjFormattedTextFieldSenha().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Senha: Campo com preenchimento obrigatório");

            } else {

                Colaborador colaborador = new Colaborador();
                colaborador.setLogin(telaCadColaborador.getjTextFieldLogin().getText());

                telaCadColaborador.ativa(true);
                telaCadColaborador.ligaDesliga(false);
            }

        } else if (acao.getSource() == telaCadColaborador.getjButtonBuscar()) {

            FormBusColaborador formBusColaborador = new FormBusColaborador();
            formBusColaborador.setVisible(true);

        } else if (acao.getSource() == telaCadColaborador.getjButtonSair()) {

            telaCadColaborador.dispose();

        }
    }
}
