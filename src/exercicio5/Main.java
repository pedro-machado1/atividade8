package exercicio5;

public class Main {
    public static void main(String[] args) {
        IMeioTransporte[] array = new IMeioTransporte[3];
        array[0]= new Cachorro();
        array[1]= new Bicicleta();
        array[2]= new Trem();
        for(IMeioTransporte a:array){
            a.acelerar();
            a.frear();
        }
    }
}
