// Clase Caja de Té
class CajaTe implements Caja {
    private String tipo;
    private int cantidadSobres;

    public CajaTe(String tipo, int sobres) {
        this.tipo = tipo;
        this.cantidadSobres = sobres;
    }


    public int getContenido() {
        return cantidadSobres;
    }

    public void add(Caja caja) {
    }

    public void remove(Caja caja) {
    }

    @Override
    public void imprimir() {
        System.out.println("Añado una caja de " + tipo);
    }

    @Override
    public void notificar() {

    }
}
