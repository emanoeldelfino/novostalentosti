package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

// extends dá pronto
// implements dá obrigação

public class ListagemClienteController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent botaoClicado = (JComponent)e.getSource();
        
        switch (botaoClicado.getName()) {
            case "btnNovo":
                btnNovoClique();
            break;
            case "btnAlterar":
                btnAlterarClique();
            break;
            case "btnExcluir":
                btnExcluirClique();
            break;
            default:
                outroClique();
            break;
        }
    }

    private void btnNovoClique() {
        JOptionPane.showMessageDialog(null, "Botão Novo");
    }

    private void btnAlterarClique() {
        JOptionPane.showMessageDialog(null, "Botão Alterar");
    }

    private void btnExcluirClique() {
        JOptionPane.showMessageDialog(null, "Botão Excluir");
    }

    private void outroClique() {
        JOptionPane.showMessageDialog(null, "Outro Clique");
    }
}
