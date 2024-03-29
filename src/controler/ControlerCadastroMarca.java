package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.MarcaDAO;
import model.bo.Marca;
import view.CadastroMarca;
import view.FormBusMarca;

public class ControlerCadastroMarca implements ActionListener {

    CadastroMarca telaCadMarca;
    public static int codigo;

    public ControlerCadastroMarca(CadastroMarca parTelaCadMarca) {

        this.telaCadMarca = parTelaCadMarca;

        telaCadMarca.getjButtonNovo().addActionListener(this);
        telaCadMarca.getjButtonCancelar().addActionListener(this);
        telaCadMarca.getjButtonGravar().addActionListener(this);
        telaCadMarca.getjButtonBuscar().addActionListener(this);
        telaCadMarca.getjButtonSair().addActionListener(this);

        telaCadMarca.ativa(true);
        telaCadMarca.ligaDesliga(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadMarca.getjButtonNovo()) {
            telaCadMarca.ativa(false);
            telaCadMarca.ligaDesliga(true);
            telaCadMarca.getjTextId().setEnabled(false);

        } else if (acao.getSource() == telaCadMarca.getjButtonCancelar()) {
            telaCadMarca.ativa(true);
            telaCadMarca.ligaDesliga(false);

        } else if (acao.getSource() == telaCadMarca.getjButtonGravar()) {
            //verificar espaços em branco
            if (telaCadMarca.getjTextDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Descrição: Campo com preenchimento obrigatório");

            } else {

                Marca marca = new Marca();
                marca.setDescricao(telaCadMarca.getjTextDescricao().getText());
                MarcaDAO marcaDAO = new MarcaDAO();

                if (this.telaCadMarca.getjTextId().getText().equalsIgnoreCase("")) {
                    marcaDAO.create(marca);
                } else {
                    marca.setId(Integer.parseInt(telaCadMarca.getjTextId().getText()));
                    marcaDAO.update(marca);
                }

                telaCadMarca.ativa(true);
                telaCadMarca.ligaDesliga(false);

            }
        } else if (acao.getSource() == telaCadMarca.getjButtonBuscar()) {

            FormBusMarca formBusMarca = new FormBusMarca(null, true);
            ControlerBuscaMarca controllerBusMarca = new ControlerBuscaMarca(formBusMarca);
            formBusMarca.setVisible(true);
            
            if (this.codigo != 0) {
                Marca marca = new Marca();
                var marcaDAO = new MarcaDAO();
                marca = marcaDAO.search(codigo);

                telaCadMarca.ativa(false);
                telaCadMarca.ligaDesliga(true);
                telaCadMarca.getjTextId().setText(marca.getId() + "");
                telaCadMarca.getjTextDescricao().setText(marca.getDescricao());
                telaCadMarca.getjTextId().setEnabled(false);
            }


        } else if (acao.getSource() == telaCadMarca.getjButtonSair()) {

            telaCadMarca.dispose();

        }
    }

}
