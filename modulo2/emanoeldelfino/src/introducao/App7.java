package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import introducao.exercicio4.EmpresaCliente;
import introducao.exercicio4.Funcionario;
import introducao.exercicio4.PessoaFisica;
import introducao.exercicio4.PessoaJuridica;
// import introducao.exercicio4.Pessoa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App7 {
    public static void showMethods(Object obj1, Object obj2) throws IllegalAccessException, InvocationTargetException {
        StringBuilder obj1Methods = new StringBuilder();
        for (Method m : obj1.getClass().getMethods()) {
            obj1Methods.append(m.getName());
            obj1Methods.append(" ");
        }
        String obj1MethodsStr = obj1Methods.toString();

        for (Method m : obj2.getClass().getMethods()) {
            String method = m.getName();
            if ((method.startsWith("get") || method.startsWith("is")) && !method.equals("getClass") && obj1MethodsStr.contains(method)) {
                System.out.println(String.format("%s = %s", method, m.invoke(obj2)));
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("João");
        funcionario1.setTelefone("5555-5555");

        try {
            funcionario1.setDataNascimento(sdf.parse("27/05/1995"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        funcionario1.setCPF("777.777.777-77");
        
        funcionario1.setSalario(3000f);
        funcionario1.setHorasExtras(20);

        EmpresaCliente empresa1 = new EmpresaCliente();
        empresa1.setNome("Metalúrgica do Pedrão");
        empresa1.setTelefone("9999-9999");
    
        try {
            empresa1.setDataCriacao(sdf.parse("05/03/1984"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        empresa1.setCNPJ("88.888.888/0001-88");

        empresa1.setLucroAnual(850_000f);
        empresa1.setRecuperacaoJudicial(false);

        // POLIMORFISMO - POLI - várias MORFIMOS - formas de existir
        /* 2)Crie uma variável pessoa1:PessoaFisica e atribua o valor de funcionario1. 
        Imprima em tela os atributos que são visíveis. */
        PessoaFisica pessoa1 = funcionario1;
        System.out.println(pessoa1.getCPF());
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getTelefone());
        System.out.println(pessoa1.getDataNascimento());

        // 3)Crie uma variável pessoa2:PessoaJuridica e
        PessoaJuridica pessoa2;

        // atribua o valor de empresa1.
        pessoa2 = empresa1;

        // Imprima em tela os atributos que são visíveis.
        System.out.println(pessoa2.getCNPJ());
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getTelefone());
        System.out.println(pessoa2.getDataCriacao());

        // 4)Crie uma variável pessoa3:Pessoa e 
        introducao.exercicio4.Pessoa pessoa3;

        // atribua o valor de pessoa1. 
        pessoa3 = pessoa1;

        // Imprima em tela os atributos que são visíveis.
        System.out.println(pessoa3.getNome());
        System.out.println(pessoa3.getTelefone());

        // 5)Crie uma variável pessoa4:Pessoa 
        introducao.exercicio4.Pessoa pessoa4;

        // e atribua o valor de pessoa2. 
        pessoa4 = pessoa2;

        // Imprima em tela os atributos que são visíveis.
        System.out.println(pessoa4.getNome());
        System.out.println(pessoa4.getTelefone());

        // 6)Crie uma variável funcionario2:Funcionario
        Funcionario funcionario2;
        // e atribua o valor de pessoa3.
        funcionario2 = (Funcionario)pessoa3;
        // Imprima em tela os atributos que são visíveis.
        System.out.println(funcionario2.getCPF());
        System.out.println(funcionario2.getHorasExtras());
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getSalario());
        System.out.println(funcionario2.getTelefone());
        System.out.println(funcionario2.getDataNascimento());

        // 7)Crie uma variável empresa2:EmpresaCliente
        EmpresaCliente empresa2;
        // e atribua o valor de pessoa4.
        empresa2 = (EmpresaCliente)pessoa4;
        // Imprima em tela os atributos que são visíveis.
        System.out.println(empresa2.getCNPJ());
        System.out.println(empresa2.getLucroAnual());
        System.out.println(empresa2.getNome());
        System.out.println(empresa2.getTelefone());
        System.out.println(empresa2.getDataCriacao());

        // try {
        //     showMethods(new PessoaFisica(), pessoa1);
        //     showMethods(new PessoaJuridica(), pessoa2);
        //     showMethods(new Pessoa(), pessoa3);
        //     showMethods(new Pessoa(), pessoa4);
        //     showMethods(new Funcionario(), funcionario2);
        //     showMethods(new EmpresaCliente(), empresa2);
        // } catch (IllegalAccessException | InvocationTargetException e) {
        //     e.printStackTrace();
        // }
    }
}
