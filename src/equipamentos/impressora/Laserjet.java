package equipamentos.impressora;

//Para usar uma interface em uma classe, não usamos o "extends"
//e sim o "implements"!
public class Laserjet implements Impressora{
    public void imprimir(){
        System.out.println("IMPRIMINDO!");
    }
}
