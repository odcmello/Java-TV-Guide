package Control;

import Model.Canal;
import Main.globalVariablesLists;

public class canalController {

    public boolean inserirCanal(String nomeCanal, int numeroCanal) {
        Canal canal = new Canal();
        canal.setNome(nomeCanal);
        for (Canal c : globalVariablesLists.canaisTV) {
            if (c.getNumeroCanal() == numeroCanal) {
                return false;
            }
        }
        canal.setNumeroCanal(numeroCanal);
        globalVariablesLists.canaisTV.add(canal);
        return true;
    }

    public static boolean removerCanal(int idCanal) {
        for (Canal c : globalVariablesLists.canaisTV) {
            if (c.getNumeroCanal() == idCanal) {
                globalVariablesLists.canaisTV.remove(c);
                return true;
            }
        }
        return false;
    }
}
