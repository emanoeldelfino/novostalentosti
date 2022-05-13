package sistema.service;

import java.util.ArrayList;
import java.util.Calendar;
// import java.util.List;
import java.util.GregorianCalendar;

import sistema.entity.Cliente;

public class ClienteService {
    // LinkedList<>() usada para perfomance
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public ClienteService() {
        Calendar calendario = GregorianCalendar.getInstance();

        var cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setCPF("555.555.555-55");
        calendario.set(2022, 05, 12);
        cliente1.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente1);

        var cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Pedro");
        cliente2.setCPF("444.444.444-44");
        calendario.set(1999, 02, 05);
        cliente2.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente2);

        var cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Maria");
        cliente3.setCPF("333.333.333-33");
        calendario.set(1991, 07, 01);
        cliente3.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente3);
    }

    public ArrayList<Cliente> getAllClientes() {
        return listaClientes;
    }
}
