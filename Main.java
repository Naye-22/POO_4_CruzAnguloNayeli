import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        // Polimorfismo: agregamos diferentes tipos de pedidos
        pedidos.add(new PedidoPizza("Pepe", "Piedraita", 200.0, true, "Res", new String[]{"Queso", "Jamon", "Tomate"}));
        pedidos.add(new PedidoHamburguesa("Marcos", "Olmedo", 50.0, false, "Res", true));
        pedidos.add(new PedidoPizza("Lisbeth", "9 de octubre", 170.0, true, "Gruesa", new String[]{"Pepperoni", "Queso"}));
        pedidos.add(new PedidoHamburguesa("Tomas", "Paris", 30.0, true, "Delgada", false));

        // Mostrar detalles de cada pedido
        for (Pedido pedido : pedidos) {
            pedido.mostrarDetallesEspeciales();
            System.out.println();
        }

        // Reporte final
        System.out.println("==== Todos los Pedidos ====");
        for (Pedido pedido : pedidos) {
            System.out.println("Cliente: " + pedido.getCliente() + ", Tipo: " + pedido.getTipo() + ", Delivery: " + (pedido.isDelivery() ? "Si" : "No"));
        }
    }
}
