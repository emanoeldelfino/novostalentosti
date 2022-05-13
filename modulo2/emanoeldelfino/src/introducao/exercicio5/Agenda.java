package introducao.exercicio5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Agenda {
    private long id;
    private Medico medico;
    private ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public ArrayList<Agendamento> getListaAgendamentos() {
        return listaAgendamentos;
    }
    public void setListaAgendamentos(ArrayList<Agendamento> listaAgendamentos) {
        this.listaAgendamentos = listaAgendamentos;
    }
    public void imprimirAgenda() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        StringBuilder dados = new StringBuilder();
        dados.append(String.format("Agenda id: %d.\n", this.id));
        dados.append(String.format("Medico CRM: %s.\n", this.medico.getCRM()));
        dados.append(String.format("Medico id: %d.\n", this.medico.getId()));
        dados.append(String.format("Medico nome: %s.\n", this.medico.getNome()));

        int i;
        for (i = 0; i < listaAgendamentos.size(); i++) {
            dados.append(String.format("Agendamento %d id: %d.\n", i + 1, listaAgendamentos.get(i).getId()));
            dados.append(String.format("Agendamento %d dataHora: %s.\n", i + 1, sdf.format(listaAgendamentos.get(i).getDataHora())));
            dados.append(String.format("Agendamento %d Paciente id: %d.\n", i + 1, listaAgendamentos.get(i).getPaciente().getId()));
            dados.append(String.format("Agendamento %d Paciente id: %s.\n", i + 1, listaAgendamentos.get(i).getPaciente().getNome()));
            dados.append(String.format("Agendamento %d Paciente id: %s.\n", i + 1, listaAgendamentos.get(i).getPaciente().getTelefone()));
        }
        System.out.println(dados);
    }
}
