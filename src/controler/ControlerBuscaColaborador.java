package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FormBusColaborador;

public class ControlerBuscaColaborador implements ActionListener {

    FormBusColaborador formBusColaborador;

    public ControlerBuscaColaborador(FormBusColaborador formBusColaborador) {

        this.formBusColaborador = formBusColaborador;

        this.formBusColaborador.getjButtonCarregar().addActionListener(this);
        this.formBusColaborador.getjButtonSair().addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent acao) {

        if (acao.getSource() == this.formBusColaborador.getjButtonCarregar()) {

        } else if (acao.getSource() == this.formBusColaborador.getjButtonSair()) {

        }

    }

}
