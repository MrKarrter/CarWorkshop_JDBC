package uo.ri.ui.util;

import java.util.List;
import java.util.Map;

import alb.util.console.Console;

public class Printer {

	public static void printAddMechanic() {
		Console.println();
		Console.println("Nuevo mecánico añadido");
	}

	public static void printDeleteMechanic() {
		Console.println();
		Console.println("Se ha eliminado el mecánico");
	}

	public static void printListMechanics(List<Map<String, Object>> list) {
		Console.println();
		Console.println("\nListado de mecánicos\n");
		for (Map<String, Object> map : list) {
			Console.printf("\t%d %s %s\n", map.get("idMecanico"),
					map.get("nombre"), map.get("apellidos"));
		}
	}

	public static void printUpdateMechanic() {
		Console.println();
		Console.println("Mecánico actualizado");
	}

	public static void printFacturarReparaciones(Map<String, Object> map) {
		Console.println();
		Console.printf("Factura nº: %d\n", map.get("numeroFactura"));
		Console.printf("\tFecha: %1$td/%1$tm/%1$tY\n", map.get("fechaFactura"));
		Console.printf("\tTotal: %.2f €\n", map.get("totalFactura"));
		Console.printf("\tIva: %.1f %% \n", map.get("iva"));
		Console.printf("\tTotal con IVA: %.2f €\n", map.get("totalConIva"));
	}

	public static void printBonosNumeroAverias() {
		Console.println();
		Console.println("Generados los bonos por 3 averias");
	}

	public static void printBonosCantidadFacturas() {
		Console.println();
		Console.println(
				"Generados los bonos para las facturas superiores a 500€");
	}

	public static void printAddClient() {
		Console.println();
		Console.println("Nuevo cliente añadido");
	}

	public static void printDeleteClient() {
		Console.println();
		Console.println("Se ha eliminado el cliente");
	}

	public static void printDetailClient(Map<String, Object> mapa) {
		Console.println();
		Console.println("Estos son los detalles del cliente");
		Console.println("Nombre: " + mapa.get("nombre"));
		Console.println("Apellidos: " + mapa.get("apellidos"));
		Console.println("DNI: " + mapa.get("dni"));
		Console.println("Codigo Postal: " + mapa.get("zipcode"));
		Console.println("Telefono: " + mapa.get("telefono"));
		Console.println("Correo electronico: " + mapa.get("email"));
	}

	public static void printListClients(List<Map<String, Object>> list) {
		Console.println();
		Console.println("\nListado de clientes\n");
		for (Map<String, Object> mapa : list) {
			Console.println("ID: " + mapa.get("id"));
			Console.println("Nombre: " + mapa.get("nombre"));
			Console.println("Apellidos: " + mapa.get("apellidos"));
			Console.println("DNI: " + mapa.get("dni"));
			Console.println("-----------------------");
		}
	}

	public static void printListClientRecomendations(Map<String, Object> mapa) {
		Console.println("Formato: Nombre - Apellidos - ID");
		Console.println("\nListado de clientes que ha recomendado\n");
		for (Map.Entry<String, Object> dato : mapa.entrySet()) {
			Console.println(dato.getValue());
		}
	}

	public static void printUpdateClient() {
		Console.println();
		Console.println("Cliente actualizado");
	}

}
