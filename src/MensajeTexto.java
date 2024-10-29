public class MensajeTexto extends Mensajes {
    private Paquete p;
    public MensajeTexto(Paquete paquete) {
        p=paquete;
    }

    @Override
    public void notificar() {
        System.out.println("Notificación: El paquete: "+ p +" ha sido enviado");
    }

}

