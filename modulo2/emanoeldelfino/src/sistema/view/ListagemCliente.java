package sistema.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import sistema.controller.ListagemClienteController;
import sistema.model.TabelaClienteModel;

public class ListagemCliente extends JFrame {

    private JScrollPane jpnCentro;
    private JPanel jpnSul = new JPanel();
    private JButton btnNovo = new JButton("Novo");
    private JButton btnAlterar = new JButton("Alterar");
    private JButton btnExcluir = new JButton("Excluir");

    private ListagemClienteController controller = new ListagemClienteController();

    private TabelaClienteModel tabelaModel = new TabelaClienteModel(controller);
    private JTable tabela = new JTable(tabelaModel);


    public ListagemCliente() {
        setSize(500, 400);
        setTitle("Listagem de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criaPaineis(); // chama o método
        setVisible(true);
    }

    private void criaPaineis() {
        jpnSul.setLayout(new FlowLayout(FlowLayout.LEFT));

        jpnSul.setBackground(new Color(125, 156, 2, 87));
        // jpnSul.setBackground(Color.decode("#00FF00"));

        jpnSul.add(btnNovo);
        jpnSul.add(btnAlterar);
        jpnSul.add(btnExcluir);

        add(jpnSul, "South");

        btnNovo.addActionListener(controller);
        btnNovo.setName("btnNovo");
        btnAlterar.addActionListener(controller);
        btnAlterar.setName("btnAlterar");
        btnExcluir.addActionListener(controller);
        btnExcluir.setName("btnExcluir");

        jpnCentro = new JScrollPane(tabela);
        // jpnCentro

        jpnCentro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jpnCentro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(jpnCentro, "Center");
    }
}
