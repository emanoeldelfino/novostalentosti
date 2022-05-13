package introducao;

import introducao.exercicio6.EquipeDeVendas;
import introducao.exercicio6.Gerente;
import introducao.exercicio6.Vendedor;

public class App9 {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setId(1L);
        vendedor1.setMetaVendas(9500f);
        vendedor1.setNome("José");
        vendedor1.setPercComissao(9f);
        vendedor1.setTelefone("47 11111-1111");

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setId(2L);
        vendedor2.setMetaVendas(10000f);
        vendedor2.setNome("João");
        vendedor2.setPercComissao(10f);
        vendedor2.setTelefone("47 22222-2222");

        Vendedor vendedor3 = new Vendedor();
        vendedor3.setId(3L);
        vendedor3.setMetaVendas(8000f);
        vendedor3.setNome("Paulo");
        vendedor3.setPercComissao(5f);
        vendedor3.setTelefone("47 33333-3333");

        Vendedor vendedor4 = new Vendedor();
        vendedor4.setId(4L);
        vendedor4.setMetaVendas(15000f);
        vendedor4.setNome("Maria");
        vendedor4.setPercComissao(11.5f);
        vendedor4.setTelefone("47 44444-4444");

        Vendedor vendedor5 = new Vendedor();
        vendedor5.setId(5L);
        vendedor5.setMetaVendas(43000f);
        vendedor5.setNome("Amanda");
        vendedor5.setPercComissao(12f);
        vendedor5.setTelefone("47 55555-5555");

        Gerente gerente1 = new Gerente();
        gerente1.setId(1L);
        gerente1.setNome("Rogério");
        gerente1.setSetor("Finanças");
        gerente1.setTelefone("47 66666-6666");

        Gerente gerente2 = new Gerente();
        gerente2.setId(2L);
        gerente2.setNome("Rogério");
        gerente2.setSetor("Tecnologia");
        gerente2.setTelefone("47 77777-7777");

        EquipeDeVendas equipe1 = new EquipeDeVendas();
        equipe1.setGestor(gerente1);
        var vendedores1 = equipe1.getListaVendedores();
        vendedores1.add(vendedor1);
        vendedores1.add(vendedor2);
        vendedores1.add(vendedor3);

        EquipeDeVendas equipe2 = new EquipeDeVendas();
        equipe2.setGestor(gerente2);
        var vendedores2 = equipe2.getListaVendedores();
        vendedores2.add(vendedor4);
        vendedores2.add(vendedor5);

        System.out.println(equipe1.listarEquipe());
        System.out.println(equipe2.listarEquipe());
    }
}
