package equipamentos.copiadora;

//Para usar uma interface em uma classe, não usamos o "extends"
//e sim o "implements"!
public class Xerox implements Copiadora{
    @Override
    public void copiar(){
        System.out.println("Copiando!");
    }
}
