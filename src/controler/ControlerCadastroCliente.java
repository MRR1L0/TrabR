package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.DAO.BairroDAO;
import model.DAO.CidadeDAO;
import model.DAO.ClienteDAO;
import model.DAO.EnderecoDAO;
import model.bo.Cliente;
import model.bo.Endereco;
import view.CadastroCliente;
import view.FormBusBairro;
import view.FormBusCliente;

public class ControlerCadastroCliente implements ActionListener {

    CadastroCliente telaCadCliente;
    public static int codigo;
    

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
                
                cliente.setRg(telaCadCliente.getjFormattedRg().getText());
                cliente.setDtNascimento(telaCadCliente.getjFormattedDatNasci().getText());
                cliente.setSexo(telaCadCliente.getjComboBoxSexo().getSelectedItem().toString());
                cliente.setNome(telaCadCliente.getjTextFieldNome().getText());
                cliente.setFone1(telaCadCliente.getjFormattedTextFieldFone1().getText());
                cliente.setFone2(telaCadCliente.getjFormattedTextFieldFone2().getText());
                cliente.setEmail(telaCadCliente.getjTextFieldEmail().getText());
                cliente.setDtCadastro(getDataCadastro());
                cliente.setComplementoEndereco(telaCadCliente.getjTextFieldEmail().getText());
                cliente.setObservacao(telaCadCliente.getjTextAreaObserv().getText());
                cliente.setStatus(telaCadCliente.getjComboBoxStatus().getSelectedItem().toString());
                var cidade = telaCadCliente.getjTextFieldCidade().getText();
                var bairro = telaCadCliente.getjTextFieldBairro().getText();
                var cep = telaCadCliente.getjFormattedTextFieldCep().getText();
                cliente.setEndereco(buscaEndereco(cidade, bairro, cep));
                
                ClienteDAO clienteDAO = new ClienteDAO();
                clienteDAO.create(cliente);
                //persistir o obj de bairro criado
                telaCadCliente.ativa(true);
                telaCadCliente.ligaDesliga(false);

            }

        } else if (acao.getSource() == telaCadCliente.getjButtonBuscar()) {

            this.codigo = 0;
            FormBusCliente formBusCliente = new FormBusCliente();
            ControlerBuscaCliente controlerBuscaCliente = new ControlerBuscaCliente(formBusCliente);
            formBusCliente.setVisible(true);

        } else if (acao.getSource() == telaCadCliente.getjButtonSair()) {

            telaCadCliente.dispose();
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
        return enderecoDAO.create(new Endereco(telaCadCliente.getjTextFieldLogradouro().getText(), telaCadCliente.getjFormattedTextFieldCep().getText(), bairro, cidade));
    }

    private String getDataCadastro() {
       LocalDateTime currentLocalDateTime = LocalDateTime.now();

       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
 
       return currentLocalDateTime.format(dateTimeFormatter);
    }
}
