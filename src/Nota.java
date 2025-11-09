
public class Nota {

    private final double valor;

    public Nota(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    //formatação de string para duas casas decimais...
    @Override
    public String toString() {
        return "nota: " + String.format("%.2f", valor);
    }
}
