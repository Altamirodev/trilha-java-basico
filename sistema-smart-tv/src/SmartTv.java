//Abaixo criamos um MÉTODO SmartTv contendo os atributos para alterar os status da SmartTV
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume da TV para : " + volume);
        // Poderia ser: volume = volume + 1
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume da TV para : " + volume);
        // Poderia ser: volume = volume - 1
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
