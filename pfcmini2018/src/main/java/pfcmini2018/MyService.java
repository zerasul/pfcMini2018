package pfcmini2018;

import pfcmini2018.common.Response;


public class MyService implements IMyService{
	
	private static final String BEPRODUCTS ="PRODUCTS";
	private static final String BECLIENTS = "CLIENTS";
	private static final String BESALES = "SALES";
	private static final String BEIOT ="IOT";

	@Override
	public Response getProducts() {
		Response response = new Response();
		response.getRequest().setBackend(BEPRODUCTS);
		return response;
	}

	@Override
	public Response getClients() {
		Response response = new Response();
		response.getRequest().setBackend(BECLIENTS);
		return response;
	}

	@Override
	public Response buyProduct(String productRef, Integer quantity) {
		Response response = new Response();
		response.getRequest().setBackend(BESALES);
		return response;
	}
	
	@Override
	public Response turnOn(){
		Response response = new Response();
		response.getRequest().setBackend(BEIOT);
		response.getRequest().getParameters().put("LIGTH", "on");
		return response;
	}
	
	@Override
	public Response turnOff(){
		Response response = new Response();
		response.getRequest().setBackend(BEIOT);
		response.getRequest().getParameters().put("LIGTH", "off");
		return response;
	}
	
}
