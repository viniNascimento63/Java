package oo.composicao;

public class Carro {
    final Motor motor = new Motor();

    void acelerar() {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void desacelerar() {
        if (motor.fatorInjecao > 0.8) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
