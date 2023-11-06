package org.test;

public class testes {

    public static  void testes(){
        // Exemplo de utilização das classes
        Carro carro = new Carro("Toyota", "Corolla", 2023, 4);
        carro.acelerar();
        carro.frear();

        Moto moto = new Moto("Honda", "CBR500R", 2023, true);
        moto.ligar();
        moto.desligar();

        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2023, 40000);
        caminhao.carregar();
        caminhao.descarregar();
    }

}
