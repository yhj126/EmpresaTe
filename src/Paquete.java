import java.util.ArrayList;
import java.util.List;

// Clase Paquete que contiene otras cajas o son paquetes de tées
class Paquete implements Caja {
    private List<Caja> cajas = new ArrayList<>();

    public int getContenido() {
        int cantidad = 0;
        for (Caja c :
                cajas) {
            cantidad += c.getContenido();
        }
        return cantidad;
    }

    public void add(CajaTe caja) {
        cajas.add(caja);

    }
    public void add(Caja caja) {
        cajas.add(caja);

    }

    @Override
    public void imprimir() {
        for (Caja c : cajas
        ) {
            c.imprimir();
        }
    }

    @Override
    public void notificar() {

    }
}
