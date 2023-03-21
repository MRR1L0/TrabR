package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FormBusEndereco;

public class ControlerBuscaEndereco implements ActionListener {

    FormBusEndereco formBusEndereco;

    public ControlerBuscaEndereco(FormBusEndereco formBusEndereco) {

        this.formBusEndereco = formBusEndereco;

        this.formBusEndereco.getjButtonCarregar().addActionListener(this);
        this.formBusEndereco.getjButtonSair().addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == this.formBusEndereco.getjButtonCarregar()) {

        } else if (acao.getSource() == this.formBusEndereco.getjButtonSair()) {

        }

    }

}
