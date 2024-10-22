package exercicio6;

public class Main {
    public static void main(String[] args) {
        Animal[] array = new Animal[3];
        array[0]= new Cachorro();
        array[1]= new Gato();
        array[2]= new Vaca();
        for(Animal a:array){
            a.emitirSom();
        }
    }
}
