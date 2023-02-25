/*1 - Exercício para treinar métodos GET e SET no OBJETO CARRO; 
2 - fazer método para calcular total para encher o tanque por meio de parâmetros
3 - Criar os construtores de SOBRECARGA para o método 
(*) DICA: primeira coisa no código são os ATRIBUTOS (variáveis); depois os CONSTRUTORES; Depois os Métodos Get
e SET e se tiver métodos mais complexos, vem por último. Essa é uma boa prática!*/

class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    // Inicialização do Construtor

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    void setCor(String cor) {
        this.cor = cor;
    }

    // Aqui, o método "SET" serve para SETAR/ATRIBUIR um valor ao atributo cor, por
    // meio do parâmetro.
    String getCor() {
        return this.cor;
        // Este método "GET" RETORNARÁ o valor do objeto COR. Portanto, não pode ser
        // "VOID".
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return this.modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // Método para calcular o valor total para encher o tanque:
    double ValorTotalTanque(double valorcombustivel) {
        return capacidadeTanque * valorcombustivel;
    }

}
