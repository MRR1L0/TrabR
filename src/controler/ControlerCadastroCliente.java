package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Cliente;
import view.CadastroCliente;
import view.FormBusCliente;

public class ControlerCadastroCliente implements ActionListener {

    CadastroCliente telaCadCliente;

    public ControlerCadastroCliente(CadastroCliente parTelaCadCliente) {

        this.telaCadCliente = parTelaCadCliente;

        telaCadCliente.getjButtonNovo().addActionListener(this);
        telaCadCliente.getjButtonCancelar().addActionListener(this);
        telaCadCliente.getjButtonGravar().addActionListener(this);
        telaCadCliente.getjButtonBuscar().addActionListener(this);
        telaCadCliente.getjButtonSair().addActionListener(this);

        telaCadCliente.ativa(true);

        telaCadCliente.ligaDesliga(false);

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadCliente.getjButtonNovo()) {
            telaCadCliente.ativa(false);
            telaCadCliente.ligaDesliga(true);
            //   telaCadCliente.getjTextId().setEnabled(false);

        } else if (acao.getSource() == telaCadCliente.getjButtonCancelar()) {
            telaCadCliente.ativa(true);
            telaCadCliente.ligaDesliga(false);

        } else if (acao.getSource() == telaCadCliente.getjButtonGravar()) {
            //verificar espaÃ§os em branco
            if (telaCadCliente.getjTextFieldNome().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Nome: Campo com preenchimento obrigatório");

            } else if (telaCadCliente.getjFormattedCpf().getText().trim().length() < 14) {
                JOptionPane.showMessageDialog(null, "CPF: Campo com preenchimento obrigatório");

            } else if (telaCadCliente.getjFormattedTextFieldFone1().getText().trim().length() < 14) {
                JOptionPane.showMessageDialog(null, "Fone 1: Campo com preenchimento obrigatório");

            } else if (telaCadCliente.getjFormattedTextFieldCep().getText().trim().length() < 9) {
                JOptionPane.showMessageDialog(null, "CEP: Campo com preenchimento obrigatório");

            } else {

                Cliente cliente = new Cliente();
                cliente.setCpf(telaCadCliente.getjFormattedCpf().getText());
                
                
                

                //persistir o obj de bairro criado
                telaCadCliente.ativa(true);
                telaCadCliente.ligaDesliga(false);

            }

        } else if (acao.getSource() == telaCadCliente.getjButtonBuscar()) {

            FormBusCliente formBusCliente = new FormBusCliente();
            formBusCliente.setVisible(true);

        } else if (acao.getSource() == telaCadCliente.getjButtonSair()) {

            telaCadCliente.dispose();
        }
    }
}
