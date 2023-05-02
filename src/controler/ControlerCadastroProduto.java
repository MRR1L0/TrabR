package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.DAO.ClasseDAO;
import model.DAO.MarcaDAO;
import model.DAO.ProdutoDAO;
import model.bo.Classe;
import model.bo.Marca;
import model.bo.Produto;
import view.CadastroProduto;
import view.FormBusProduto;

public class ControlerCadastroProduto implements ActionListener {

    CadastroProduto telaCadProduto;
    public static int codigo;

    public ControlerCadastroProduto(CadastroProduto parTelaCadProduto) {

        this.telaCadProduto = parTelaCadProduto;

        telaCadProduto.getjButtonNovo().addActionListener(this);
        telaCadProduto.getjButtonCancelar().addActionListener(this);
        telaCadProduto.getjButtonGravar().addActionListener(this);
        telaCadProduto.getjButtonBuscar().addActionListener(this);
        telaCadProduto.getjButtonSair().addActionListener(this);

        telaCadProduto.ativa(true);
        telaCadProduto.ligaDesliga(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadProduto.getjButtonNovo()) {
            telaCadProduto.ativa(false);
            telaCadProduto.ligaDesliga(true);
            telaCadProduto.getjTextId().setEnabled(false);

        } else if (acao.getSource() == telaCadProduto.getjButtonCancelar()) {
            telaCadProduto.ativa(true);
            telaCadProduto.ligaDesliga(false);

        } else if (acao.getSource() == telaCadProduto.getjButtonGravar()) {
            if (telaCadProduto.getjTextDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Descrição: Campo com preenchimento obrigatório");

                // fazer validação dos demais campos
            } else {

                Produto produto = new Produto();
                
                produto.setDescricao(telaCadProduto.getjTextDescricao().getText());
                produto.setValorCompra(Integer.parseInt(telaCadProduto.getjTextValorCompra().getText()));
                produto.setValorVenda(Integer.parseInt(telaCadProduto.getjTextValorVenda().getText()));
                produto.setUndCompra(telaCadProduto.getjTextUnCompra().getText());
                produto.setUndVanda(telaCadProduto.getjTextUnVenda().getText());
                produto.setFatorConversao(Integer.parseInt(telaCadProduto.getjTextFator().getText()));
                produto.setStatus(telaCadProduto.getjComboStatus().getSelectedItem().toString());
                produto.setDataCadastro(dataCadastro());
                produto.setBarraEntrada(telaCadProduto.getjTextCodEntrada().getText());
                produto.setBarraSaida(telaCadProduto.getjTextCodSaida().getText());
                produto.setEstoqueMinino(Integer.parseInt(telaCadProduto.getjTextEstoqueMin().getText()));
                produto.setEstoqueMaximo(Integer.parseInt(telaCadProduto.getjTextEstoqueMax().getText()));
                produto.setMarca(buscaMarca(telaCadProduto.getjTextFieldMarcaProduto().getText()));
                produto.setClasse(buscaClasse(telaCadProduto.getjTextFieldClasse().getText()));
                
                ProdutoDAO produtoDAO = new ProdutoDAO();
                if (this.telaCadProduto.getjTextId().getText().equalsIgnoreCase("")){
                    produtoDAO.create(produto);
            }else{
                    produto.setId(Integer.parseInt(telaCadProduto.getjTextId().getText()));
                    produtoDAO.update(produto);
                    }
                telaCadProduto.ativa(true);
                telaCadProduto.ligaDesliga(false);
            }

        } else if (acao.getSource() == telaCadProduto.getjButtonBuscar()) {

            FormBusProduto formBusProduto = new FormBusProduto();
            var controlerBuscaProduto = new ControlerBuscaProduto(formBusProduto);
            formBusProduto.setVisible(true);

        } else if (acao.getSource() == telaCadProduto.getjButtonSair()) {
            telaCadProduto.dispose();
        }
    }
    private String dataCadastro() {
         LocalDateTime currentLocalDateTime = LocalDateTime.now();

       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
 
       return currentLocalDateTime.format(dateTimeFormatter); //To change body of generated methods, choose Tools | Templates.
    }

    private Marca buscaMarca(String text) {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.search(text); //To change body of generated methods, choose Tools | Templates.
    }

    private Classe buscaClasse(String text) {
        ClasseDAO classeDAO = new ClasseDAO();
       return classeDAO.search(text);//To change body of generated methods, choose Tools | Templates.
    }
}
