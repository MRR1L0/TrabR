package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FormBusCliente;

public class ControllerBusCliente implements ActionListener {

    FormBusCliente formBusCliente;

    public ControllerBusCliente(FormBusCliente formBusCliente) {

        this.formBusCliente = formBusCliente;

        this.formBusCliente.getjButtonCarregar().addActionListener(this);
        this.formBusCliente.getjButtonSair().addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == this.formBusCliente.getjButtonCarregar()) {

        } else if (acao.getSource() == this.formBusCliente.getjButtonSair()) {

        }

    }
}
