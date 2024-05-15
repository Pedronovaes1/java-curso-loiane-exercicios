package POO;

public class PrimeiroPrograma {
    public static void main(String[] args) {
          Carro van = new Carro();
          van.marca = "Fiat";
          van.modelo = "Ducato";
          van.numPassageiros = 10;
          van.consumoCombustivel = 0.2;
          van.capCombustivel = 100;
          System.out.println(van.marca);
          System.out.println(van.numPassageiros);

          Carro fusca = new Carro();
          fusca.marca = "Chevrolet";
          fusca.modelo = " ";
    }
}
