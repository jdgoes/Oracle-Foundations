import java.util.Comparator;
import java.util.Random;

public class Time {

    private String nomeDoTime;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;


    public Time(String nomeDoTime) {
        
        this.nomeDoTime = nomeDoTime;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;

    }


    public void atualizarEstatisticas(int golsMarcados, int golsSofridos) {
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;

        if (golsMarcados > golsSofridos)      { vitorias++; } 
        else if (golsMarcados < golsSofridos) { derrotas++; } 
        else { empates++; }

    }
    

    public void imprimirEstatisticas() {

        System.out.printf("Estatísticas do Time: %s\n", nomeDoTime);
        System.out.printf("Vitórias: %d\n", vitorias);
        System.out.printf("Derrotas: %d\n", derrotas);
        System.out.printf("Empates: %d\n", empates);
        System.out.printf("Gols Marcados: %d\n", golsMarcados);
        System.out.printf("Gols Sofridos: %d\n", golsSofridos);
        System.out.println();
        
    }

    public static String gerarEquipeAleatoria() {

        String[] equipes = {"Equipe A", "Equipe B", "Equipe C", "Equipe D", "Equipe E"};
        Random nomeAleatorio = new Random();
        int indice = nomeAleatorio.nextInt(equipes.length);
        return equipes[indice];

    }    
    
    public static Comparator<Time> ComparadorNomeDasEquipes = Comparator.comparing(Time::getNomeDoTime);

    
    public String getNomeDoTime() {return nomeDoTime;}
    public int getGolsMarcados() {return golsMarcados;}
    public int getGolsSofridos() {return golsSofridos;}

}



