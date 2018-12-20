package pfcmini2018.tasks;

import java.io.IOException;

import es.ual.vsuarez.productconnector.ProductConnector;
import pfcmini2018.common.Response;

public class ProductsTask implements Task {

	private ProductConnector connector;
	
	public ProductsTask() {
		this.connector= new ProductConnector("http://192.168.4.1:8081/products");
	}

	@Override
	public Response makeAction(Response response) {
		try {
			String jsonproducts = this.connector.getProducts();
			response.setState("OK");
			response.setJsonresponse(jsonproducts);
		} catch (IOException e) {
			response.setState("KO");
			response.setJsonresponse("{'error':'Ha ocurrido un error: "+e.getMessage()+"'}");
		}
		
		return response;
	}
	
}
