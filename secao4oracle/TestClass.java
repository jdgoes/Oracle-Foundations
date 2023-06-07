public class TestClass {
    public static void main(String[] args) {
        ComputeMethods computeMethods = new ComputeMethods();
        
        double tempEmFahrenheit = 100.4;
        double tempEmCelsius = computeMethods.fahrenheitParaCelsius(tempEmFahrenheit);
        System.out.println("Temperatura em Celsius é " + tempEmCelsius);
        
        double ladoA = 10.816651099183552;
        double ladoB = 0.006999999999999999;
        double hipotenusa = computeMethods.hipotenusa(ladoA, ladoB);
        System.out.println("Hipotenusa é " + hipotenusa);
        
        int somaDosDados = computeMethods.rolarDados();
        System.out.println("A soma dos valores dos dados é " + somaDosDados);
    }
}

