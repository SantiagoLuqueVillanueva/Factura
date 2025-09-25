public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rojo Polo Paella Inc.");
        System.out.println("");
        System.out.println("Caretera mulle 33");
        System.out.println("37531 Ávila, Ávila");
        System.out.println();
        System.out.println();
        System.out.printf("%-24s%-22s%-17s%s", "FACTURAR A", "ENVIAR A", "Nº DE FACTURA", "ES-001\n");
        System.out.println();
        System.out.printf("%-24s%-22s%-17s%s", "Leda Villareal", "Leda Villareal", "FECHA", "29.01.2019\n");
        System.out.printf("%-24s%-22s%-17s%s", "Virgen Blanca 63", "Cercas Bajas 68", "Nº DE PEDIDO", "1730/2019\n");
        System.out.printf("%-24s%-22s%-17s%s", "08759 Burgos, Burgos", "47300 Cádiz, Cádiz", "FEECHA", "29.01.2019\n");
        System.out.printf("%57s", "VENCIMIENTO");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-58s%s\n", "Total Factura", "199,65");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        System.out.printf("%-9s%-43s%-10s%s", "CANT.", "DESCRIPCIÓN", "PRECIO", "IMPORTE\n");
        System.out.printf("%59s", "UNITARIO\n");
        System.out.println();
        System.out.printf("%-9s%-43s%-11s%s", "1", "Talla pequeña traje de luces en rojo", "100,00", "100,00\n");
        System.out.println();
        System.out.printf("%-9s%-44s%-11s%s", "2", "Mui grande churrotito", "25,00", "50,00\n");
        System.out.println();
        System.out.printf("%-9s%-45s%-10s%s", "3", "Equipaje de Fútbol", "5,00", "15,00\n");
        System.out.println();
        System.out.printf("%59s%11s", "Subtotal", "165,00\n");
        System.out.println();
        System.out.printf("%59s%10s", "IVA 21.0%", "34,65");
    }
}