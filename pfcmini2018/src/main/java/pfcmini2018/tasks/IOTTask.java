package pfcmini2018.tasks;

import es.ual.vsuarez.iotconnector.IotConnector;
import pfcmini2018.common.Response;

public class IOTTask implements Task {

	private IotConnector connector;
	
	@Override
	public Response makeAction(Response response) {
		connector = new IotConnector("http://blask.pythonanywhere.com/");
		String sufix = (String) response.getRequest().getParameters().get("LIGTH");
		String resp = connector.turnOnOff(sufix);
		response.setJsonresponse(resp);
		return response;
	}

}
