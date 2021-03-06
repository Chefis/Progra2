package ManejoInventario;

import java.util.Date;

public class Tester {

    public static void main(String[] args) {

        Categoria categoria = new Electrodomesticos("Electrodomesticos", "Linea blanca", true);
        Electrodomesticos electrodomesticos = new Electrodomesticos("Electrodomesticos", "Linea blanca", true);
        MueblesOficina mueblesOficina = new MueblesOficina("Muebles oficina", "Escritorio", true);
        TecnologiaInfo tecnoIfo = new TecnologiaInfo("tecnologia Informacion", "PC", true);
        Producto producto = new Producto("A21", "Refri", "2 puertas", 20, 5, 20, 20, 1500, 2000, null, electrodomesticos, true, new Date("12/03/2013"));
        Producto producto2 = new Producto("A22", "Cocina", "Electrica", 25, 5, 25, 20, 1700, 3000, null, electrodomesticos, true, new Date("15/05/2013"));

        Empresa emp = new Empresa("Equipos Nieto S.A ", " Barrio Amón ");
        Cliente cliente1 = new ClienteFisico("Leonardo Castro Moreira ", "Cartago ", 25523333);
        Cliente cliente2 = new ClienteJuridico("Maria Fernanda Quiros Mora ", "Heredia ", 29520339, "Marlon Parini Fonseca");
        Proveedor prov1 = new Proveedor("Office Depot S.A ", "25544447 ", new Date("25/04/2013"));
        Proveedor prov2 = new Proveedor("Universal ", "26634455 ", new Date("24/04/2013"));

        // electrodomesticos.agregarProducto(producto);
        //  electrodomesticos.agregarProducto(producto2);
        producto.sacarProducto(15);
        producto.agregarProducto(6);

        emp.agregarCliente(cliente1);
        emp.agregarCliente(cliente2);

        emp.agregarProveedor(prov1);
        emp.agregarProveedor(prov2);


        System.out.println(producto2.consultarProducto());
        // System.out.println(electrodomesticos.productoPorCategoria(producto));   
        System.out.println("Lista de Clientes: " + emp.ImprimirCliente());
        System.out.println("Lista de Proveedores: " + emp.ImprimirProveedor());

        OrdenCompra ord = new OrdenCompra(1, new Date("21/04/2013"), cliente2, "Estafada", "Rechazado");
        //    OrdenCompra ord = new OrdenCompra(1,new Date("21/04/2013"), cliente2, "Estafada", "Aprobado");


        System.out.println(producto.consultarProducto());
        System.out.println(producto2.consultarProducto());
        // System.out.println(electrodomesticos.productoPorCategoria(producto));   
        System.out.println("Lista de Clientes: " + emp.ImprimirCliente());
        System.out.println("Lista de Proveedores: " + emp.ImprimirProveedor());


        System.out.println(producto.consultarProducto());
        System.out.println(producto2.consultarProducto());
        // System.out.println(electrodomesticos.productoPorCategoria(producto));   
        System.out.println("Lista de Clientes: " + emp.ImprimirCliente());
        System.out.println("Lista de Proveedores: " + emp.ImprimirProveedor());

        producto.exportarProducto();


        Item item1 = new Item(1, producto, 5);
        Item item2 = new Item(2, producto2, 2);

        ord.agregarItem(item1);
        ord.agregarItem(item2);


        Factura fact = new Factura(1, new Date("21/04/2012"));


        ord.exportarOrdenCompra();

        System.out.println(ord);

        ord.exportarOrdenCompra();

        OrdenPedido orp = new OrdenPedido();
//        System.out.println(producto.consultarProducto());
//     //   System.out.println(electrodomesticos.productoPorCategoria(electrodomesticos)); no funciona bien
//        System.out.println("Lista de Clientes: " + emp.ImprimirCliente());
//        System.out.println("Lista de Proveedores: " + emp.ImprimirProveedor());

        System.out.println(ord);

        try {
            emp.listasVacias();
            categoria.listaVacia();
            ord.listaVacia();
            orp.listaVacia();
            prov1.listaVacia();
            prov2.listaVacia();
        } catch (ArreglosException ae) {
            System.out.println(ae);
        } finally {
            System.out.println("\n\tNIETOS.SA");
        }

        try {
            producto.ProductosAgotados();
        } catch (AgotadosException no) {
            System.out.println(no);
        }

        try {
            electrodomesticos.errorI();
            tecnoIfo.errorI();
            mueblesOficina.errorI();
        } catch (ErrorImpuesto ei) {
            System.out.println(ei);
        }


        try {
            mueblesOficina.errorD();
        } catch (ErrorDescuento ed) {
            System.out.println(ed);
        }

        try {
            producto.noPertenece(categoria, categoria, categoria);
        } catch (NoCategoria nc) {
            System.out.println(nc);

            try {
                ord.listaMenorUno();
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            }
        }
    }
}
