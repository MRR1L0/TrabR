package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.bo.Bairro;
import model.DAO.BairroDAO;
import view.CadastroBairro;
import view.FormBusBairro;


public class ControllerCadBairro implements ActionListener {

    CadastroBairro telaCadBairro;
    public static int codigo;

    public ControllerCadBairro(CadastroBairro parTelaCadBairro) {

        this.telaCadBairro = parTelaCadBairro;

        telaCadBairro.getjButtonNovo().addActionListener(this);
        telaCadBairro.getjButtonCancelar().addActionListener(this);
        telaCadBairro.getjButtonGravar().addActionListener(this);
        telaCadBairro.getjButtonBuscar().addActionListener(this);
        telaCadBairro.getjButtonSair().addActionListener(this);

        telaCadBairro.ativa(true);

        telaCadBairro.ligaDesliga(false); //--- verificar mais tarde -- get (recuperar) de outra tela --- get e set recuperar inf de um obj 

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadBairro.getjButtonNovo()) {
            telaCadBairro.ativa(false);
            telaCadBairro.ligaDesliga(true);
            telaCadBairro.getjTextId().setEnabled(false);

        } else if (acao.getSource() == telaCadBairro.getjButtonCancelar()) {
            telaCadBairro.ativa(true);
            telaCadBairro.ligaDesliga(false);

        } else if (acao.getSource() == telaCadBairro.getjButtonGravar()) {
            //verificar espaços em branco
            if (telaCadBairro.getjTextDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Descrição: Campo com preenchimento obrigatório");

            } else {

                Bairro bairro = new Bairro();
                
                bairro.setDescricao(telaCadBairro.getjTextDescricao().getText());

                //persistir o obj de bairro criado
                
                BairroDAO bairroDAO = new BairroDAO();
                if (this.telaCadBairro.getjTextId().getText().equalsIgnoreCase("")){
                    bairroDAO.create(bairro);
            }else{
                    bairro.setId(Integer.parseInt(telaCadBairro.getjTextId().getText()));
                    bairroDAO.update(bairro);
                    }
                    
                        
                telaCadBairro.ativa(true);
                telaCadBairro.ligaDesliga(false);
            }

        } else if (acao.getSource() == telaCadBairro.getjButtonBuscar()) {
            ///carregar a tela da busca
            
            this.codigo = 0;

            FormBusBairro formBuscaBairro = new FormBusBairro(null, true);
            ControllerBusBairro controllerBusBairro = new ControllerBusBairro(formBuscaBairro);
            formBuscaBairro.setVisible(true);

            if (this.codigo != 0){
                Bairro bairro = new Bairro();
                BairroDAO bairroDAO = new BairroDAO();
                bairro = bairroDAO.retrieve(codigo);
                
                telaCadBairro.ativa(false);
                telaCadBairro.ligaDesliga(true);
                telaCadBairro.getjTextId().setText(bairro.getId()+"");
                telaCadBairro.getjTextDescricao().setText(bairro.getDescricao());
                telaCadBairro.getjTextId().setEnabled(false);
                
                
            }
        } else if (acao.getSource() == telaCadBairro.getjButtonSair()) {
            telaCadBairro.dispose();

        }
    }

}
