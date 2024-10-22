package exercicio5;

public class Cachorro implements IMeioTransporte {

    public Cachorro() {}
    @Override
    public void acelerar() {
        System.out.println("Acelerando... Vrum, Vrum");
    }
    @Override
    public void frear() {
        System.out.println("Freando... Vrum, Vrum");
    }
}
