package Exercicios01;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        System.out.println(lampada.ligada);

        lampada.desligar();
        System.out.println("Lampada: " + lampada.ligada);
    }
}
