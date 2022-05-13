import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Idade: ");
        age = sc.nextInt();

        if (age < 0)        
            System.out.println("Inválido");
        else if (age <= 20) 
            System.out.println("Jovem");
        else if (age <= 60) 
            System.out.println("Adulto");
        else                
            System.out.println("Idoso");
        
        sc.close();
    }
}
