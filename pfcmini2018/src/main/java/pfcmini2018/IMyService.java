package pfcmini2018;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import pfcmini2018.common.Response;

@WebService
public interface IMyService {

	@WebMethod
	public Response getProducts();
	
	@WebMethod
	public Response getClients();
	
	@WebMethod
	public Response buyProduct(String productRef, Integer quantity);

	@WebMethod
	public Response turnOn();

	@WebMethod
	public Response turnOff();
}
