package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FormBusProduto;

public class ControllerBusProduto implements ActionListener {

    FormBusProduto formBusProduto;

    public ControllerBusProduto(FormBusProduto formBusProduto) {

        this.formBusProduto = formBusProduto;

        this.formBusProduto.getjButtonCarregar().addActionListener(this);
        this.formBusProduto.getjButtonSair().addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == this.formBusProduto.getjButtonCarregar()) {

        } else if (acao.getSource() == this.formBusProduto.getjButtonSair()) {

        }

    }

}
