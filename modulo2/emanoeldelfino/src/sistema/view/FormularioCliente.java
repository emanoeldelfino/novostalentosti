package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class FormularioCliente extends JDialog {
    
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOK = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txtId = new JTextField(4);
    private JTextField txtNome = new JTextField(18);
    private JTextField txtCPF = new JTextField(12);
    private JTextField txtDataNasc = new JTextField(8);

    public FormularioCliente() {
        setSize(400, 200);
        setModal(true); // bloquear o usuário na JDialog
        criaPaineis();
        setVisible(true);
    }

    private void criaPaineis() {
        add(jpnBotao, "South");
        jpnBotao.add(btnOK);
        jpnBotao.add(btnCancelar);

        jpnCentro.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.insets = new Insets(5, 10, 5, 10); // como a margin do CSS

        add(jpnCentro, "Center");

        cons.gridx = 0; // coluna 0
        cons.gridy = 0; // linha 0
        cons.weightx = 0.2; // percentual do tamanho (largura)
        jpnCentro.add(new JLabel("Código: "), cons);
        
        cons.gridx = 1; // coluna 1
        cons.gridy = 0; // linha 0
        cons.weightx = 0.8; // percentual do tamanho (largura)
        jpnCentro.add(txtId, cons);
        
        cons.gridx = 0; // coluna 0
        cons.gridy = 1; // linha 1
        cons.weightx = 0.2; // percentual do tamanho (largura)
        jpnCentro.add(new JLabel("Nome: "), cons);

        cons.gridx = 1; // coluna 1
        cons.gridy = 1; // linha 1
        cons.weightx = 0.8; // percentual do tamanho (largura)
        jpnCentro.add(txtNome, cons);

        cons.gridx = 0; // coluna 0
        cons.gridy = 2; // linha 2
        cons.weightx = 0.2; // percentual do tamanho (largura)
        jpnCentro.add(new JLabel("CPF: "), cons);

        cons.gridx = 1; // coluna 1
        cons.gridy = 2; // linha 2
        cons.weightx = 0.8; // percentual do tamanho (largura)
        jpnCentro.add(txtCPF, cons);

        cons.gridx = 0; // coluna 0
        cons.gridy = 3; // linha 3
        cons.weightx = 0.2; // percentual do tamanho (largura)
        jpnCentro.add(new JLabel("Data de Nascimento: "), cons);

        cons.gridx = 1; // coluna 1
        cons.gridy = 3; // linha 3
        cons.weightx = 0.8; // percentual do tamanho (largura)
        jpnCentro.add(txtDataNasc, cons);
    }
}
