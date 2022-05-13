import introducao.bichos.Animal;
import introducao.bichos.Mamifero;

public class App2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setSexo("feminino");
        System.out.println(animal.getClass());
        System.out.println(animal.hashCode());
        
        Mamifero mamifero = new Mamifero();
        mamifero.setSexo("masculino");
        mamifero.setGeraLeite(false);
        System.out.println(mamifero.getClass());
        System.out.println(mamifero.hashCode());

        // Informações específicas do mamifero continuam
        // existindo, porém não podem ser acessadas.
        // Olhando o objeto a partir da interface da superclasse
        Animal animal2 = mamifero;
        // animal2.isGeraLeite();
        // Cast - Conversão
        System.out.println(((Mamifero)animal2).isGeraLeite());
        System.out.println(animal2.getSexo());
        System.out.println(animal2.getClass());
        System.out.println(animal2.hashCode());

        // Antigamente HERANÇA era incentivada a ser usada,
        // porém ela gera um acoplamento na super classe que
        // pode estragar todas as subclasses.
    }
}
