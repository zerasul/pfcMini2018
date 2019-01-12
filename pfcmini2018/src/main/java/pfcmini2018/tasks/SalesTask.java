package pfcmini2018.tasks;

import java.io.IOException;

import es.ual.vsuarez.salesconnector.SalesConnector;
import pfcmini2018.common.Response;

public class SalesTask implements Task {

	private SalesConnector conector;
	
	public SalesTask() {
	 this.conector= new SalesConnector("http://blask.pythonanywhere.com/sales");
	}
	@Override
	public Response makeAction(Response response) {
		try {
			String ref = (String) response.getRequest().getParameters().get("REF");
			String quantity = (String) response.getRequest().getParameters().get("QUANTITY");
			String json= this.conector.createSale(ref, Integer.parseInt(quantity));
			response.setState("OK");
			response.setJsonresponse(json);
		
		} catch (IOException e) {
			String errorjson="{'error':'Ha ocurrido un error: "+e.getMessage()+"'}";
			response.setState("KO");
			response.setJsonresponse(errorjson);
		}
		return response;
	}

}
