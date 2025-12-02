public class PedidoHamburguesa extends Pedido {
    private String tipoCarne;
    private boolean conQueso;

    public PedidoHamburguesa(String cliente, String direccion, double precioBase, boolean delivery, String tipoCarne, boolean conQueso) {
        super(cliente, direccion, precioBase, TipoComida.HAMBURGUESA, delivery);
        this.tipoCarne = tipoCarne;
        this.conQueso = conQueso;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public boolean isConQueso() {
        return conQueso;
    }

    @Override
    public void mostrarDetallesEspeciales() {
        System.out.println("Detalles del Pedido de Hamburguesa");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Precio Base: $" + getPrecioBase());
        System.out.println("Tipo de Carne: " + tipoCarne);
        System.out.println("Con Queso: " + (conQueso ? "Si" : "No"));
        System.out.println("Delivery: " + (isDelivery() ? "Si" : "No"));
    }

    @Override
    public double calcularCostoTotal() {
        double costo = getPrecioBase();
        if (isDelivery()) {
            costo += 2.80;
        }
        return costo;
    }

    @Override
    public void mostrarResumenPedido() {
        System.out.println("Resumen Hamburguesa: " + getCliente() + " - $" + calcularCostoTotal());
    }

    @Override
    public int estimarTiempoEntrega() {
        int tiempo = 15;
        if (isDelivery()) {
            tiempo += 10;
        }
        return tiempo;
    }
}
