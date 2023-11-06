package org.testes;

class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    // Métodos na versão 1 (antes da refatoração)
    public void ligar() {
        System.out.println("Moto ligada");
    }

    public void desligar() {
        System.out.println("Moto desligada");
    }

    // Métodos na versão 2 (após a refatoração)
    public boolean hasPartidaEletrica() {
        return partidaEletrica;
    }
}
