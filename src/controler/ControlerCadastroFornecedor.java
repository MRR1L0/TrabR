package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import model.DAO.BairroDAO;
import model.DAO.CidadeDAO;
import model.DAO.EnderecoDAO;
import model.DAO.FornecedorDAO;
import model.bo.Endereco;
import model.bo.Fornecedor;
import view.CadastroFornecedor;
import view.FormBusFornecedor;

public class ControlerCadastroFornecedor implements ActionListener {

    CadastroFornecedor telaCadFornecedor;
    public static int codigo;

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
                fornecedor.setInscEstadual(telaCadFornecedor.getjFormattedTextFieldInscricaoEstadual().getText());
                fornecedor.setContato(telaCadFornecedor.getjTextFieldContato().getText());
                fornecedor.setRazaoSocial(telaCadFornecedor.getjTextFieldRazaoSocial().getText());
                fornecedor.setRg(telaCadFornecedor.getjFormattedTextFieldRg().getText());
                fornecedor.setNome(telaCadFornecedor.getjTextFieldNome().getText());
                fornecedor.setFone1(telaCadFornecedor.getjFormattedTextFieldFone1().getText());
                fornecedor.setFone2(telaCadFornecedor.getjFormattedTextFieldFone2().getText());
                fornecedor.setEmail(telaCadFornecedor.getjTextFieldEmail().getText());
                fornecedor.setComplementoEndereco(telaCadFornecedor.getjTextFieldComplemento().getText());
                fornecedor.setObservacao(telaCadFornecedor.getjTextAreaObserv().getText());
                fornecedor.setStatus(telaCadFornecedor.getjComboBoxStatus().getSelectedItem().toString());          
                fornecedor.setDtCadastro(LocalDateTime.now().toString());
                var cidade = telaCadFornecedor.getjTextFieldCidade().getText();
                var bairro = telaCadFornecedor.getjTextFieldBairro().getText();
                var cep = telaCadFornecedor.getjFormattedTextFieldCep().getText();
                fornecedor.setEndereco(buscaEndereco(cidade, bairro, cep));
                
                FornecedorDAO fornecedorDAO = new FornecedorDAO();
                fornecedorDAO.create(fornecedor);
                
                
                
                telaCadFornecedor.ativa(true);
                telaCadFornecedor.ligaDesliga(false);
                
                

            }

        } else if (acao.getSource() == telaCadFornecedor.getjButtonBuscar()) {

            FormBusFornecedor formBusFornecedor = new FormBusFornecedor();
            ControlerBuscaFornecedor controlerBuscaFornecedor = new ControlerBuscaFornecedor(formBusFornecedor);
            formBusFornecedor.setVisible(true);

        } else if (acao.getSource() == telaCadFornecedor.getjButtonSair()) {

            telaCadFornecedor.dispose();

        }
    }
    
    private Endereco buscaEndereco(String DescricaoCidade, String DescricaoBairro, String cep) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        BairroDAO bairroDAO = new BairroDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        var cidade = cidadeDAO.search(DescricaoCidade);
        var bairro = bairroDAO.search(DescricaoBairro);
        if(cidade != null && bairro != null){
            return enderecoDAO.search(DescricaoCidade, DescricaoBairro);
        }
        return enderecoDAO.create(new Endereco(telaCadFornecedor.getjTextFieldLogradouro().getText(), telaCadFornecedor.getjFormattedTextFieldCep().getText(), bairro, cidade));
    }
}
