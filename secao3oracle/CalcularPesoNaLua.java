public class CalcularPesoNaLua {

    public double calcularPesoNaLua(double peso) {
        double gravidadeLua = 1.62;
        return (peso / 9.807) * gravidadeLua;
    }

}
