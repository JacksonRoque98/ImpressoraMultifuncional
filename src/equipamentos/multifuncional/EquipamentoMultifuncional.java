package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar(){
        System.out.println("REALIZANDO UMA COPIA PELO EQUIPAMENTO MULTIFUNCIONAL!");
    }
    @Override
    public void digitalizar(){
        System.out.println("REALIZANDO UMA DIGITALIZAÇÃO PELO EQUIPAMENTO MULTIFUNCIONAL!");
    }
    @Override
    public void imprimir(){
        System.out.println("REALIZANDO UMA IMPRESSÃO PELO EQUIPAMENTO MULTIFUNCIONAL!");
    }
}
