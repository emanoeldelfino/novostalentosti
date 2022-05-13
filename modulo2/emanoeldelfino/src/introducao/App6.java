package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import introducao.exercicio3.Comprador;
import introducao.exercicio3.ItemPedido;
import introducao.exercicio3.Pedido;
import introducao.exercicio3.Produto;

public class App6 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Comprador zezinho = new Comprador();
        zezinho.setId(300L);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala 100");

        Pedido pedido1 = new Pedido();
        pedido1.setId(1L);
        try {
            pedido1.setData(sdf.parse("29/04/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Produto produto1 = new Produto();
        produto1.setId(1001L);
        produto1.setNome("Playstation 5");
        produto1.setValor(8000f);

        Produto produto2 = new Produto();
        produto2.setId(1002L);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        ItemPedido item1 = new ItemPedido();
        item1.setId(1L);
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);
        item1.setProduto(produto1);

        ItemPedido item2 = new ItemPedido();
        item2.setId(2L);
        item2.setQuantidade(1);
        item2.setValorVenda(4000f);
        item2.setProduto(produto2);

        pedido1.setCliente(zezinho);

        var itens1 = pedido1.getListaItens();
        itens1.add(item1);
        itens1.add(item2);

        float result = pedido1.calcValorTotal();
        System.out.printf("\nO total do pedido é: %.2f.", result);

        Comprador luizinho = new Comprador();
        luizinho.setId(400L);
        luizinho.setNome("Luizinho da Silva");
        luizinho.setEndereco("Rua Lalala 200");

        Pedido pedido2 = new Pedido();
        pedido2.setId(2L);
        try {
            pedido2.setData(sdf.parse("27/04/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Produto produto3 = new Produto();
        produto3.setId(1002L);
        produto3.setNome("Computador Gamer");
        produto3.setValor(3500f);

        Produto produto4 = new Produto();
        produto4.setId(1003L);
        produto4.setNome("Xbox Series S");
        produto4.setValor(2750f);

        Produto produto5 = new Produto();
        produto5.setId(1003L);
        produto5.setNome("Bicicleta");
        produto5.setValor(1300f);

        ItemPedido item3 = new ItemPedido();
        item3.setId(3L);
        item3.setQuantidade(2);
        item3.setValorVenda(3000f);
        item3.setProduto(produto3);

        ItemPedido item4 = new ItemPedido();
        item4.setId(4L);
        item4.setQuantidade(1);
        item4.setValorVenda(2200f);
        item4.setProduto(produto4);

        ItemPedido item5 = new ItemPedido();
        item5.setId(5L);
        item5.setQuantidade(2);
        item5.setValorVenda(1000f);
        item5.setProduto(produto5);

        pedido2.setCliente(luizinho);

        var itens2 = pedido2.getListaItens();
        itens2.add(item3);
        itens2.add(item4);
        itens2.add(item5);

        System.out.println(pedido2.calcValorTotal());
    }
}
