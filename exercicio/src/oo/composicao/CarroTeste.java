package oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro car = new Carro();
        System.out.println(car.estaLigado());

        car.ligar();
        System.out.println(car.motor.giros());

        car.acelerar();
        car.acelerar();
        car.acelerar();
        System.out.println(car.motor.giros());

        car.desacelerar();
        car.desacelerar();
        System.out.println(car.motor.giros());
    }
}
