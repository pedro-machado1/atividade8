package exercicio5;

public class Trem implements IMeioTransporte{
    @Override
    public void acelerar() {
        System.out.println("Acelerando... Tchu, Tchu");

    }
    @Override
    public void frear() {
        System.out.println("Freando... Tchu, Tchu");
    }
}
