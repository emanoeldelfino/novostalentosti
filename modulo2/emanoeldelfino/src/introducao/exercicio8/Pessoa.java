package introducao.exercicio8;

import java.util.ArrayList;

public class Pessoa {
    ArrayList<Gasto> gastos = new ArrayList<>();

    public ArrayList<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList<Gasto> gastos) {
        this.gastos = gastos;
    }

    public String listaGastos() {
        return "";
    }

    public float calcTotalGastos() {
        float sum = 0f;

        for (Gasto gasto : gastos) {
            sum += gasto.getValor();
        }

        return sum;
    }
}
