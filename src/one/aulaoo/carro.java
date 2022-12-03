package one.aulaoo;
class carro {// class

    String cor; // isso é um atribudo da class carro
    String modelo; // isso é um atribudo da class carro
    int conbustivel; // isso é um atribudo da class carro

    carro()// contrutor padrão sem parametros //
    {
    }
    carro(String cor, String modelo, int conbustivel){// construtor com parametros (sobrecarga) // metodos especiais
        this.cor = cor;// o atributor cor é igual cor
        this.modelo = modelo;
        this.conbustivel = conbustivel;
    }
///////////////////////////////////////
    void setCor(String cor){ // metodo
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }// metodo set/get
 //////////////////////////////////////////////
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
///////////////////////////////////////
    void setConbustivel(int conbustivel) {
        this.conbustivel = conbustivel;
    }
    int getConbustivel(){
        return conbustivel;
    }
    double totalvalortanque(double valorconbustivel){
        return conbustivel * valorconbustivel;
    }

}