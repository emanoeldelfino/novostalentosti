package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
import sistema.service.ClienteService;
import sistema.view.FormularioCliente;

// extends dá pronto
// implements dá obrigação

public class ListagemClienteController implements ActionListener {
    private ClienteService service = new ClienteService();

    public ArrayList<Cliente> getAllClientes() {
        return service.getAllClientes();
    }

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
        // JOptionPane.showMessageDialog(null, "Botão Novo");
        FormularioCliente formulario = new FormularioCliente();
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
