public class PedidoPizza extends Pedido {
    private String tipoMasa;
    private String[] ingredientes;

    public PedidoPizza(String cliente, String direccion, double precioBase, boolean delivery, String tipoMasa, String[] ingredientes) {
        super(cliente, direccion, precioBase, TipoComida.PIZZA, delivery);
        this.tipoMasa = tipoMasa;
        this.ingredientes = ingredientes;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    @Override
    public void mostrarDetallesEspeciales() {
        System.out.println("--- Detalles del Pedido de Pizza ---");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Precio Base: $" + getPrecioBase());
        System.out.println("Tipo de Masa: " + tipoMasa);
        System.out.print("Ingredientes: ");
        for (String ing : ingredientes) {
            System.out.print(ing + " ");
        }
        System.out.println();
        System.out.println("Delivery: " + (isDelivery() ? "Sí" : "No"));
    }

    @Override
    public double calcularCostoTotal() {
        double costo = getPrecioBase();
        if (isDelivery()) {
            costo += 3.50;
        }
        return costo;
    }

    @Override
    public void mostrarResumenPedido() {
        System.out.println("Resumen Pizza: " + getCliente() + " - $" + calcularCostoTotal());
    }

    @Override
    public int estimarTiempoEntrega() {
        int tiempo = 25;
        if (isDelivery()) {
            tiempo += 10;
        }
        return tiempo;
    }
}
