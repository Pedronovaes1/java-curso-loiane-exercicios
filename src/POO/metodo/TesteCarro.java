package POO.metodo;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.consumoCombustivel = 0.2;
        van.capCombustivel = 100;

        System.out.println(van.marca);
        System.out.println(van.numPassageiros);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println(autonomia);

        van.calcularCombustivel(100);
        System.out.println(van.calcularCombustivel(100));
    }
}
