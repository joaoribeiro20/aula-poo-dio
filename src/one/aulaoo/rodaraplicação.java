package one.aulaoo;

class rodaraplicação {

    public static void main(String[] args){

        carro carro1 = new carro();

        carro1.setCor("azul");
        carro1.setModelo("gla2000");
        carro1.setConbustivel(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getConbustivel());

    }
}
