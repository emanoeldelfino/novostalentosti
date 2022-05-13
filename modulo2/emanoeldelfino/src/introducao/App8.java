package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import introducao.exercicio5.Agenda;
import introducao.exercicio5.Agendamento;
import introducao.exercicio5.Medico;
import introducao.exercicio5.Paciente;

public class App8 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Paciente paciente1 = new Paciente();
        paciente1.setId(1L);
        paciente1.setNome("Amanda Câmara Tomé");
        paciente1.setTelefone("47 11111-1111");

        Paciente paciente2 = new Paciente();
        paciente2.setId(2L);
        paciente2.setNome("Nayra Rabelo Fontoura");
        paciente2.setTelefone("47 22222-2222");

        Paciente paciente3 = new Paciente();
        paciente3.setId(3L);
        paciente3.setNome("Nayra Rabelo Fontoura");
        paciente3.setTelefone("47 33333-3333");

        Paciente paciente4 = new Paciente();
        paciente4.setId(4L);
        paciente4.setNome("Grace Brito Mansilha");
        paciente4.setTelefone("47 44444-4444");

        Medico medico1 = new Medico();
        medico1.setCRM("11111111-1/SC");
        medico1.setId(1L);
        medico1.setNome("Paulo André");

        Medico medico2 = new Medico();
        medico2.setCRM("22222222-2/SC");
        medico2.setId(2L);
        medico2.setNome("José Luiz da Silva");

        Agenda agenda1 = new Agenda();
        agenda1.setId(1L);
        agenda1.setMedico(medico1);

        Agenda agenda2 = new Agenda();
        agenda2.setId(2L);
        agenda2.setMedico(medico2);

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);

        ArrayList<Medico> medicos = new ArrayList<>();
        medicos.add(medico1);
        medicos.add(medico2);

        ArrayList<Agenda> agendas = new ArrayList<>();
        agendas.add(agenda1);
        agendas.add(agenda2);

        try {
            int i = 6;
            for (Paciente paciente : pacientes) {
                for (Agenda agenda : agendas) {
                    Agendamento agendamento = new Agendamento();
                    agendamento.setDataHora(sdf.parse(String.format("05/05/22 %02d:00", i++)));
                    agendamento.setId(Integer.toUnsignedLong(i));
                    agendamento.setMedico(agenda.getMedico());
                    agendamento.setPaciente(paciente);

                    var listaAgendamentos = agenda.getListaAgendamentos();
                    listaAgendamentos.add(agendamento);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        agenda1.imprimirAgenda();
        agenda2.imprimirAgenda();
    }
}
