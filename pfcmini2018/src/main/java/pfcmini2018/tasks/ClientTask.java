package pfcmini2018.tasks;

import java.io.IOException;

import org.mule.api.annotations.param.Payload;

import es.ual.vsuarez.clientsconnector.ClientsConnector;
import pfcmini2018.common.Response;

public class ClientTask implements Task {

	private ClientsConnector conector;
	
	public ClientTask() {
		try {
			this.conector= new ClientsConnector("http://blask.pythonanywhere.com/clients");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Response makeAction(@Payload Response response) {
		try {
			String json=this.conector.getCLients();
			response.setState("OK");
			response.setJsonresponse(json);
		} catch (IOException e) {
			String jsonerror ="{ 'error': 'Ha ocurrido un error: "+e.getMessage()+"'}";
			response.setState("KO");
			response.setJsonresponse(jsonerror);
		}
		return response;
	}

}
