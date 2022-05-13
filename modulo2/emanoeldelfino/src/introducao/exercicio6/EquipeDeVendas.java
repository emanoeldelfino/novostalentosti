package introducao.exercicio6;

import java.util.ArrayList;

public class EquipeDeVendas {
    Gerente gestor;
    ArrayList<Vendedor> listaVendedores = new ArrayList<>();

    public Gerente getGestor() {
        return gestor;
    }

    public void setGestor(Gerente gestor) {
        this.gestor = gestor;
    }

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public String listarEquipe() {
        StringBuilder dados = new StringBuilder();
        dados.append(String.format("gestor id %d\n", gestor.getId()));
        dados.append(String.format("gestor nome %s\n", gestor.getNome()));
        dados.append(String.format("gestor setor %s\n", gestor.getSetor()));
        dados.append(String.format("gestor telefone %s\n", gestor.getTelefone()));
    
        int i;
        for (i = 0; i < listaVendedores.size(); i++) {
            Vendedor vendedor = listaVendedores.get(i);
            dados.append(String.format("vendedor %d id %d\n", i + 1, vendedor.getId()));
            dados.append(String.format("vendedor %d meta de vendas R$ %.2f\n", i + 1, vendedor.getMetaVendas()));
            dados.append(String.format("vendedor %d nome %s\n", i + 1, vendedor.getNome()));
            dados.append(String.format("vendedor %d porcentagem de comissão %.2f %%\n", i + 1, vendedor.getPercComissao()));
            dados.append(String.format("vendedor %d telefone %s\n", i + 1, vendedor.getTelefone()));
        }

        return dados.toString();
    }
}
