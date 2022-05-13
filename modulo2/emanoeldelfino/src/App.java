// import introducao.Pessoa;
import introducao.*;

public class App {
    //Pessoa zezinho = new Pessoa();

    // static é um modificador que quebra as regras que conhecemos
    public static void main(String[] args) {
        // Criando uma variável do tipo Pessoa
        // Criando uma instância de objeto a partir da classe Pessoa
        Pessoa zezinho = new Pessoa("Zézinho da Silva Sauro");
        // zezinho.nome = "Zézinho da Silva Sauro";
        zezinho.idade = 24;
        zezinho.CPF = "123.456.789-00";
        zezinho.altura = 1.8f;
        
        Pessoa luizinho = new Pessoa("Luizinho da Silva Sauro Jr");
        // luizinho.nome = "Luizinho da Silva Sauro Jr";
        luizinho.idade = 17;
        // luizinho.CPF = "456.123.890-45";
        luizinho.altura = 1.74f;

        System.out.println(zezinho.getNome());
        System.out.println(zezinho.idade);
        System.out.println(zezinho.CPF);
        System.out.println(zezinho.altura);
        System.out.println();
        System.out.println(luizinho.getNome());
        System.out.println(luizinho.idade);
        System.out.println(luizinho.CPF);
        System.out.println(luizinho.altura);
        System.out.println();

        String resultado = zezinho.podeDirigir();
        System.out.println(resultado);
        resultado = luizinho.podeDirigir();
        System.out.println(resultado);

        System.out.println();
        zezinho.mostraCPF();
        luizinho.mostraCPF();

        Celular startak = new Celular("(47) 99999-5555");
        startak.setModelo("PT 550");
        startak.setMarca("Motorola");

        startak.setDono(zezinho);

        Aplicativo app1 = new Aplicativo("Angry Birds");
        Aplicativo app2 = new Aplicativo("WhatsApp");
        Aplicativo app3 = new Aplicativo("TikTok");
        Aplicativo app4 = new Aplicativo("Instagram");

        var lista = startak.getListaAplicativos();
        lista.add(app1);
        lista.add(app2);
        lista.add(app3);
        lista.add(app4);
        // lista.add("Laranja");
        // lista.add("Banana");
        // lista.add(1234);
        // lista.add(1200.05f);
        // lista.add(true);

        startak.getListaAplicativos().remove(2);
        startak.getListaAplicativos().set(2, new Aplicativo("GloboPlay"));
        System.out.println(startak.getListaAplicativos().indexOf(app2));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // lista.forEach((app) -> System.out.println(app));

        // for(Object app : lista) {
        //     System.out.println(app);
        // }
        for (Aplicativo app: startak.getListaAplicativos()) {
            System.out.println(app);
        }

        // var app = new Aplicativo("");
        // app.nome = "lalalal";
    }
}
