package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Fornecedor;
import view.CadastroFornecedor;
import view.FormBusFornecedor;

public class ControlerCadastroFornecedor implements ActionListener {

    CadastroFornecedor telaCadFornecedor;

    public ControlerCadastroFornecedor(CadastroFornecedor parTelaCadFornecedor) {

        this.telaCadFornecedor = parTelaCadFornecedor;

        telaCadFornecedor.getjButtonNovo().addActionListener(this);
        telaCadFornecedor.getjButtonCancelar().addActionListener(this);
        telaCadFornecedor.getjButtonGravar().addActionListener(this);
        telaCadFornecedor.getjButtonBuscar().addActionListener(this);
        telaCadFornecedor.getjButtonSair().addActionListener(this);

        telaCadFornecedor.ativa(true);
        telaCadFornecedor.ligaDesliga(false);

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadFornecedor.getjButtonNovo()) {
            telaCadFornecedor.ativa(false);
            telaCadFornecedor.ligaDesliga(true);
            telaCadFornecedor.getjTextFieldId().setEnabled(false); // deixar campo "codigo" bloqueado quando clicar em novo

        } else if (acao.getSource() == telaCadFornecedor.getjButtonCancelar()) {
            telaCadFornecedor.ativa(true);
            telaCadFornecedor.ligaDesliga(false);

        } else if (acao.getSource() == telaCadFornecedor.getjButtonGravar()) {
            //verificar espaços em branco

            if (telaCadFornecedor.getjTextFieldNome().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Nome: Campo com preenchimento obrigatório");

            } else if (telaCadFornecedor.getjFormattedTextFieldCnpj().getText().trim().length() < 18) {
                JOptionPane.showMessageDialog(null, "CNPJ: Campo com preenchimento obrigatório");

            } else if (telaCadFornecedor.getjFormattedTextFieldInscricaoEstadual().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Inscrição Estadual: Campo com preenchimento obrigatório");

            } else if (telaCadFornecedor.getjTextFieldRazaoSocial().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Razão Social: Campo com preenchimento obrigatório");

            } else if (telaCadFornecedor.getjTextFieldContato().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Contato: Campo com preenchimento obrigatório");

            } else if (telaCadFornecedor.getjFormattedTextFieldCep().getText().trim().length() < 9) {
                JOptionPane.showMessageDialog(null, "CEP: Campo com preenchimento obrigatório");

            } else {

                var fornecedor = new Fornecedor();
                fornecedor.setCnpj(telaCadFornecedor.getjFormattedTextFieldCnpj().getText());

                telaCadFornecedor.ativa(true);
                telaCadFornecedor.ligaDesliga(false);

            }

        } else if (acao.getSource() == telaCadFornecedor.getjButtonBuscar()) {

            FormBusFornecedor formBusFornecedor = new FormBusFornecedor();
            formBusFornecedor.setVisible(true);

        } else if (acao.getSource() == telaCadFornecedor.getjButtonSair()) {

            telaCadFornecedor.dispose();

        }
    }
}
