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

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.formBusColaborador.getjButtonCarregar()) {
            if (this.formBusColaborador.getjTableBuscas().getValueAt(this.formBusColaborador.getjTableBuscas().getSelectedRow(), 0) != null) {
                ControlerCadastroColaborador.codigo = (int) this.formBusColaborador.getjTableBuscas().getValueAt(this.formBusColaborador.getjTableBuscas().getSelectedRow(), 0);
                formBusColaborador.dispose();
            } else if (evento.getSource() == formBusColaborador.getjButtonSair()) {
                formBusColaborador.dispose();
            }
        }
    }
}
