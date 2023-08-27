package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        Deskjet deskjet = new Deskjet();

        Impressora impressora1 = deskjet;
        //não podemos declarar uma deskjet como digitalizadora e copiadora
        //pois uma deskjet so realiza a impressão!
        Digitalizadora digitalizadora1 = deskjet;
        Copiadora copiadora1 = deskjet;

        Scanner scanner = new Scanner();
        Digitalizadora digitalizadora2 = scanner;
        //não podemos declarar uma scanner como impressora e copiadora
        //pois uma scanner so realiza a digitalização!
        Impressora impressora2 = scanner;
        Copiadora copiadora2 = scanner;

        Xerox xerox = new Xerox();
        Copiadora copiadora3 = xerox;
        //não podemos declarar uma xerox como impressora e digitalizadora
        //pois uma xerox so realiza a Copia!
        Digitalizadora digitalizadora3 = xerox;
        Impressora impressora3 = xerox;

        EquipamentoMultifuncional emf = new EquipamentoMultifuncional();

        //o EquipamentoMultifuncional pode imprimir, copiar e digitalizar
        //pois a classe implementa todas as interfaces.
        Impressora impressora = emf;
        Digitalizadora digitalizadora = emf;
        Copiadora copiadora = emf;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
