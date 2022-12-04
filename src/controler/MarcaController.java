package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroMarca;

/**
 *
 * @author murilo.cunha
 */
public class MarcaController implements ActionListener {

    public MarcaController() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CadastroMarca cadstrMarca = new CadastroMarca();
        if (e.getSource() == cadstrMarca.getBtnCancelar()) {
            cadstrMarca.dispose();
        } else if (e.getSource() == cadstrMarca.getBtnCadastrar()) {
            cadstrMarca.getTxtId().getText();
            cadstrMarca.getTxtDescricao().getText();
            cadstrMarca.dispose();
        }
    }
}
