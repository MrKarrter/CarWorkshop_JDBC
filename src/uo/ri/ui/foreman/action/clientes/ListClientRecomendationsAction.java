package uo.ri.ui.foreman.action.clientes;

import java.util.Map;

import alb.util.console.Console;
import alb.util.menu.Action;
import uo.ri.business.ForemanService;
import uo.ri.common.BusinessException;
import uo.ri.conf.ServicesFactory;
import uo.ri.ui.util.Printer;

/**
 * Interacción con el usuario para listar los usuarios que ha recomendado un 
 * cliente
 * 
 * @author José Antonio García García
 *
 */
public class ListClientRecomendationsAction implements Action {

	@Override
	public void execute() throws BusinessException {

		String idCliente = Console.readString("Id de cliente");

		ForemanService foremanService = ServicesFactory.getForemanService();
		Map<String, Object> recomendados = foremanService
				.listRecomendationsClient(idCliente);

		Printer.printListClientRecomendations(recomendados);
	}

}
