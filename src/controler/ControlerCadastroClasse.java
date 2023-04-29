package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DAO.ClasseDAO;
import model.bo.Classe;
import view.CadastroClasse;
import view.FormBusClasse;

public class ControlerCadastroClasse implements ActionListener {

    CadastroClasse telaCadClasse;
    public static int codigo;
    
    public ControlerCadastroClasse(CadastroClasse parTelaCadClasse) {

        this.telaCadClasse = parTelaCadClasse;

        telaCadClasse.getjButtonNovo().addActionListener(this);
        telaCadClasse.getjButtonCancelar().addActionListener(this);
        telaCadClasse.getjButtonGravar().addActionListener(this);
        telaCadClasse.getjButtonBuscar().addActionListener(this);
        telaCadClasse.getjButtonSair().addActionListener(this);

        telaCadClasse.ativa(true);

        telaCadClasse.ligaDesliga(false);

    }

    @Override
    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == telaCadClasse.getjButtonNovo()) {
            telaCadClasse.ativa(false);
            telaCadClasse.ligaDesliga(true);
            telaCadClasse.getjTextId().setEnabled(false);

        } else if (acao.getSource() == telaCadClasse.getjButtonCancelar()) {
            telaCadClasse.ativa(true);
            telaCadClasse.ligaDesliga(false);

        } else if (acao.getSource() == telaCadClasse.getjButtonGravar()) {
            //verificar espaÃ§os em branco
            if (telaCadClasse.getjTextDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Descrição: Campo com preenchimento obrigatório");

            } else {

                Classe classe = new Classe();
                classe.setDescricao(telaCadClasse.getjTextDescricao().getText());
                ClasseDAO classeDAO = new ClasseDAO();
                classeDAO.create(classe);

                telaCadClasse.ativa(true);
                telaCadClasse.ligaDesliga(false);

            }

        } else if (acao.getSource() == telaCadClasse.getjButtonBuscar()) {

            FormBusClasse formBusClasse = new FormBusClasse(null, true);
            ControlerBuscaClasse controllerBusClasse = new ControlerBuscaClasse(formBusClasse);
            formBusClasse.setVisible(true);

        } else if (acao.getSource() == telaCadClasse.getjButtonSair()) {

            telaCadClasse.dispose();

        }
    }

}
