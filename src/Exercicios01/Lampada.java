package Exercicios01;

public class Lampada {
    boolean ligada = true;

    void desligar(){

        if (ligada  == true){
            ligada = false;
            System.out.println("A lampada foi desligada");
        }else{
            System.out.println("A lampada está desligada");
        }
    }

    void ligar(){
        if (ligada == false) {
            ligada = true;
            System.out.println("A lampada foi ligada");
        }else{
            System.out.println("A lampada está ligada");
        }
    }
}
