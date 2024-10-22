package exercicio5;

public class Bicicleta implements IMeioTransporte{
    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }
    @Override
    public void frear() {
        System.out.println("Freando");
    }
}
